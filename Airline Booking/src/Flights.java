
public class Flights {
	public static String[][] flights = {{"0001", "Chicago", "6:00"}, {"0002", "Kansas City", "6:30"}};
	//each row is a flight, row # + 1 = flight number (array indexes start at 0)
	public static String[][] passengers = {{"Billy Bob", "Jake Herman"}, {"Cameron Bohl"}};
	
	public static String[] getPassengers(int flightNumber) {
		String[] passengersLocal = new String[passengers[flightNumber-1].length];
		for(int i = 0; i < passengers[flightNumber-1].length; i++) {
			passengersLocal[i] = passengers[flightNumber-1][i];
		}
		return passengersLocal;
	}
	
	public static String getDepartureTime(int flightNumber) {
		String departureTime = flights[flightNumber-1][2];
		return departureTime;
	}
	
	public static String getDestination(int flightNumber) {
		String destination = flights[flightNumber][1];
		return destination;
	}
	
	
}
