package com.stmark.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	@Id
	private String id;
	private String name;
	private String maritalState;
	private Date createdDate;
	private Date lastModified;
	private String emirateId;
	private String church;
	private Date birthDate;
	private String placeOfBirth;
	private Date baptismDate;
	private String placeOfBaptism;
	private String edQualification;
	private String address;
	private String jobTitle;
	private String jobAddress;
	private String militaryStatus;
	private String relatedChurch;
	private String confessoPriest;
	private String confessorChurch;
	private String confessionRate;
	private String eucharistRate;
	private String foreignCountryName;
	private Date foreignCountryDate;
	private String familyLinks;
	private String engagedBefore;
	private String marriedOutside;
	private String marriedInside;
	private String churchMarriage;
	private String marriagePlace;
	private String marriagePriest;
	private String civilMarriage;
	private Date civilMarriageDate;
	private String maritalStatus;
	private Date widowhoodDate;
	private String marriedBeforeWidowhood;
	private String marriageBeforeWidowhoodInfo;
	private String divorced;
	private String court;
	private String caseNum;
	private Date caseDate;
	private String marriageApprovalSource;
	private Date marriageApprovalDate;
	private String childsNum;
	private String childAge;
	private String childsBiptesm;
	private String familyRelation;
	private String referenceNumber;
	private String hasSecondClearance;
	private String marriageType;
	private String marriedBefore;
	
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

	public String getChurch() {
		return church;
	}

	public void setChurch(String church) {
		this.church = church;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public Date getBaptismDate() {
		return baptismDate;
	}

	public void setBaptismDate(Date baptismDate) {
		this.baptismDate = baptismDate;
	}

	public String getPlaceOfBaptism() {
		return placeOfBaptism;
	}

	public void setPlaceOfBaptism(String placeOfBaptism) {
		this.placeOfBaptism = placeOfBaptism;
	}

	public String getEdQualification() {
		return edQualification;
	}

	public void setEdQualification(String edQualification) {
		this.edQualification = edQualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobAddress() {
		return jobAddress;
	}

	public void setJobAddress(String jobAddress) {
		this.jobAddress = jobAddress;
	}

	public String getMilitaryStatus() {
		return militaryStatus;
	}

	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
	}

	public String getRelatedChurch() {
		return relatedChurch;
	}

	public void setRelatedChurch(String relatedChurch) {
		this.relatedChurch = relatedChurch;
	}

	public String getConfessoPriest() {
		return confessoPriest;
	}

	public void setConfessoPriest(String confessoPriest) {
		this.confessoPriest = confessoPriest;
	}

	public String getConfessorChurch() {
		return confessorChurch;
	}

	public void setConfessorChurch(String confessorChurch) {
		this.confessorChurch = confessorChurch;
	}

	public String getConfessionRate() {
		return confessionRate;
	}

	public void setConfessionRate(String confessionRate) {
		this.confessionRate = confessionRate;
	}

	public String getEucharistRate() {
		return eucharistRate;
	}

	public void setEucharistRate(String eucharistRate) {
		this.eucharistRate = eucharistRate;
	}

	public String getForeignCountryName() {
		return foreignCountryName;
	}

	public void setForeignCountryName(String foreignCountryName) {
		this.foreignCountryName = foreignCountryName;
	}

	public Date getForeignCountryDate() {
		return foreignCountryDate;
	}

	public void setForeignCountryDate(Date foreignCountryDate) {
		this.foreignCountryDate = foreignCountryDate;
	}

	public String getFamilyLinks() {
		return familyLinks;
	}

	public void setFamilyLinks(String familyLinks) {
		this.familyLinks = familyLinks;
	}

	public String getEngagedBefore() {
		return engagedBefore;
	}

	public void setEngagedBefore(String engagedBefore) {
		this.engagedBefore = engagedBefore;
	}

	public String getMarriedOutside() {
		return marriedOutside;
	}

	public void setMarriedOutside(String marriedOutside) {
		this.marriedOutside = marriedOutside;
	}

	public String getMarriedInside() {
		return marriedInside;
	}

	public void setMarriedInside(String marriedInside) {
		this.marriedInside = marriedInside;
	}

	public String getChurchMarriage() {
		return churchMarriage;
	}

	public void setChurchMarriage(String churchMarriage) {
		this.churchMarriage = churchMarriage;
	}

	public String getMarriagePlace() {
		return marriagePlace;
	}

	public void setMarriagePlace(String marriagePlace) {
		this.marriagePlace = marriagePlace;
	}

	public String getMarriagePriest() {
		return marriagePriest;
	}

	public void setMarriagePriest(String marriagePriest) {
		this.marriagePriest = marriagePriest;
	}

	public String getCivilMarriage() {
		return civilMarriage;
	}

	public void setCivilMarriage(String civilMarriage) {
		this.civilMarriage = civilMarriage;
	}

	public Date getCivilMarriageDate() {
		return civilMarriageDate;
	}

	public void setCivilMarriageDate(Date civilMarriageDate) {
		this.civilMarriageDate = civilMarriageDate;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getWidowhoodDate() {
		return widowhoodDate;
	}

	public void setWidowhoodDate(Date widowhoodDate) {
		this.widowhoodDate = widowhoodDate;
	}

	public String getMarriedBeforeWidowhood() {
		return marriedBeforeWidowhood;
	}

	public void setMarriedBeforeWidowhood(String marriedBeforeWidowhood) {
		this.marriedBeforeWidowhood = marriedBeforeWidowhood;
	}

	public String getMarriageBeforeWidowhoodInfo() {
		return marriageBeforeWidowhoodInfo;
	}

	public void setMarriageBeforeWidowhoodInfo(String marriageBeforeWidowhoodInfo) {
		this.marriageBeforeWidowhoodInfo = marriageBeforeWidowhoodInfo;
	}

	public String getDivorced() {
		return divorced;
	}

	public void setDivorced(String divorced) {
		this.divorced = divorced;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}

	public Date getCaseDate() {
		return caseDate;
	}

	public void setCaseDate(Date caseDate) {
		this.caseDate = caseDate;
	}

	public String getMarriageApprovalSource() {
		return marriageApprovalSource;
	}

	public void setMarriageApprovalSource(String marriageApprovalSource) {
		this.marriageApprovalSource = marriageApprovalSource;
	}

	public Date getMarriageApprovalDate() {
		return marriageApprovalDate;
	}

	public void setMarriageApprovalDate(Date marriageApprovalDate) {
		this.marriageApprovalDate = marriageApprovalDate;
	}

	public String getChildsNum() {
		return childsNum;
	}

	public void setChildsNum(String childsNum) {
		this.childsNum = childsNum;
	}

	public String getChildAge() {
		return childAge;
	}

	public void setChildAge(String childAge) {
		this.childAge = childAge;
	}

	public String getChildsBiptesm() {
		return childsBiptesm;
	}

	public void setChildsBiptesm(String childsBiptesm) {
		this.childsBiptesm = childsBiptesm;
	}

	public String getFamilyRelation() {
		return familyRelation;
	}

	public void setFamilyRelation(String familyRelation) {
		this.familyRelation = familyRelation;
	}

	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalState() {
		return maritalState;
	}

	public void setMaritalState(String maritalState) {
		this.maritalState = maritalState;
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



	public String getEmirateId() {
		return emirateId;
	}

	public void setEmirateId(String emirateId) {
		this.emirateId = emirateId;
	}

	public String getHasSecondClearance() {
		return hasSecondClearance;
	}

	public void setHasSecondClearance(String hasSecondClearance) {
		this.hasSecondClearance = hasSecondClearance;
	}

	
	public String getMarriageType() {
		return marriageType;
	}

	public void setMarriageType(String marriageType) {
		this.marriageType = marriageType;
	}

	public String getMarriedBefore() {
		return marriedBefore;
	}

	public void setMarriedBefore(String marriedBefore) {
		this.marriedBefore = marriedBefore;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", maritalState=" + maritalState + ", createdDate=" + createdDate
				+ ", lastModified=" + lastModified + ", emirateId=" + emirateId + ", church=" + church + ", birthDate="
				+ birthDate + ", placeOfBirth=" + placeOfBirth + ", baptismDate=" + baptismDate + ", placeOfBaptism="
				+ placeOfBaptism + ", edQualification=" + edQualification + ", address=" + address + ", jobTitle="
				+ jobTitle + ", jobAddress=" + jobAddress + ", militaryStatus=" + militaryStatus + ", relatedChurch="
				+ relatedChurch + ", confessoPriest=" + confessoPriest + ", confessorChurch=" + confessorChurch
				+ ", confessionRate=" + confessionRate + ", eucharistRate=" + eucharistRate + ", foreignCountryName="
				+ foreignCountryName + ", foreignCountryDate=" + foreignCountryDate + ", familyLinks=" + familyLinks
				+ ", engagedBefore=" + engagedBefore + ", marriedOutside=" + marriedOutside + ", marriedInside="
				+ marriedInside + ", churchMarriage=" + churchMarriage + ", marriagePlace=" + marriagePlace
				+ ", marriagePriest=" + marriagePriest + ", civilMarriage=" + civilMarriage + ", civilMarriageDate="
				+ civilMarriageDate + ", maritalStatus=" + maritalStatus + ", widowhoodDate=" + widowhoodDate
				+ ", marriedBeforeWidowhood=" + marriedBeforeWidowhood + ", marriageBeforeWidowhoodInfo="
				+ marriageBeforeWidowhoodInfo + ", divorced=" + divorced + ", court=" + court + ", caseNum=" + caseNum
				+ ", caseDate=" + caseDate + ", marriageApprovalSource=" + marriageApprovalSource
				+ ", marriageApprovalDate=" + marriageApprovalDate + ", childsNum=" + childsNum + ", childAge="
				+ childAge + ", childsBiptesm=" + childsBiptesm + ", familyRelation=" + familyRelation
				+ ", referenceNumber=" + referenceNumber + ", hasSecondClearance=" + hasSecondClearance + "]";
	}

	
}
