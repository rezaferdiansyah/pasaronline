package net.rf.pasaronlinebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.rf.pasaronlinebackend.dao.CategoryDAO;
import net.rf.pasaronlinebackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//Kategori 1
		category.setId(1);
		category.setName("Komputer");
		category.setDescription("Jenis-jenis komputer");
		category.setImageURL("IMG_1.png");
		
		categories.add(category);
		
		//Kategori 2
		category = new Category();
		category.setId(2);
		category.setName("Handphone");
		category.setDescription("Jenis-jenis Handphone");
		category.setImageURL("IMG_2.png");
		
		categories.add(category);
		
		//Kategori 3
		category = new Category();
		category.setId(3);
		category.setName("Elektronik");
		category.setDescription("Jenis-jenis Barang Elektronik");
		category.setImageURL("IMG_3.png");
		
		categories.add(category);
		
		//Kategori 4
		category = new Category();
		category.setId(4);
		category.setName("Rumah-Tangga");
		category.setDescription("Jenis-jenis Barang Rumah Tangga");
		category.setImageURL("IMG_4.png");
		
		categories.add(category);
		
		//Kategori 5
				category = new Category();
				category.setId(5);
				category.setName("Pakaian");
				category.setDescription("Jenis-jenis Pakaian");
				category.setImageURL("IMG_5.png");
				
				categories.add(category);
				
				
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		
		return null;
	}

	
}
