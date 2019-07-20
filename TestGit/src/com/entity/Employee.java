package com.entity;

import java.util.Date;

public class Employee {
     
    private Long id;
    private String name;
    private String password;
    private String email;
    //private String title;
    //private Date created;
     
    public Long getId() {
        return id;
    }
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(Long id) {
        this.id = id;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     /*
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
     
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
     
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }*/
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
}