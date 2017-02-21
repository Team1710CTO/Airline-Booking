
public class Flights {
	//a flight = (flight number, destination time, of departure)
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
	//returns the time of departure for specified flight number
	//example String flightOneDeparture = Flights.getDepartureTime(1)
	public static String getDepartureTime(int flightNumber) {
		String departureTime = flights[flightNumber-1][2];
		return departureTime;
	}
	
	//returns the destination for the specified flight number
	//example: String flightOneDestination = Flights.getDestination(1)
	public static String getDestination(int flightNumber) {
		String destination = flights[flightNumber][1];
		return destination;
	}
	
	
}
