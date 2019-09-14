package com.stmark.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SecondClearance {

	@Id
	private String id;
	private String referenceNumber;
	private String engageDocNumber;
	private Date secondClearanceDate;
	private Date createdDate;
	private Date lastModified;
	
	public SecondClearance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getEngageDocNumber() {
		return engageDocNumber;
	}

	public void setEngageDocNumber(String engageDocNumber) {
		this.engageDocNumber = engageDocNumber;
	}

	public Date getSecondClearanceDate() {
		return secondClearanceDate;
	}

	public void setSecondClearanceDate(Date secondClearanceDate) {
		this.secondClearanceDate = secondClearanceDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "SecondClearance [id=" + id + ", referenceNumber=" + referenceNumber + ", engageDocNumber="
				+ engageDocNumber + ", secondClearanceDate=" + secondClearanceDate + ", createdDate=" + createdDate
				+ ", lastModified=" + lastModified + "]";
	}
}
