package com.greatLearning.service;
import java.util.Random;

import com.greatLearning.model.employee;

public class CredentialService {
	
//	String password;
//	
	public String generateEmail(String fName,String lName,String dept){
		
		String emailId = fName+lName+"@"+dept+".company.com";
		return emailId;
		
	}
	
	public void showCredentials(employee emp, String emailId, char [] passsword) {
		
		System.out.println("Dear" +" "+ emp.getFirstName()+" "+ emp.getLastName()+" "+"your generated credentials are as follows:");
		System.out.println("Email ID:" +emailId);
		
		System.out.println("Password>>>>>>");
		
		System.out.println(passsword);
	
	}
	
	public char[] generatePassword(){
		
		String strCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strSmallKetters = "abcdefghijklmnopqrstuvwxyz";
		String strNumbers = "0123456789";
		String strSpCharacters = "!@#$%^&=*()_+";
		
		String strValues = strCapitalLetters+strSmallKetters+strNumbers+strSpCharacters;
		
		
		Random rd = new Random();
		
		char[] password = new char[8];
		
		for(int i=0; i<8; i++) {
			
			password[i] = strValues.charAt(rd.nextInt(strValues.length())) ;
		}
		
		
		
		return password;
	}

}
