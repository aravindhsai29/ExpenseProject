package com.example.codengine.Expense.controller;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.codengine.Expense.model.Category;
import com.example.codengine.Expense.repository.CategoryRepository;




@RestController
@RequestMapping("/api")
public class CategoryController 
{
public CategoryRepository categoryRepository;

public CategoryController(CategoryRepository categoryRepository) 
{ 
	super();
	this.categoryRepository = categoryRepository;
}

@GetMapping("/categories")
public Collection<Category> categories()
{
	return categoryRepository.findAll(); 
	
}
@GetMapping("/category/{id}")
ResponseEntity<?> getCategory(@PathVariable Long id)
{
	Optional<Category> category = categoryRepository.findById(id);
	return category.map(response -> ResponseEntity.ok().body(response)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
}

@PostMapping("/category")
ResponseEntity<Category> createCategory(@Validated @RequestBody Category category) throws URISyntaxException
{
	Category result = categoryRepository.save(category);
	return ResponseEntity.created(new java.net.URI("/api/category" + result.getId())).body(result);
}

@PutMapping("/category/{id}")
ResponseEntity<Category> updateCategory(@Validated @RequestBody Category category)
{   Category result = categoryRepository.save(category); 
	return ResponseEntity.ok().body(result);
}

@DeleteMapping("/category/{id}")
ResponseEntity<?> deleteCategory(@PathVariable Long id)
{
	categoryRepository.deleteById(id);
	return ResponseEntity.ok().build();
}
}
 