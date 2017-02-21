import java.util.Scanner;


public class Main {
	
	public static String user, password;
	static boolean loggedIn;
	static int selection;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please login to the Herm Airlines Flight Tracking System");
		System.out.println("Username:");
		user = scanner.next();
		System.out.println("Password:");
		password = scanner.next();
		
		if(UserVerification.verifyUser(user, password) == true) {
			//make a class with methods that add flights to the flights.java class
			System.out.println("1) Book a flight.");
			//make a class with methods that check the status of flights in the flights.java class
			System.out.println("2) Check flight status");
			/*make a class with methods that handle user verification (look below for taking console input) and a class to store info for users (such as
			credit card info, addresses, passports, etc)*/
			System.out.println("3) Login");
			selection = Integer.valueOf(scanner.next());
			
			if(selection == 1) {
				//run method to prompt user
			} else if(selection == 2){
				//run method to prompt user to input the flight number for the flight they would like to check the status of
			} else {
				//run method to prompt user to login
			}
		} else {
			System.out.println("Access Denied. Please Try again.");
			System.out.println("Username:");
			user = scanner.next();
			System.out.println("Password:");
			password = scanner.next();
		}
		
	}
}
