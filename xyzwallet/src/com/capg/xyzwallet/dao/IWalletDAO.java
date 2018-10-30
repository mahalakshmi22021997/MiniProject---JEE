package com.capg.xyzwallet.dao;

import java.util.ArrayList;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.WalletTransaction;

public interface IWalletDAO {
	public boolean createAccount(WalletBean wb);
	public double showBalance(long phoneNumber);
	public double deposit(long phoneNumber,double amount);
	public double withdraw(long phoneNumber,double amount);
	public boolean fundTransfer(long phoneNumber1,long phoneNumber2,double amount);
	public ArrayList<WalletTransaction> printTransactions(long phoneNumber);
	
	public boolean checkPhoneNumber(long phoneNumber);
}
