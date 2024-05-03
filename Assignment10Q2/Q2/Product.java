package com.sunbeam.Q2;

public class Product implements Comparable<Product>{
	int id;
	String name;
	String category;
	
	
	
	
	 Product() {
	
	}
	 Product(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "["+"Id ="+id+", Name = "+name+", Category ="+category+"]";
	}
	@Override
	public int compareTo(Product o) {
		int diff = this.category.compareTo(o.category);
		return diff;

	
	}

}
