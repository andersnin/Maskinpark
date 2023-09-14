package no.andersni.maskinpark;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laptop extends Computer {
	protected String batteryType;
	protected int screenSize;
	private static int numberOfLaptops;

	protected static List<Laptop> laptopList = new ArrayList<>();

	public Laptop() {
		super(); // Run constructor in Computers
		numberOfLaptops++;
	}

	public Laptop(String batteryType, int screenSize) {
		this();
		this.batteryType = batteryType;
		this.screenSize = screenSize;
	}

	public static int getNumberOfLaptops() {
		return numberOfLaptops;
	}

	public static void createNewLaptop() {
		System.out.println("Legg inn laptop:");
		Laptop l = new Laptop();
		Scanner add = new Scanner(System.in);

		System.out.print("Tast inn produsent:");
		String brand = add.nextLine();
		l.setBrand(brand);

		System.out.print("Tast inn modell:");
		String model = add.nextLine();
		l.setModelName(model);

		System.out.print("Tast inn årsmodell:");
		int modelYear = add.nextInt();
		l.setModelYear(modelYear);

		System.out.print("Tast inn pris:");
		int price = add.nextInt();
		l.setPrice(price);

		laptopList.add(l);
		Computer.computerList.add(l);
	}

	public static void showLaptops() {
		System.out.println(getNumberOfLaptops() + (getNumberOfLaptops() == 1 ? " Laptop" : " Laptopper"));
		System.out.println("-".repeat(30));
		System.out.printf("%-15s %-15s %-15s %-6s\n", "Produsent", "Modell", "Produksjonsår", "Pris");
		for (Laptop laptop : laptopList) {
			System.out.printf("%-15s %-15s %-15s %-6s\n", laptop.getBrand(), laptop.getModelName(), laptop.modelYear, laptop.getPrice());
		}
		System.out.println("-".repeat(30));
		int sum = laptopList.stream().mapToInt(Laptop::getPrice).sum();
		System.out.printf("%-22s %-6d\n", "SUM", sum);
		System.out.println("-".repeat(30));
	}

	public static List<Laptop> getLaptopList() {
		return laptopList;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}


	public String getBatteryType() {
		return batteryType;
	}

	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"brand='" + brand + '\'' +
				", modelName='" + modelName + '\'' +
				", modelYear=" + modelYear +
				", price=" + price +
				", batteryType='" + batteryType + '\'' +
				", processor='" + processor + '\'' +
				", screenSize=" + screenSize +
				", weight=" + weight +
				", ram=" + ram +
				", storage=" + storage +
				'}';
	}
}
