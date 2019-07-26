package com.db.employeemanagementsystem.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.dao.LoginDAO;

class LoginServiceImplTest {

	
 	private static LoginBean loginBean = null;
	
	private static LoginServiceImpl loginservice = null;
	
	@BeforeAll
	
	public static void init() {
		
		loginBean = new LoginBean("admin","root");
		
		loginservice = new LoginServiceImpl();
			
		
	}
	
	
	
	
	@Test
	void testAuthenticate() {
		//fail("Not yet implemented");
	
		Assertions.assertEquals(true, loginservice.authenticate(loginBean),"SUCCCESSSSSSSSSSSSSS!!");
	
	}

}
