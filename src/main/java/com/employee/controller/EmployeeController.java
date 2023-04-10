package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.entity.EmployeeEntity;
import com.employee.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {
	@Autowired
	private EmpService eservice;
	
	public EmployeeController(EmpService eservice) {
		super();
		this.eservice = eservice;
	}
	@GetMapping("/")
	public String homepage(Model m) {	
		List<EmployeeEntity> emp=eservice.getAllEmployee();
		m.addAttribute("emp",emp);
		return "index";
	}
	@GetMapping("/addemp")
	public String addemp() {
		
		return "addemp";
	}
	@PostMapping("/register")
	public String empregister(@ModelAttribute EmployeeEntity employee) {
	System.out.println(employee);
		eservice.addemp(employee);
		
		return "redirect:/";
	}
@GetMapping("/edit/{id}")	
public String editpage(@PathVariable int id,Model m) {	
	EmployeeEntity e=eservice.getEmpById(id);
	m.addAttribute("emp",e);
		return "edit";
	}
@PostMapping("/update")
public String updateemployee(@ModelAttribute EmployeeEntity employee) {
	
	eservice.addemp(employee);
	
	return "redirect:/";
}
@GetMapping("/delete/{id}")
public String deleteemployeebyid(@PathVariable int id) {
	eservice.deleteemployeebyid(id);
	return "redirect:/";
}
	
}
