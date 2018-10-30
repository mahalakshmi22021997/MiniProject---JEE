package com.capg.xyzwallet.dao;

import java.util.ArrayList;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.WalletTransaction;

public class WalletDAOImp implements IWalletDAO{
	ArrayList<WalletBean> list=new ArrayList<>();
	@Override
	public boolean createAccount(WalletBean wb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double showBalance(long phoneNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposit(long phoneNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdraw(long phoneNumber, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long phoneNumber1, long phoneNumber2, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<WalletTransaction> printTransactions(long phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkPhoneNumber(long phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
