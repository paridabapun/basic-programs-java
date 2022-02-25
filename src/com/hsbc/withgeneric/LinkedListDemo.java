package com.hsbc.withgeneric;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		// CREATING BOOKS
		List<Book> linkedList = new LinkedList<>();
		Book book1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book book2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book book3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		// ADDING BOOKS TO LIST
		linkedList.add(book1);
		linkedList.add(book2);
		linkedList.add(book3);
		// USING toString() METHOD TO PRINT THE DETAILS
		System.out.println(linkedList);

		// TRAVERSING ALL THE ELEMENT USING ITERATOR

		Iterator<Book> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// TRAVERSING ALL THE ELEMENT USING for each

		for (Book book : linkedList) {
			System.out.println(book.id + " " + book.name + "" + book.publisher + "" + book.quantity + "" + book.author);
		}

		// TRAVERSING ALL THE ELEMENT USING ListIterator
		System.out.println("// TRAVERSING ALL THE ELEMENT USING ListIterator");
		ListIterator<Book> listiterator = linkedList.listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}

		// TRAVERSING ALL THE ELEMENT USING ListIterator in BACKWORD DIRECTION
		System.out.println("// TRAVERSING ALL THE ELEMENT USING ListIterator in BACKWORD DIRECTION");
		ListIterator<Book> listItrBckwrd = linkedList.listIterator();
		while(listItrBckwrd.hasPrevious()) {
			System.out.println(listItrBckwrd.hasPrevious());
		}
		
		

	}

}
