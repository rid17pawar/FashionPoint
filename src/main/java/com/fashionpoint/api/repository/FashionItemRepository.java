package com.fashionpoint.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fashionpoint.api.model.FashionItem;

@Repository
public interface FashionItemRepository extends MongoRepository<FashionItem, Integer>{
}
