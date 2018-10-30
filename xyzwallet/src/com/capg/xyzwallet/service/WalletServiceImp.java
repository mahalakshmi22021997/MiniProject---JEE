package com.capg.xyzwallet.service;

import java.util.ArrayList;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.WalletTransaction;
import com.capg.xyzwallet.dao.IWalletDAO;
import com.capg.xyzwallet.dao.WalletDAOImp;
import com.capg.xyzwallet.exception.WalletException;
import com.capg.xyzwallet.exception.WalletExceptionMessages;

public class WalletServiceImp implements IWalletService{

	IWalletDAO dao=new WalletDAOImp();
	@Override
	public boolean createAccount(WalletBean wb) {
		// TODO Auto-generated method stub
		return dao.createAccount(wb);
	}

	@Override
	public double showBalance(long phoneNumber) {
		// TODO Auto-generated method stub
		return dao.showBalance(phoneNumber);
	}

	@Override
	public double deposit(long phoneNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(phoneNumber, amount);
	}

	@Override
	public double withdraw(long phoneNumber, double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(phoneNumber, amount);
	}

	@Override
	public boolean fundTransfer(long phoneNumber1, long phoneNumber2, double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(phoneNumber1, phoneNumber2, amount);
	}

	@Override
	public ArrayList<WalletTransaction> printTransactions(long phoneNumber) {
		// TODO Auto-generated method stub
		return dao.printTransactions(phoneNumber);
	}

	@Override
	public boolean checkPhoneNumber(long phoneNumber) {
		// TODO Auto-generated method stub
		return dao.checkPhoneNumber(phoneNumber);
	}

	@Override
	public boolean validData(WalletBean wb) throws WalletException {
		
		if(wb.getFirstName().trim().length() < 4 ) {
			throw new WalletException(WalletExceptionMessages.ERRORNAME);
		}
		if(wb.getLastName().trim().length() < 4) {
			throw new WalletException(WalletExceptionMessages.ERRORNAME);
		}
		if(!(String.valueOf(wb.getPhoneNumber()).matches("(0)?[6-9][0-9]{9}"))) {
			throw new WalletException(WalletExceptionMessages.ERRORPHONE);
		}
		if(!(wb.getPanNumber().matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))) {
			throw new WalletException(WalletExceptionMessages.ERRORPAN);
		}
		if(wb.getBalance() <= 0) {
			throw new WalletException(WalletExceptionMessages.ERRORBALANCE);
		}
		if(wb.getAddress() == "")
		{
			throw new WalletException(WalletExceptionMessages.ERRORADDRESS);
		}
		if(!(wb.getEmail().matches("^[A-Za-z0-9.]+@[A-Za-z0-9.-]+\\\\.[A-Z]{2,6}$"))) {
			throw new WalletException(WalletExceptionMessages.ERROREMAIL);
		}
		return true;
	}

	@Override
	public boolean validPhoneNumber(long phoneNumber) {
		boolean isValid=false;
		     if(String.valueOf(phoneNumber).matches("(0)?[6-9][0-9]{9}")){
		    	 isValid=true;
		     }
		return isValid;
	}

	@Override
	public boolean validAmount(double amount) {
		boolean isValid=false;
		if(amount > 0)
			isValid = true;
		return isValid;
	}

	
}
