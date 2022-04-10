package com.hsbc.immutable;

public class Address {
	private String hno;
	private String ownerName;

	public Address(String hno, String ownerName) {

		this.hno = hno;
		this.ownerName = ownerName;
	}

	public String getHno() {
		return hno;
	}

	public String getOwnerName() {
		return ownerName;
	}
}
