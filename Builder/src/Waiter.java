/* Director */
public class Waiter {
	
	private MealBuilder mealbuilder;
	public void setMealBuilder(MealBuilder mealbuilder) {
		this.mealbuilder = mealbuilder;
	}
	
	public void construct() {
	    mealbuilder.buildPart();
	}
}