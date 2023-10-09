package com.ravi.request;

import java.time.LocalDate;

public class Passenger {

	private String name;
	private String phone;
	private String gender;
	private String from;
	private String to;
	private LocalDate doj;
	private String trainNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", phone=" + phone + ", gender=" + gender + ", from=" + from + ", to=" + to
				+ ", doj=" + doj + ", trainNum=" + trainNum + "]";
	}

}
