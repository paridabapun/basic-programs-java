package com.hsbc.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardEx {

	public static void drawShape(List<? extends Shape> list) {

		for (Shape s : list) {
			s.draw();
		}

	}

	public static void main(String[] args) {
		ArrayList<Circle> al = new ArrayList<Circle>();
		al.add(new Circle());
		ArrayList<Rectagle> arec = new ArrayList<Rectagle>();
		arec.add(new Rectagle());
		drawShape(arec);
		drawShape(al);
	}
}

abstract class Shape {
	abstract void draw();

}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing cirle");
	}

}

class Rectagle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing rectangle");
	}

}
