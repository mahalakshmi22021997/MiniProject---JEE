package com.capg.xyzwallet.ui;

import java.util.Scanner;

import com.capg.xyzwallet.service.IWalletService;
import com.capg.xyzwallet.service.WalletServiceImp;

public class Wallet {

	public static void main(String[] args) {
		
		long phone;
		
		IWalletService service=new WalletServiceImp();
		Scanner sc=new Scanner(System.in);
		
		phone=sc.nextLong();
		
		boolean result=service.validPhoneNumber(phone);
		boolean result1=service.validAmount(-1222);
		if(result1)
			System.out.println("Entered");
		else
			System.out.println("NotEntered");

	}

}
