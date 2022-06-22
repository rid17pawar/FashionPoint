package com.fashionpoint.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FashionItems")
public class FashionItem {
	
	@Id
	private int image_id;
	
	private String gender;
	private String category;
	private String sub_category;
	private String base_colour;
	private String season;
	private int year;
	private String usage;
	private String description;
		
	
	public FashionItem(int image_id, String gender, String category, String sub_category, String base_colour,
			String season, int year, String usage, String description) {
		super();
		this.image_id = image_id;
		this.gender = gender;
		this.category = category;
		this.sub_category = sub_category;
		this.base_colour = base_colour;
		this.season = season;
		this.year = year;
		this.usage = usage;
		this.description = description;
	}
	
	
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSub_category() {
		return sub_category;
	}
	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}
	public String getBase_colour() {
		return base_colour;
	}
	public void setBase_colour(String base_colour) {
		this.base_colour = base_colour;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "FashionItem [image_id=" + image_id + ", gender=" + gender + ", category=" + category + ", sub_category="
				+ sub_category + ", base_colour=" + base_colour + ", season=" + season + ", year=" + year + ", usage="
				+ usage + ", description=" + description + "]";
	}
	
}
