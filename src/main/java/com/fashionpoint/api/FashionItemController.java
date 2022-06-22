package com.fashionpoint.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashionpoint.api.model.FashionItem;
import com.fashionpoint.api.model.Message;
import com.fashionpoint.api.repository.FashionItemRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FashionItemController {

	@Autowired
	private FashionItemRepository fashionItemRepository;
		
	
	//post request should send data in a raw json format
	@PostMapping("/item")
	public Message addFashionItem(@RequestBody FashionItem fashionItem) {
		fashionItemRepository.save(fashionItem);
		return new Message( "Insertion", "insertion successful", fashionItem.getImage_id());		
	}
	
	@GetMapping("/items")
	public List<FashionItem> getAllItems(){
		return fashionItemRepository.findAll();
	}
	
	@GetMapping("/item/{id}")
	public Optional<FashionItem> getItem(@PathVariable int id){
		return fashionItemRepository.findById(id);
	}
	
	@PutMapping("/item")
	public Message setItem(@RequestBody FashionItem fashionItem) {
		//update or save object
		fashionItemRepository.save(fashionItem);
		return new Message( "Updation", "updation successful", fashionItem.getImage_id());		
	}
	
	@DeleteMapping("/item/{id}")
	public Message delItem(@PathVariable int id){
		fashionItemRepository.deleteById(id);
		return new Message( "Delete", "deletion successful", id);
	}

}
