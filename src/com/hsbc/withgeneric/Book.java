package com.hsbc.withgeneric;

class Book {  
public int id;  
public String name,author,publisher;  
public int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
			+ quantity + "]";
}  
}  