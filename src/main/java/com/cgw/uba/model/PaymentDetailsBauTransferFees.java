package com.cgw.uba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class PaymentDetailsBauTransferFees {
	
	@Id
	private int id;
	
	private String transferid;
	
	private String feeid;
	
	private String debitaccount;
	
	private String creditaccount;
	
	private double amount;
	@Column(name="timein")
	private Date timestamp;
	
	public PaymentDetailsBauTransferFees() {
		
	}
	
	public PaymentDetailsBauTransferFees(int id, String transferid, String debitaccount, String creditaccount, double amount,
			Date timestamp) {
		this.id = id;
		this.transferid = transferid;
		this.debitaccount = debitaccount;
		this.creditaccount = creditaccount;
		this.amount = amount;
		this.timestamp = timestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransferid() {
		return transferid;
	}

	public void setTransferid(String transferid) {
		this.transferid = transferid;
	}

	public String getFeeid() {
		return feeid;
	}

	public void setFeeid(String feeid) {
		this.feeid = feeid;
	}

	public String getDebitaccount() {
		return debitaccount;
	}

	public void setDebitaccount(String debitaccount) {
		this.debitaccount = debitaccount;
	}

	public String getCreditaccount() {
		return creditaccount;
	}

	public void setCreditaccount(String creditaccount) {
		this.creditaccount = creditaccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "PaymentDetailsBauTransferFees [id=" + id + ", transferid=" + transferid + ", feeid=" + feeid
				+ ", debitaccount=" + debitaccount + ", creditaccount=" + creditaccount + ", amount=" + amount
				+ ", timestamp=" + timestamp + "]";
	}
	
	

}
