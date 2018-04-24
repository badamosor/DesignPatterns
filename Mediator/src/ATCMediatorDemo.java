public class ATCMediatorDemo {

	public static void main(String[] args) {
		ATCMediator atc = new ATCMediator();
		Airplane flight1 =  new Airplane(atc);
		Airplane flight2 =  new Airplane(atc);
		Airplane flight3 =  new Airplane(atc);
		Airplane flight4 =  new Airplane(atc);
		
		flight1.setFlightNumber(555);
		flight2.setFlightNumber(666);
		flight3.setFlightNumber(777);
		flight4.setFlightNumber(888);

		atc.addColleague(flight1);
		atc.addColleague(flight2);
		atc.addColleague(flight3);
		atc.addColleague(flight4);
		
		flight1.broadcast("HELLO from " + flight1.getFlightNumber());
		flight2.broadcast("HELLO from " + flight2.getFlightNumber());
		flight3.broadcast("HELLO from " + flight3.getFlightNumber());
		flight4.broadcast("HELLO from " + flight4.getFlightNumber());
	}
}