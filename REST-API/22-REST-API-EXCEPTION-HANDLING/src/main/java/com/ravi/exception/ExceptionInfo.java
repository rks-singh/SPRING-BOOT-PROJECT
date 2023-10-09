package com.ravi.exception;

import java.time.LocalDate;

public class ExceptionInfo {
	
	private String exCode;
	private String exMsg;
	private LocalDate exDate;
	
	public ExceptionInfo(String exCode, String exMsg, LocalDate exDate) {
		super();
		this.exCode = exCode;
		this.exMsg = exMsg;
		this.exDate = exDate;
	}

	public String getExCode() {
		return exCode;
	}

	public void setExCode(String exCode) {
		this.exCode = exCode;
	}

	public String getExMsg() {
		return exMsg;
	}

	public void setExMsg(String exMsg) {
		this.exMsg = exMsg;
	}

	public LocalDate getExDate() {
		return exDate;
	}

	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}
	
	

}
