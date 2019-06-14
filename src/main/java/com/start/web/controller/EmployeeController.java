package com.start.web.controller;

import com.start.web.dao.DepartmentDao;
import com.start.web.dao.EmployeeDao;
import com.start.web.entities.Department;
import com.start.web.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeedao;
    @Autowired
    DepartmentDao departmentDao;
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employee=employeedao.getAll();
        model.addAttribute("emps",employee);
        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments=departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String addEmp(Employee employee){
//        Collection<Department> departments=departmentDao.getDepartments();
//       model.addAttribute("depts",departments);
        System.out.println("员工信息"+employee.toString());
        employeedao.save(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Collection<Department> departments=departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        Employee emp=employeedao.get(id);
        model.addAttribute("emp",emp);
    return "emp/add";
    }
    //员工修改
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
     System.out.println("修改"+employee);
        employeedao.save(employee);
     return "redirect:/emps";
    }
    @DeleteMapping("/emp/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        employeedao.delete(id);
        return "redirect:/emps";
    }
}
