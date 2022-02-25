package com.hsbc.cache;

public class Company {

	
	private String id;
	private String billType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	
	@Override
	public String toString() {
		return "Company [id=" + id + ", billType=" + billType + "]";
	}
}
