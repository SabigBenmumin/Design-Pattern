public class MarinaraSauce extends Sauce {
	public MarinaraSauce(Pizza plainPizza) {
		super(plainPizza);
		//TODO Auto-generated constructor stub
	}

	@Override
	public int cost(){
		return plainPizza.cost() + 20;
	}

	public String toString() {
		return "Marinara Sauce";
	}
}
