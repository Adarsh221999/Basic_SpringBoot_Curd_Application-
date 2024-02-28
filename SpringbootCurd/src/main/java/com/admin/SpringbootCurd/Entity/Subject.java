package com.admin.SpringbootCurd.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")

public class Subject {
	
	
	@Id
	private String id;
	private String name;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Subject() {
		super();
		
	}

}
