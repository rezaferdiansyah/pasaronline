package net.rf.pasaronlinebackend.dao;

import java.util.List;

import net.rf.pasaronlinebackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);

	
	

}
