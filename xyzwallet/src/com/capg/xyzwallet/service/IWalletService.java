package com.capg.xyzwallet.service;

import java.util.ArrayList;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.WalletTransaction;
import com.capg.xyzwallet.exception.WalletException;

public interface IWalletService {

	public boolean createAccount(WalletBean wb);
	public double showBalance(long phoneNumber);
	public double deposit(long phoneNumber,double amount);
	public double withdraw(long phoneNumber,double amount);
	public boolean fundTransfer(long phoneNumber1,long phoneNumber2,double amount);
	public ArrayList<WalletTransaction> printTransactions(long phoneNumber);
	
	public boolean checkPhoneNumber(long phoneNumber);

	public boolean validData(WalletBean wb) throws WalletException;
	public boolean validPhoneNumber(long phoneNumber);
	public boolean validAmount(double amount);
	
}