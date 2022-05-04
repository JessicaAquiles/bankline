package com.dio.santander.bankline.api.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NewAccountHolder;
import com.dio.santander.bankline.api.model.Account;
import com.dio.santander.bankline.api.model.AccountHolder;
import com.dio.santander.bankline.api.repository.AccountHolderRepository;

@Service
public class AccountHolderService {
	
	@Autowired
	private AccountHolderRepository repository;
	public void save(NewAccountHolder newAccountHolder) {
		AccountHolder accountH = new AccountHolder();
		accountH.setCpf(newAccountHolder.getCpf());
		accountH.setName(newAccountHolder.getName());
		
		Account account = new Account();
		account.setBalance(0.0);
		account.setNumber(new Date().getTime());
		accountH.setAccount(account);
		repository.save(accountH);
	}
}
