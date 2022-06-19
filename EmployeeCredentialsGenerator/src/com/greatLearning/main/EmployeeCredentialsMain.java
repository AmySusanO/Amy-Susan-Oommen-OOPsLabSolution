package com.greatLearning.main;
import java.util.Scanner;
import com.greatLearning.model.*;
import com.greatLearning.service.CredentialService;

public class EmployeeCredentialsMain {
	
	public static void main(String args[]) {
	
		String firstName, lastName, emailId;
		
		char [] passsword;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		
		firstName = sc.nextLine();
		
		
		System.out.println("Enter last name");
		
		lastName = sc.nextLine();
		
//		System.out.println("Please select department");
		
//		sc.nextLine();
//		
		employee emp = new employee(firstName,lastName);
		
		CredentialService cs = new CredentialService();
		
		int options;
    	
    	do {
    		System.out.println("Please select department");
    		System.out.println("1. Technical");
    		System.out.println("2. Admin");
    		System.out.println("3. Human Resource");
    		System.out.println("4. Legal");
    		System.out.println("*************************");
    		
    		options = sc.nextInt();
    		
    		switch(options){
//    			case 0:
//    				System.out.println("Exit");
//    				break;
    				
    			case 1: {
    				emailId = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "Technical");
    				passsword = cs.generatePassword();
    				cs.showCredentials(emp, emailId, passsword);
    				
    				break;
    			}
    			case 2:{
    				emailId = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "Admin");
    				passsword = cs.generatePassword();
    				cs.showCredentials(emp, emailId, passsword);
    				break;
    			}
    			case 3:{
    				emailId = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "Human Resource");
    				passsword = cs.generatePassword();
    				cs.showCredentials(emp, emailId, passsword);
    				break;
    			}
    			case 4:{
    				emailId = cs.generateEmail(emp.getFirstName(), emp.getLastName(), "Legal");
    				passsword = cs.generatePassword();
    				cs.showCredentials(emp, emailId, passsword);
    				break;
    			}
    			case default:{
    				System.out.println("Enter a number between 1 and 4");
    				break;
    			}
    			
    		}
    		
    	}
    	while(options!=1 && options!=2 && options!=3 && options!=4 ); {
    		System.out.println("");
    	}
		
		
		
		
	
	} 
	

}
