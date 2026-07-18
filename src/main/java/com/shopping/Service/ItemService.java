package com.shopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Repository.ItemRepository;
import com.shopping.entity.Item;

@Service
public class ItemService {
	
    @Autowired
	private ItemRepository repo;
	
	public List<Item> getAllItems()
	{
		return repo.findAll();
	}
	
	public void save(Item item)
	{
		repo.save(item);
	}
	
	public Item getById(Long id) {
		return repo.findById(id).orElse(null);
		
	}
	
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
	
	
	

}
