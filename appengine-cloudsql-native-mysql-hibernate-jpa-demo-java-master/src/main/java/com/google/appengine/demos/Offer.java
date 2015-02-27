package com.google.appengine.demos;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the offers database table.
 * 
 */
@Entity
@Table(name="offers")
@NamedQuery(name="Offer.findAll", query="SELECT o FROM Offer o")
public class Offer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private BigDecimal amount;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;

	private float interest;

	private int memberId;

	@Lob
	private String offerees;

	private String offerType;

	private byte partialPay;

	private String publicOffer;

	private String status;

	private int term;

	public Offer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public float getInterest() {
		return this.interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getOfferees() {
		return this.offerees;
	}

	public void setOfferees(String offerees) {
		this.offerees = offerees;
	}

	public String getOfferType() {
		return this.offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public byte getPartialPay() {
		return this.partialPay;
	}

	public void setPartialPay(byte partialPay) {
		this.partialPay = partialPay;
	}

	public String getPublicOffer() {
		return this.publicOffer;
	}

	public void setPublicOffer(String publicOffer) {
		this.publicOffer = publicOffer;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTerm() {
		return this.term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

}