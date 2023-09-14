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
			// Legg til ny desktop
			Desktop.createNewDesktop();
		} else if (menu.equals("3")){
			// Legg til ny server
			Server.createNewServer();
		} else if (menu.equals("4")){
			while (true) {
				System.out.println("4.1: Vis registrerte laptops");
				System.out.println("4.2: Vis registrerte desktops");
				System.out.println("4.3: Vis registrerte servere");
				System.out.println("4.4: Vis alle registrerte maskiner");
				System.out.println("4.5: Returner til meny");
				String infoMenu = in.next();

				if (infoMenu.equals("1")) {
					ReportImpl report = new ReportImpl();
					report.showReport("Laptop");
				} if (infoMenu.equals("2")) {
					ReportImpl report = new ReportImpl();
					report.showReport("Desktop");
				} if (infoMenu.equals("3")) {
					ReportImpl report = new ReportImpl();
					report.showReport("Server");
				} if (infoMenu.equals("4")) {
					ReportImpl report = new ReportImpl();
					report.showReport("Computer");
				} else if (infoMenu.equals("5")) {
					break;
				};
			}
		} else {
			System.out.println("Ukjent menyvalg");
		}
	}
	}
}
