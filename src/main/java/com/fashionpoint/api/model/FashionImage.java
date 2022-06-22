package com.fashionpoint.api.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ItemImages")
public class FashionImage {
	@Id
	private int image_id;
	
	private String image_name;
	private Binary image_data;
	
	
	public FashionImage(int image_id, String image_name, Binary image_data) {
		super();
		this.image_id = image_id;
		this.image_name = image_name;
		this.image_data = image_data;
	}
	
	
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public Binary getImage_data() {
		return image_data;
	}
	public void setImage_data(Binary image_data) {
		this.image_data = image_data;
	}
	
	
	@Override
	public String toString() {
		return "FashionImage [image_id=" + image_id + ", image_name=" + image_name + ", image_data=" + image_data + "]";
	}

}
