package CoffeeMachine;

import java.util.Scanner;

public class DemoMakeCoffee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nWants to Start Mechine Y or N ?");
		char d;
		d = scan.next().charAt(0);
		if (d == 'Y' || d == 'y') {
			Demo cm = new Demo(); // Instances For CoffeMachine
			cm.start(); // In order to call All Private Method Calling Public mathod
			System.out.println("Shutting Down...\n");
		} else
			System.out.println("Shutting Down...\n");
	}
}