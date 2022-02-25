package com.hsbc.withgeneric;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Book> books = new HashSet<Book>();

		Book book1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book book2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book book3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		books.add(book1);
		books.add(book2);
		books.add(book3);
		// DOES NOT ALLOW NULL
		// books.add(null);

		// ITERATING A HASHSET USING ITERATOR
		System.out.println("// ITERATING A HASHSET USING ITERATOR");
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// USING FOR EACH LOOP
		System.out.println("//	USING FOR EACH LOOP ");
		for (Book book : books) {
			System.out.println(book.id + " " + book.name + "" + book.publisher + "" + book.quantity + "" + book.author);
		}

	}

}
