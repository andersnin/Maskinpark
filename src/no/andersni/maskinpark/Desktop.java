package no.andersni.maskinpark;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desktop extends Computer {
	private String cabinetType;
	private static int numberOfDesktops;

	protected static List<Desktop> desktopList = new ArrayList<>();

	public Desktop() {
		super(); // Run constructor in Computer
		numberOfDesktops++;
	}

	public static void createNewDesktop() {
		System.out.println("Legg inn desktop:");
		Desktop d = new Desktop();
		Scanner add = new Scanner(System.in);

		System.out.print("Tast inn produsent:");
		String brand = add.nextLine();
		d.setBrand(brand);

		System.out.print("Tast inn modell:");
		String model = add.nextLine();
		d.setModelName(model);

		System.out.print("Tast inn årsmodell:");
		int modelYear = add.nextInt();
		d.setModelYear(modelYear);

		System.out.print("Tast inn pris:");
		int price = add.nextInt();
		d.setPrice(price);

		desktopList.add(d);
		Computer.computerList.add(d);
	}

	public static void showDesktops() {
		System.out.println(getNumberOfDesktops() + (getNumberOfDesktops() == 1 ? " Desktop" : " Desktopper"));
		System.out.println("-".repeat(30));
		System.out.printf("%-15s %-15s %-15s %-6s\n", "Produsent", "Modell", "Produksjonsår", "Pris");
		for (Desktop desktop : desktopList) {
			System.out.printf("%-15s %-15s %-15s %-6s\n", desktop.getBrand(), desktop.getModelName(), desktop.modelYear, desktop.getPrice());
		}
		System.out.println("-".repeat(30));
		int sum = desktopList.stream().mapToInt(Desktop::getPrice).sum();
		System.out.printf("%-22s %-6d\n", "SUM", sum);
		System.out.println("-".repeat(30));
	}

	public Desktop(String cabinetType) {
		this();
		this.cabinetType = cabinetType;
	}

	public String getCabinetType() {
		return cabinetType;
	}

	public void setCabinetType(String cabinetType) {
		this.cabinetType = cabinetType;
	}

	public static int getNumberOfDesktops() {
		return numberOfDesktops;
	}
}
