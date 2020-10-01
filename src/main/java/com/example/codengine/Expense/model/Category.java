package com.example.codengine.Expense.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Entity
@Data
@Table(name = "category")
public class Category {
	@Id
	public Long id;

    @NonNull
	public String name;

	//@ManyToOne(cascade=CascadeType.PERSIST)
	//private User user;
	 
}
