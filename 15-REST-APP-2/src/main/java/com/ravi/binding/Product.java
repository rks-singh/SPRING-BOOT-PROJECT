package com.ravi.binding;

public class Product {
	
	private Integer pid;
	private String pName;
	private Double pPrice;
	
	public Product() {}

	public Integer getPid() {
		return pid;
	}
	
	
	public Product(Integer pid, String pName, Double pPrice) {
		this.pid = pid;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", Name=" + pName + ", Price=" + pPrice + "]";
	}
	
	

}
