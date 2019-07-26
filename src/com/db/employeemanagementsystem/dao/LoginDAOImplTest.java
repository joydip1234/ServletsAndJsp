package com.db.employeemanagementsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;

class LoginDAOImplTest {

	
	private static LoginBean  login = null;
	
	private static LoginDAOImpl loginDAOImpl = null;
	
	
	@BeforeAll
	
	public static void init() {
		
		
		login = new LoginBean("admin","root");
		
		loginDAOImpl = new LoginDAOImpl();
		
	}
		
	
	
	@Test
	void testAuthenticate(){
		//fail("Not yet implemented");
		Assertions.assertEquals(true, loginDAOImpl.authenticate(login),"password matched ..successs!!");
		
		
		
		
	}

}
