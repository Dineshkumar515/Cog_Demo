package com.example.demo.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Creating an entity Employee
@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private final String firstName;
	private final String lastName;
	private final String email;

	public Employee() {
		this.firstName = "";
		this.lastName ="";
		this.email = "";

		 
	}

	public Employee(String firstName, String lastName, String email)
	{
	super();
	this.firstName=firstName;
	this.lastName=lastName;
	this.email=email;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}
	

	public String getFirstName()
	{

		return firstName;
	}

	public String getLastName()
	{

		return lastName;
	}

	public String getEmail()
	{

		return email;
	}
}
