package com.example.codengine.Expense.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codengine.Expense.model.Category;

public interface CategoryRepository  extends JpaRepository<Category,Long> {
	Category findByName(String name);
}
