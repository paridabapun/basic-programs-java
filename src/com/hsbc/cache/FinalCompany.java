package com.hsbc.cache;

import java.util.List;

public class FinalCompany {

	private String id;
	private List billType;

	public void setBillType(List billType) {
		this.billType = billType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List getBillType() {
		return billType;
	}

}
