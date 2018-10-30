package com.capg.xyzwallet.bean;

public class WalletTransaction {

	private long phoneNumber;
	private String tDate;
	private String tType;
	private long receipentNumber;
	private double amount;
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public long getReceipentNumber() {
		return receipentNumber;
	}
	public void setReceipentNumber(long receipentNumber) {
		this.receipentNumber = receipentNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
