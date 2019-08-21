package com.example.employeeMongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Employee Id, Name, Departments, Reporting Manager, Age, Salary


@Service
public class employeeService {
	
    @Autowired
    private  EmployeeRepo employeeRepo;

    public String createEmployee(String name, String departments, String manager, int age,int salary){
        Employee employee = new Employee(
        		name,
        		departments,
        		manager,
        		age,
        		salary
        );
        employeeRepo.save(employee);
        return ("New user created with ID: "+ employee.getId());
    }

    public List<Employee> listEmployee(){
        return employeeRepo.findAll();
    }
}
