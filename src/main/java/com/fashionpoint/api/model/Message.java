package com.fashionpoint.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

public class Message {
	
	private String operationPerformed;
	private String description;
	private int objectId;
	
	public Message(String operationPerformed, String description, int objectId) {
		super();
		this.operationPerformed = operationPerformed;
		this.description = description;
		this.objectId = objectId;
	}
	
	
	public String getOperationPerformed() {
		return operationPerformed;
	}
	public void setOperationPerformed(String operationPerformed) {
		this.operationPerformed = operationPerformed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}
	
	
	@Override
	public String toString() {
		return "Message [operationPerformed=" + operationPerformed + ", description=" + description + ", objectId="+ objectId +"]";
	}
	
}
