package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Account {
	@Column (name = "num_account")
	private Long number;
	
	@Column (name = "balance_account")
	private Double balance;
	
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	} 
}
