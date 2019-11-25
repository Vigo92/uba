package com.cgw.uba.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class PaymentDetailsBauTransfer {
	
	@Id
	private int id;
	
	
	private int apikeyid;
	
	
	private String merchantreference;
	
	private String country;
	
	private double amount;
	
	private String currency;
	
	private String debitaccount;
	
	private String creditaccount;
	
	private String narration;
	
	private Date timein;
	
	private String trandatetime;
	
	private String responsecode;
	
	private String responsemessage;
	
	private Date timeout;
	
	private String transactiontype;
	
	private String processingcode;
	
	private String valuedate;
	
	private String revoriginalstan;
	
	private String revoriginaldatetime;
	
	public PaymentDetailsBauTransfer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApikeyid() {
		return apikeyid;
	}

	public void setApikeyid(int apikeyid) {
		this.apikeyid = apikeyid;
	}

	public String getMerchantreference() {
		return merchantreference;
	}

	public void setMerchantreference(String merchantreference) {
		this.merchantreference = merchantreference;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public Date getTimein() {
		return timein;
	}

	public void setTimein(Date timein) {
		this.timein = timein;
	}

	public String getTrandatetime() {
		return trandatetime;
	}

	public void setTrandatetime(String trandatetime) {
		this.trandatetime = trandatetime;
	}

	public String getResponsecode() {
		return responsecode;
	}

	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}

	public String getResponsemessage() {
		return responsemessage;
	}

	public void setResponsemessage(String responsemessage) {
		this.responsemessage = responsemessage;
	}

	public Date getTimeout() {
		return timeout;
	}

	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public String getProcessingcode() {
		return processingcode;
	}

	public void setProcessingcode(String processingcode) {
		this.processingcode = processingcode;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getRevoriginalstan() {
		return revoriginalstan;
	}

	public void setRevoriginalstan(String revoriginalstan) {
		this.revoriginalstan = revoriginalstan;
	}

	public String getRevoriginaldatetime() {
		return revoriginaldatetime;
	}

	public void setRevoriginaldatetime(String revoriginaldatetime) {
		this.revoriginaldatetime = revoriginaldatetime;
	}

	@Override
	public String toString() {
		return "PaymentDetailsBauTransfer [id=" + id + ", apikeyid=" + apikeyid + ", merchantreference="
				+ merchantreference + ", country=" + country + ", amount=" + amount + ", currency=" + currency
				+ ", debitaccount=" + debitaccount + ", creditaccount=" + creditaccount + ", narration=" + narration
				+ ", timein=" + timein + ", trandatetime=" + trandatetime + ", responsecode=" + responsecode
				+ ", responsemessage=" + responsemessage + ", timeout=" + timeout + ", transactiontype="
				+ transactiontype + ", processingcode=" + processingcode + ", valuedate=" + valuedate
				+ ", revoriginalstan=" + revoriginalstan + ", revoriginaldatetime=" + revoriginaldatetime + "]";
	}
	
	
	

}
