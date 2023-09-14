package no.andersni.maskinpark;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	protected String brand;
	protected String modelName;
	protected int modelYear;
	protected int price;
	protected String processor;
	protected int weight;
	protected int ram;
	protected int storage;

	static int numberOfComputers;

	protected static List<Computer> computerList = new ArrayList<>();

	public Computer() {
		numberOfComputers++;
	}

	public static void showComputers() {
		System.out.println(getNumberOfComputers() + (getNumberOfComputers() == 1 ? " Maskin" : " Maskiner"));
		System.out.println("-".repeat(30));
		System.out.printf("%-15s %-15s %-15s %-6s\n", "Produsent", "Modell", "Produksjonsår", "Pris");
		for (Computer computer : computerList) {
			System.out.printf("%-15s %-15s %-15s %-6s\n", computer.getBrand(), computer.getModelName(), computer.modelYear, computer.getPrice());
		}
		System.out.println("-".repeat(30));
		int sum = computerList.stream().mapToInt(Computer::getPrice).sum();
		System.out.printf("%-22s %-6d\n", "SUM", sum);
		System.out.println("-".repeat(30));
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	static int getNumberOfComputers() {
		return numberOfComputers;
	}

	public static int getTotalPriceOfComputers() {
		return computerList.stream().mapToInt(Computer::getPrice).sum();
	}
}
