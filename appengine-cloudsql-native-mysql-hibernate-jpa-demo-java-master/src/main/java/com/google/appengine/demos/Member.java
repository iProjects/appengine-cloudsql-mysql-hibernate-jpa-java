package com.google.appengine.demos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the members database table.
 * 
 */
@Entity
@Table(name="members")
@NamedQuery(name="Member.findAll", query="SELECT m FROM Member m")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int memberId;

	private int currentAccountId;

	private int customerId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateActivated;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateJoined;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;

	private String email;

	private String gender;

	private String informBy;

	private int investmentAccountId;

	private int loanAccountId;

	private int maxRecordsToDisplay;

	private String nationalID;

	private String otherNames;

	private String photo;

	private String pwd;

	private int refferedBy;

	private String status;

	private String surname;

	private String telephone;

	public Member() {
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getCurrentAccountId() {
		return this.currentAccountId;
	}

	public void setCurrentAccountId(int currentAccountId) {
		this.currentAccountId = currentAccountId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getDateActivated() {
		return this.dateActivated;
	}

	public void setDateActivated(Date dateActivated) {
		this.dateActivated = dateActivated;
	}

	public Date getDateJoined() {
		return this.dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInformBy() {
		return this.informBy;
	}

	public void setInformBy(String informBy) {
		this.informBy = informBy;
	}

	public int getInvestmentAccountId() {
		return this.investmentAccountId;
	}

	public void setInvestmentAccountId(int investmentAccountId) {
		this.investmentAccountId = investmentAccountId;
	}

	public int getLoanAccountId() {
		return this.loanAccountId;
	}

	public void setLoanAccountId(int loanAccountId) {
		this.loanAccountId = loanAccountId;
	}

	public int getMaxRecordsToDisplay() {
		return this.maxRecordsToDisplay;
	}

	public void setMaxRecordsToDisplay(int maxRecordsToDisplay) {
		this.maxRecordsToDisplay = maxRecordsToDisplay;
	}

	public String getNationalID() {
		return this.nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getOtherNames() {
		return this.otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getRefferedBy() {
		return this.refferedBy;
	}

	public void setRefferedBy(int refferedBy) {
		this.refferedBy = refferedBy;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}