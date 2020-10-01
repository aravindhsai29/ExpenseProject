package com.example.codengine.Expense.model;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// to build table
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "user")
public class User {
	 @Id
	 public Long id;
	  
	  
	 public String name;



	 public String email;
	 
	 //@OneToMany
	 //private Set<Category> category;


}
