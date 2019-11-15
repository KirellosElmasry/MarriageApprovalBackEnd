package com.stmark.controller.dto;

import org.springframework.web.multipart.MultipartFile;

public class DTO {

	private MultipartFile  base64Image;
	private String refNum;
	private String configName;
	private String configValue;	
	
		
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getConfigValue() {
		return configValue;
	}
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	public MultipartFile  getBase64Image() {
		return base64Image;
	}
	public void setBase64Image(MultipartFile  base64Image) {
		this.base64Image = base64Image;
	}
	public String getRefNum() {
		return refNum;
	}
	public void setRefNum(String refNum) {
		this.refNum = refNum;
	}
	@Override
	public String toString() {
		return "DTO [base64Image=" + base64Image + ", refNum=" + refNum + "]";
	}
	
}
