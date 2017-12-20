package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static{
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("description");
		category.setImageURL("image URL");
		
		
		categories.add(category);
		
		
		category = new Category();
		
		category.setId(2);
		category.setName("TV");
		category.setDescription("descriptionTV");
		category.setImageURL("image TV URL");
		
		
		categories.add(category);
		
		category = new Category();
		
		category.setId(3);
		category.setName("sdcdfasdasds");
		category.setDescription("descriptidsdfdsfonTV");
		category.setImageURL("imaasdasfsage TV URL");
		
		
		categories.add(category);
		
		
		
	}
	
	
	
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}





	@Override
	public Category get(int id) {


		for(Category category : categories){
			
			if(category.getId() == id) return category;
		}
		return null;
	}

}
