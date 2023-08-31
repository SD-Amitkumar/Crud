package com.StudentManagemnetSoftware.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Column(name = "First_name" , nullable = false)
	private String firstName;
	@Column(name = "Last_name" , nullable = false)
	private String lastName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "primary id ")
	private int id;
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", email=" + email + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String firstName, String lastName,  String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name = "Email")
	private String email;

}
