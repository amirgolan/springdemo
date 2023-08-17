package com.ag.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class UserInfo{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull(message="Name is required")
	@Size(max=100, message="Name cannot be more than 100 characters long")
	private String name;
	
	@Max(122)
	private int age;
	
	@NotNull(message="Title is required")
	@Size(max=100, message="Title cannot be more than 100 characters long")
	private String title;
	
	@Size(max=100, message="Hometown cannot be more than 100 characters long")
	private String hometown;
	
	// constructors
	
	public UserInfo() {
		
	}
	
	public UserInfo(String name,int age, String title, String hometown) {
		this.name=name;
		this.age=age;
		this.title=title;
		this.hometown=hometown;
		
	}
	
	
	// getters - setters
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
			
			this.name=name;
	}
	
	public int getAge() {
			
			return age;
		}
	
	public void setAge(int age) {
			
			this.age=age;
	}
	
	public String getTitle() {
		
		return title;
	}
	
	public void setTitle(String title) {
			
			this.title=title;
	}
	
	public String getHometown() {
			
			return hometown;
	}
	
	public void setHometown(String hometown) {
			
			this.hometown=hometown;
	}
	
	
	

}
