package com.example.employeeMongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String> {

}
