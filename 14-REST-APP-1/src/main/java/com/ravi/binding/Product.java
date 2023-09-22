package com.ravi.binding;

public class Product {

	private Integer pid;
	private String name;
	private Double price;
	
	public Product() {}

	public Product(Integer pid, String name, Double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
