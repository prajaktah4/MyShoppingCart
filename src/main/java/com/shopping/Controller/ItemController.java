package com.shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shopping.Service.ItemService;
import com.shopping.entity.Item;

@Controller
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping("/")
	public String home(Model model)
	{
		model.addAttribute("items",service.getAllItems());
		return "cart";
	}
	
	@GetMapping("/add")
	public String addForm(Model model)
	{
		model.addAttribute("item",new Item()); 
		return "add-item";
		
	}
	
	
	//save 
	@PostMapping("/save")
	public String save(@ModelAttribute Item item) {
		service.save(item);
		return "redirect:/";
	}
	
	
	//delete item
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id)
	{
		service.delete(id);
		return "redirect:/";
		
	}
	
	//edit item 
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id,Model model)
	{
		model.addAttribute("item",service.getById(id));
		return "edit-item";	
		
	}
	
	
	@PostMapping("/update")
	public String update(@ModelAttribute Item item)
	{
		service.save(item);
		return "redirect:/";
		
	}
	
	
	
}
