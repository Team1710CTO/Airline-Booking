import java.util.Scanner;


public class Main {
	
	static int selection;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Herm Airlines. How can I help you today?");
		//make a class with methods that add flights to the flights.java class
		System.out.println("1) Book a flight.");
		//make a class with methods that check the status of flights in the flights.java class
		System.out.println("2) Check flight status");
		/*make a class with methods that handle user verification (look below for taking console input) and store info for users such as
		credit card info, passports, etc*/
		System.out.println("3) Login");
		selection = Integer.valueOf(scanner.next());
		
		if(selection == 1) {
			System.out.println(Flights.getPassengers(1)[0]);
		} else if(selection == 2){
			
		} else {
			
		}
		
	}
}
