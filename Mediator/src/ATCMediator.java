import java.util.ArrayList;

public class ATCMediator extends Mediator{
	private ArrayList <Colleague> colleagues;
	
	public ATCMediator () {
		this.colleagues = new ArrayList<Colleague>();
	}
	
	public void addColleague (Colleague colleague) {
		this.colleagues.add(colleague);
	}
	
	@Override
	public void broadcast(String message, Colleague sender) {
		for (Colleague colleague: colleagues) {
			if (colleague != sender) {
				colleague.receive(message);
			}
		}
	}
}
