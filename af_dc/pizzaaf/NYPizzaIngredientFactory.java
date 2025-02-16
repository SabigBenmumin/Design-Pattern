public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		// return new MarinaraSauce(null);
		return null;
	}
 
	public Cheese createCheese() {
		// return new ReggianoCheese();
		return null;
	}
 
	public Veggies[] createVeggies() {
		// Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		// return veggies;
		return null;
	}
 
	public Pepperoni createPepperoni() {
		// return new SlicedPepperoni();
		return null;
	}

	public Clams createClam() {
		// return new FreshClams();
		return null;
	}
}
