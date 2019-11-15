package com.stmark.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ApplicationConfig {

	@Id
	private String id;
	
	private String lastRefeneceNumber;
	private String code;
	
	public ApplicationConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastRefeneceNumber() {
		return lastRefeneceNumber;
	}

	public void setLastRefeneceNumber(String lastRefeneceNumber) {
		this.lastRefeneceNumber = lastRefeneceNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
