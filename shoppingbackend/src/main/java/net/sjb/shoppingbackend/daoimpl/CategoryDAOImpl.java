package net.sjb.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.sjb.shoppingbackend.dao.CategoryDAO;
import net.sjb.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory session;
	
	private static List<Category> categories= new ArrayList<>();
	static {
		Category category= new Category();
		
		//adding 1st category
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is a category for televisions");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		
		//adding 2nd category
		category= new Category();
		category.setId(2);
		category.setName("Mobile Phone");
		category.setDescription("this is a category for Mobile Phone");
		category.setImageUrl("CAT_2.png");
		categories.add(category);
		
		//adding 3rd category
		category= new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is a category for Laptop");
		category.setImageUrl("CAT_3.png");
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories; 
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub//enhance for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		
		return null;
	}

	@Override
	public boolean add(Category category) {
		try {
			 session.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	
	}

}
