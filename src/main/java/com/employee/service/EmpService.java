package com.employee.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmpRepository;
@Service
public class EmpService {
	@Autowired
private EmpRepository repo;
	
public EmpService(EmpRepository repo) {
		super();
		this.repo = repo;
	}

public void addemp(EmployeeEntity employee) {
	repo.save(employee);
}
public List <EmployeeEntity> getAllEmployee(){
	return repo.findAll();
}


public EmployeeEntity getEmpById(int id) {
	// TODO Auto-generated method stub
	return repo.getById(id);
}

public void deleteemployeebyid(int id) {
	repo.deleteById(id);
}



}
