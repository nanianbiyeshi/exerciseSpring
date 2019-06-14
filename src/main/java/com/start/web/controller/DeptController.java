package com.start.web.controller;

import com.start.web.entities.Department;
import com.start.web.entities.Employee;
import com.start.web.mapper.DepartmentMapper;
import com.start.web.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return  departmentMapper.getDeptById(id);

    }
    @GetMapping("/dept")
    public Department inserDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }
    @GetMapping("/empts/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return  employeeMapper.getEmpById(id);

    }
    @GetMapping("/empts")
    public Employee inserDept(Employee employee){
        employeeMapper.insertEmp(employee);
        return  employee;
    }

}
