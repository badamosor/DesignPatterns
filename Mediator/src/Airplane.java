public class Airplane extends Colleague {
	private int FlightNumber;
	
	public Airplane (Mediator m) {
		super(m);
	}
   
	public int getFlightNumber() {
		return this.FlightNumber;
	}
	
	public void setFlightNumber(int flightNumber) {
		this.FlightNumber = flightNumber;
	}
	
	public void receive (String message) {
		System.out.println(this.FlightNumber + " Recieved message: " + message + "\n");
	}
}