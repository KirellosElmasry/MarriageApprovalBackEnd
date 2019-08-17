package com.stmark.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"created_date","last_modified"}, 
        allowGetters = true)
@Table(name = "person")
public class Person {

	@JsonIgnoreProperties
	@Column
	private String name;
	
	@JsonIgnoreProperties
	@Column(name = "marital_state")
	private String maritalState;
	
    @Column(updatable = false, name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date createdDate;
    
    @Column(nullable = false, name ="last_modified" )
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date lastModified;
    
    @Id
    @Column(name="E_Id")
	private Long eId;
    
    @Column
    private String church;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name= "birth_date")
    private Date birthDate;
    
    @Column(name="place_of_birth")
    private String placeOfBirth;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="baptism_date")
    private Date baptismDate;
	
    @Column(name="place_of_baptism")
    private String placeOfBaptism;
    
    @Column(name="ed_qualification")
    private String edQualification;
    
    @Column(name="address")
    private String address;
    
    @Column(name="job_title")
    private String jobTitle;
    
    @Column(name="job_address")
    private String jobAddress;
    
    @Column(name="military_status")
    private String militaryStatus;
    
    @Column(name="related_church")
    private String relatedChurch;
    
    @Column(name="confessor_priest")
    private String confessoPriest;
    
    @Column(name="confessor_church")
    private String confessorChurch;
    
    @Column(name="confession_rate")
    private String confessionRate;
    
    @Column(name="eucharist_rate")
    private String eucharistRate;
    
    @Column(name="foreign_country_name")
    private String foreignCountryName;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="foreign_country_date")
    private Date foreignCountryDate;
    
    @Column(name="family_links")
    private String familyLinks;
    
    @Column(name="engaged_before")
    private Integer engagedBefore;
    
    @Column(name="married_outside")
    private String marriedOutside;
    
    
    @Column(name="married_inside")
    private String marriedInside;
    
    @Column(name="church_marriage")
    private Integer churchMarriage;
    
    @Column(name="marriage_place")
    private String marriagePlace;
    
    @Column(name="marriage_priest")
    private String marriagePriest;
    
    @Column(name="civil_marriage")
    private String civilMarriage;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="civil_marriage_date")
    private Date civilMarriageDate;
    
    @Column(name="marital_status")
    private String maritalStatus;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="widowhood_date")
    private Date widowhoodDate;
    
    @Column(name="married_before_widowhood")
    private Integer marriedBeforeWidowhood;
    
    @Column(name="m_b_w_info")
    private String marriageBeforeWidowhoodInfo;
    
    @Column(name="divorced")
    private Integer divorced;
    
    @Column(name="court")
    private String court;
    
    @Column(name="case_num", nullable = false)
    private Integer caseNum;
    
    
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

	public Integer getEngagedBefore() {
		return engagedBefore;
	}

	public void setEngagedBefore(Integer engagedBefore) {
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

	public Integer getChurchMarriage() {
		return churchMarriage;
	}

	public void setChurchMarriage(Integer churchMarriage) {
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

	public Integer getMarriedBeforeWidowhood() {
		return marriedBeforeWidowhood;
	}

	public void setMarriedBeforeWidowhood(Integer marriedBeforeWidowhood) {
		this.marriedBeforeWidowhood = marriedBeforeWidowhood;
	}

	public String getMarriageBeforeWidowhoodInfo() {
		return marriageBeforeWidowhoodInfo;
	}

	public void setMarriageBeforeWidowhoodInfo(String marriageBeforeWidowhoodInfo) {
		this.marriageBeforeWidowhoodInfo = marriageBeforeWidowhoodInfo;
	}

	public Integer getDivorced() {
		return divorced;
	}

	public void setDivorced(Integer divorced) {
		this.divorced = divorced;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public Integer getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(Integer caseNum) {
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

	public Integer getChildsNum() {
		return childsNum;
	}

	public void setChildsNum(Integer childsNum) {
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

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="case_date")
    private Date caseDate;
    
    @Column(name="marriage_approval_source")
    private String marriageApprovalSource;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="marriage_approval_date")
    private Date marriageApprovalDate;
    
    @Column(name="childs_num")
    private Integer childsNum;
    
    @Column(name="childs_age")
    private String childAge;
    
    @Column(name="childs_biptesm")
    private String childsBiptesm;
    
    @Column(name="family_relation")
    private String familyRelation;
    
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

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", maritalState=" + maritalState + ", createdDate=" + createdDate
				+ ", lastModified=" + lastModified + ", eId=" + eId + ", church=" + church + ", birthDate=" + birthDate
				+ ", placeOfBirth=" + placeOfBirth + ", baptismDate=" + baptismDate + ", placeOfBaptism="
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
				+ childAge + ", childsBiptesm=" + childsBiptesm + ", familyRelation=" + familyRelation + "]";
	}

	
}
