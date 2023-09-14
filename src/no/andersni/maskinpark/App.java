package no.andersni.maskinpark;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	while (true) {
		System.out.println("1: Legg til ny Laptop");
		System.out.println("2: Legg til ny Desktop");
		System.out.println("3: Legg til ny Server");
		System.out.println("4: Vis oversikt over registrerte maskiner");
		System.out.println("q: Avslutt og lukk grensesnitt");
		System.out.println("-".repeat(30));
		String menu = in.next();

		if (menu.equals("q")) {
			System.out.println("Lukker grensesnitt...");
			System.exit(0);
		} else if (menu.equals("1")){
			// TODO Legg til ny laptop

		} else if (menu.equals("2")){
			// TODO Legg til ny desktop
		} else if (menu.equals("3")){
			// TODO Legg til ny server
		} else if (menu.equals("4")){
			System.out.println(Laptop.getNumberOfLaptops());
			System.out.println(Desktop.getNumberOfDesktops());
			System.out.println(Computer.getNumberOfComputers());
		}
	}
	}
}
