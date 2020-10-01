package com.example.codengine.Expense.model;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="expense")
public class Expense {
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	public Long id;
	
	public Instant expensedate;
	
	
	
	public String description;
	
	public String location; 
	
	@ManyToOne
	public Category category;
	
	
	@JsonIgnore
	@ManyToOne
	public User user;
	
	public Expense(Long id, Instant expensedate, String description, String location, Category category, User user) {
		super();
		this.id = id;
		this.expensedate = expensedate;
		this.description = description;
		this.location = location;
		this.category = category;
		this.user = user;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Instant getExpensedate() {
		return expensedate;
	}


	public void setExpensedate(Instant expensedate) {
		this.expensedate = expensedate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	
}
