package com.example.demo.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int shares;
	private LocalDate buyDate;

	// public StockModel(){};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		if (shares >= 0) {
			this.shares = shares;
		} else {
			throw new IllegalArgumentException("Shares must be positive.");
		}
	}

	public LocalDate getbuyDate() {
		return buyDate;
	}

	public void setbuyDate(LocalDate buyDate) {
		this.buyDate = buyDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
