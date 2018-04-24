/* Product */
public class Meal extends MealBuilder {
	
	private MainItemBuilder mainbldr;
	private SideItemBuilder sidebldr;
	private DrinkBuilder drinkbldr;
	private ToyBuilder toybldr;
	
	public Meal(MainItemBuilder main, SideItemBuilder side, DrinkBuilder drink, ToyBuilder toy) {
		this.mainbldr = main;
		this.sidebldr = side;
		this.drinkbldr = drink;
		this.toybldr =  toy;
	}	
	public void buildPart() {
		this.mainbldr.buildPart();
		this.sidebldr.buildPart();
		this.drinkbldr.buildPart();
		this.toybldr.buildPart();
	}
	public String getResult() {
		return mainbldr.getResult() + " " + sidebldr.getResult() + " " + drinkbldr.getResult() + " " + toybldr.getResult() + " "  + " prepared.";
	}
}
