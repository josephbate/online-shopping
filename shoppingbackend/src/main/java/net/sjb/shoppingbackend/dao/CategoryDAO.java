package net.sjb.shoppingbackend.dao;

import java.util.List;

import net.sjb.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();

	Category get(int id);

}
