package com.hibernate.project.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table (name = "StudentDetails", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "ContactNumber")
})

public class StudentEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4396883385722914301L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", unique=true, nullable= false)
	private int id;
	
	@Column(name="FirstName", unique=false, nullable=false, length = 100)
	private String firstName;
	
	@Column(name="LastName", unique=false, nullable=false, length = 100)
	private String lastName;
	
	@Column(name="Age", unique=false, nullable=true, length=100)
	private Integer age;
	
	@Column(name="ContactNumber", unique=true, nullable=false)
	private String contactNumber;
	
	public StudentEntity(String fname, String lname, Integer age, String contactNumber) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
		
	
}
