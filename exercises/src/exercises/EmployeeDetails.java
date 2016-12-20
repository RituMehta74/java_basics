package exercises;

import java.io.IOException;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("-----------Menu----------");
		System.out.println(" 1. Enter Data");
		System.out.println(" 2. Display Data");
		System.out.println(" 3. Exit");
		System.out.println("Choose the option");
		
		char opt = ' ';
		try {
			opt = (char)System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//char opt='1';
		switch (opt){
		
		case '1' : enterData();break;
		case '2' : displayData();break;
		case '3' : exit();break;
		}
		 
		

	}
	
	public static void enterData(){
		System.out.println("enterData method is invoked");
			}
	
	public static void displayData(){
		System.out.println("displayData method is invoked");
			}
	public static void exit(){
		System.out.println("exit method is invoked");
	}
}
