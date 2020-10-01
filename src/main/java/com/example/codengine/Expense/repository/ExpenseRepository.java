package com.example.codengine.Expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codengine.Expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long>{

	 
}
