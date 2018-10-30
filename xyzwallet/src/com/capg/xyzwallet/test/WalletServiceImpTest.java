package com.capg.xyzwallet.test;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.exception.WalletException;
import com.capg.xyzwallet.service.IWalletService;
import com.capg.xyzwallet.service.WalletServiceImp;

class TestWalletServiceImp {

	static IWalletService service = null;
	
	@BeforeClass
	public static void init() {
		service=new WalletServiceImp();
	}

	@Test
	public void testFirstName() throws WalletException {
		WalletBean bean=new WalletBean();
		
		bean.setFirstName("");
		bean.setLastName("hari");
		bean.setPanNumber("AAAA0000A");
		bean.setAddress("something");
		bean.setBalance(500);
		bean.setPhoneNumber(641636811);
		bean.setEmail("mshvarunkumar@gmail.com");
		bean.setUserName("harivarun");
		
		boolean result=service.validData(bean);
		
	}
}
