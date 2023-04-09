package CoffeeMachine;

import java.util.Scanner;

public class StartMachine {
	CofeeType c;

	public void start() {

		System.out.println("Do you want to start the machine yes = 1");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1) {
			typeOfOperation();
		} else {
			System.out.println("Thank you signing off");
		}

	}

	public void typeOfOperation() {
		c = new CofeeType();

		Scanner sc = new Scanner(System.in);
		System.out.println("select operation 1= getCoffee, 2= add ingredients, 3= getIngredients");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			c.getCofee();
			break;
		case 2:
			c.AddIngredients();
			System.out.println("do you want coffee");
			int wantcoffee = sc.nextInt();
			if (wantcoffee == 1) {
				c.getCofee();
			}
			break;
		case 3:
			c.getIngredients();
			System.out.println("do you want to add ingredients yes = 1 no = 2");
			int addIngre = sc.nextInt();
			if (addIngre == 1) {
				c.AddIngredients();
				start();
			} else if (addIngre == 1) {
				typeOfOperation();
			} else {
				System.out.println("please enter valid input");
				typeOfOperation();
			}

			break;

		}

	}

}
