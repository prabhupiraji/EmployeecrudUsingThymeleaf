package com.employee.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empmanagement")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String phoneno;
	private String email;
	private String adress;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email
				+ ", adress=" + adress + ", salary=" + salary + "]";
	}
	public EmployeeEntity() {
		super();
	}
	public EmployeeEntity(int id, String name, String phonenno, String email, String adress, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.adress = adress;
		this.salary = salary;
	}
	
	
	
}
