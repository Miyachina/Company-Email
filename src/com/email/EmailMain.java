package com.email;

public class EmailMain {

	public EmailMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		email em1 = new email("Joe","Smith");
		/*em1.setAltEmail("joesmith@mail.com"); //using the Email Set and Get Method
		System.out.println(em1.getAltEmail());
*/
		System.out.println(em1.showInfo());
	}

}
