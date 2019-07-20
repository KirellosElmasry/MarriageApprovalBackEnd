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
    private int engagedBefore;
    
    @Column(name="married_outside")
    private String marriedOutside;
    
    
    @Column(name="married_inside")
    private String marriedInside;
    
    @Column(name="church_marriage")
    private int churchMarriage;
    
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
    private int marriedBeforeWidowhood;
    
    @Column(name="m_b_w_info")
    private String marriageBeforeWidowhoodInfo;
    
    @Column(name="divorced")
    private int divorced;
    
    @Column(name="court")
    private String court;
    
    @Column(name="case_num")
    private int caseNum;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="case_date")
    private Date caseDate;
    
    @Column(name="marriage_approval_source")
    private String marriageApprovalSource;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="marriage_approval_date")
    private Date marriageApprovalDate;
    
    @Column(name="childs_num")
    private int childsNum;
    
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

	
}
