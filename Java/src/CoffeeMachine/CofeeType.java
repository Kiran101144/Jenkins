package CoffeeMachine;

import java.util.Scanner;

public class CofeeType {
	private int water;
	private int milk;
	private int coffee;

	public void setIngredients(int wat, int mil, int cofe) {
		this.water = wat;
		this.milk = mil;
		this.coffee = cofe;
	}
	public void latte() {
		if (water >= 150 && milk >= 150 && coffee >= 50) {
			System.out.println("Here is your latte");
			water = water - 150;
			milk = milk - 150;
			coffee = coffee - 150;
			getIngredients();
		} else {
			System.out.println("insufficient ingredienta");
		}
	}

	public void cappachino() {
		if (water >= 50 && milk >= 150 && coffee >= 50) {
			System.out.println("Here is your cappachino");
			water = water - 50;
			milk = milk - 150;
			coffee = coffee - 150;
			getIngredients();
		} else {
			System.out.println("insufficient ingredienta");
		}

	}

	public void getCofee() {
		CofeeType c = new CofeeType();
		System.out.println("Select cofee L= latte,C= cappachino");
		Scanner sc = new Scanner(System.in);
		String coffee = sc.nextLine();

		switch (coffee) {
		case "L":
			this.latte();
			break;
		case "C":
			this.cappachino();
			break;

		}
		more();

	}

	public static void more() {
		System.out.println("Do you want to continue Y=1 or N=2");
		CofeeType c = new CofeeType();
		Scanner sc = new Scanner(System.in);
		int request = sc.nextInt();
		System.out.println(request);
		if (request == 1) {
			Machine m = new Machine();
			c.getCofee();
		} else if (request == 2) {
			System.out.println("Thank you");
		}

	}

	public void AddIngredients() {
		setIngredients(5000, 5000, 500);
	}
	public void getIngredients() {
		System.out
				.println("Remaining water = " + water + " Remaining Milk = " + milk + " Remaining coffee = " + coffee);
	}

}
