package net.sjb.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.sjb.shoppingbackend.dao.CategoryDAO;
import net.sjb.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories= new ArrayList<>();
	static {
		Category category= new Category();
		
		//adding categories
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is a category for televisions");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		
		category.setId(2);
		category.setName("Mobile Phone");
		category.setDescription("this is a category for Mobile Phone");
		category.setImageUrl("CAT_2.png");
		categories.add(category);
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is a category for Laptop");
		category.setImageUrl("CAT_3.png");
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null; 
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub//enhance for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}return null;
	}

}
