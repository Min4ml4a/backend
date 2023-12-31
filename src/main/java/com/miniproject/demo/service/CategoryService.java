package com.miniproject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.demo.model.Category;
import com.miniproject.demo.repository.CategoryRepo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

	private final CategoryRepo categoryrepo;

	public CategoryService(CategoryRepo categoryrepository) {
		this.categoryrepo = categoryrepository;
	}

	public List<Category> listCategories() {
		return categoryrepo.findAll();
	}

	public void createCategory(Category category) {
		categoryrepo.save(category);
	}

	public Category readCategory(String categoryName) {
		return categoryrepo.findByCategoryName(categoryName);
	}

	public Optional<Category> readCategory(Integer categoryId) {
		return categoryrepo.findById(categoryId);
	}

	public void updateCategory(Integer categoryID, Category newCategory) {
		Category category = categoryrepo.findById(categoryID).get();
		category.setCategoryName(newCategory.getCategoryName());
		category.setDescription(newCategory.getDescription());
		category.setProducts(newCategory.getProducts());
		category.setImageUrl(newCategory.getImageUrl());

		categoryrepo.save(category);
	}
}