package com.hsbc.interfaceex1;

public class M implements Mno {

	@Override
	public void funX() {

	}

	@Override
	public void funY() {

	}

	@Override
	public void funI() {

	}

	@Override
	public void funM() {

	}

	public static void main(String[] args) {

		Mno m1 = new M();
		Xyz x1 = new M();
		x1.funX();
		x1.funY();
		// x1.funM();
	}
}
