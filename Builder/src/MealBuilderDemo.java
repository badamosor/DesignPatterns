public class MealBuilderDemo {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		MainItemBuilder main = new HamburgerMainItem();
		SideItemBuilder side = new AppleSideItem();
		DrinkBuilder drink = new MilkDrink();		
		ToyBuilder toy = new CarToy();


		MealBuilder mealBldr = new Meal(main, side, drink, toy);
		waiter.setMealBuilder(mealBldr);
		waiter.construct();
		System.out.println(mealBldr.getResult());
	}
}