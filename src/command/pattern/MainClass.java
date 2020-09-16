package command.pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int option;

		Switcher switcher = new Switcher();

		Light light = new Light();

		TurnOnCommand onCommand = new TurnOnCommand(light);

		TurnOffCommand offCommand = new TurnOffCommand(light);

		try {

			do {

				System.out.println("\nEnter 1 to turn on the lights");
				System.out.println("Enter 2 to turn off the lights");
				System.out.println("Enter anything else to leave the room \n");

				System.out.print("Your option: ");
				option = scanner.nextInt();

				if (option == 1) {
					switcher.addCommand(onCommand);
					switcher.executeCommands();

				} else if (option == 2) {
					switcher.addCommand(offCommand);
					switcher.executeCommands();

				} else {
					System.out.println("You left the room.");
				}

			} while (option == 1 || option == 2);

			scanner.close();

		} catch (InputMismatchException e) {
			System.out.println("You left the room...");
		}

	}

}
