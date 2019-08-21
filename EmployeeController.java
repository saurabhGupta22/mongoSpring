package com.example.employeeMongo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Employees")
public class EmployeeController {

	@Autowired
    private employeeService employeeService;
	private EmployeeRepo employeeRepo;
	

	public EmployeeController(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	
	
	 @PostMapping("/add")
	    public String createEmployee(
	            @RequestParam("name") String name,
	            @RequestParam("departments") String departments,
	            @RequestParam("manager") String manager,
	            @RequestParam("age")int age,
	            @RequestParam("salary")int salary
	            ) {
	        return employeeService.createEmployee(name,departments,manager,age,salary);
	    }

	/* @GetMapping("/list")
	 public List<?> listEmployee(){
	        return employeeService.listEmployee();
	    }
	*/
	 
		@GetMapping("/all")
		public List<Employee> getAll()
		{
			List<Employee> employees = this.employeeRepo.findAll();
			return employees;
		}
		
		
	@PostMapping
	public void update(@RequestBody Employee employee)
	{
		this.employeeRepo.save(employee); 
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		this.employeeRepo.deleteById(id);
	}

	 

}