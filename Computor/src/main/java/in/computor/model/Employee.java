package in.computor.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="eployees")
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "first_name")
private String firstname;

@Column(name = "last_name")
private String lastname;

@Column(name = "email_id")
private String emailID;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public Employee() {
}
public Employee(long id, String firstname, String lastname, String emailID) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailID = emailID;
}
}
