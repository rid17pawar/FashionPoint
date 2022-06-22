package com.fashionpoint.api;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fashionpoint.api.model.FashionImage;
import com.fashionpoint.api.model.FashionItem;
import com.fashionpoint.api.model.Message;
import com.fashionpoint.api.repository.FashionImageRepository;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FashionImageController {
		
	@Autowired
	FashionImageRepository fashionImageRepository;
	
	//post request should send data in a form format
	@PostMapping("/image/add")
	public int addImage(
			@RequestParam("img_id") int image_id, 
			@RequestParam("img_name") String image_name, 
			@RequestParam("image") MultipartFile image
		) 
	  throws IOException {
		FashionImage image_obj = new FashionImage(image_id, image_name, null); 
		
		image_obj.setImage_data(
          new Binary(BsonBinarySubType.BINARY, image.getBytes())
          ); 
		
		image_obj = fashionImageRepository.insert(image_obj); 
		
	    return image_obj.getImage_id();
	}

	
	@GetMapping("/image/{id}")
	public Message getImage(@PathVariable int id, Model model) {
	    FashionImage image = fashionImageRepository.findById(id).get();
	    model.addAttribute("img_id", image.getImage_id());
	    model.addAttribute("img_name", image.getImage_name());
	    model.addAttribute("image", 
	      Base64.getEncoder().encodeToString(image.getImage_data().getData())
	    );

	    return new Message( "Retrieval", "retrieval successful", id);
	}
	
	
	@GetMapping("/image/test/{id}")
	public Message demo(@PathVariable int id) {
		return new Message( "Retrieval", "retrieval successful", id);
	}
	
}
