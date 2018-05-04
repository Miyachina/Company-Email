/**
 * 
 */
package com.email;

import java.util.Scanner;

/**
 * @author ACHINA
 *
 */
public class email {
/*** A method that returns Something should be printed*/
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int mailboxCapacity = 500;
		private int defaultPassword = 12;
		private String alternateEmail;
		private String companySuffix = "szr.com";
		
	public email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email Created " + this.firstName + this.lastName);//these may be removed during cleaning
		
		//call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call method that returns a random number
		this.password = randomPassword(defaultPassword);
		System.out.println("Your Initial Password is " + this.password);
		
		//Create the Email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
		System.out.println("Your Email is: " + email);
	}
	
	   //ask for department
	private String setDepartment() {
		
		System.out.print("New Worker: " + firstName + ", Department Codes:\n1 for Sales\n2 for Dev\n3 for Acc\n0 for none\nEnter your department: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {return "Sales";}
		else if(depChoice == 2) {return "Dev";}
		else if(depChoice == 3) {return "Acc";}
		else {return "";}
		
	}
	
	//Generate a random number
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"; //we see this as an array
		char[] password = new char[length]; //sequence of characters of size length
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length()); //cast random number b/n 0,1 as an integer
			password[i] = passwordSet.charAt(rand); //at position i, we want that equal the character at random number
		}
		return new String (password);
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//Set alternate Email
	public void setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//Set password Change
	public void changePassword(String password) {
		this.password = password;
	}
	//Create Get methods
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAltEmail() {return alternateEmail;}
	public String getpassword() {return password;}
	
	//Creating Method to show info created
	public String showInfo() {
		return "Display Name: " + this.firstName + " " + this.lastName + " " +
			   "\nCompany EMAIL: " + this.email + " " +
			   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
