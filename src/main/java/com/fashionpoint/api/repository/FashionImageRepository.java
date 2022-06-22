package com.fashionpoint.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fashionpoint.api.model.FashionImage;

public interface FashionImageRepository extends MongoRepository<FashionImage, Integer>{

}
