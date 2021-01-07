package net.sjb.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.sjb.shoppingbackend.dao.CategoryDAO;
import net.sjb.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init() {
		context= new AnnotationConfigApplicationContext();
		context.scan("net.sjb.shoppingbackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		category= new Category();
		category.setName("Television");
		category.setDescription("this is a category for televisions");
		category.setImageUrl("CAT_1.png");
		assertEquals("Successfully add a category in a table", true, categoryDAO.add(category));
	}
	

}
