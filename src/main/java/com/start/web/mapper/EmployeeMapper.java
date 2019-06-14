package com.start.web.mapper;

import com.start.web.entities.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public  void insertEmp(Employee employee);
}
