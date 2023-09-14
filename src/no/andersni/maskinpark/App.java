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
			// Legg til ny laptop
			Laptop.createNewLaptop();
		} else if (menu.equals("2")){
			// TODO Legg til ny desktop
			Desktop.createNewDesktop();
		} else if (menu.equals("3")){
			// TODO Legg til ny server
		} else if (menu.equals("4")){
			while (true) {
				System.out.println("4.1: Vis registrerte laptops");
				System.out.println("4.2: Vis registrerte desktops");
				System.out.println("4.3: Vis registrerte servere");
				System.out.println("4.4: Vis alle registrerte maskiner");
				System.out.println("4.5: Returner til meny");
				String infoMenu = in.next();

				if (infoMenu.equals("1")) {
					Laptop.showLaptops();
				} if (infoMenu.equals("2")) {
					Desktop.showDesktops();
				} if (infoMenu.equals("4")) {
					Computer.showComputers();
				} else if (infoMenu.equals("5")) {
					break;
				};
			}
//			System.out.println(Laptop.getNumberOfLaptops());
//			System.out.println("Registrerte laptops: "+Laptop.getLaptopList());
//			System.out.println(Desktop.getNumberOfDesktops());
//			System.out.println(Computer.getNumberOfComputers());
		} else {
			System.out.println("Ukjent menyvalg");
		}
	}
	}
}
