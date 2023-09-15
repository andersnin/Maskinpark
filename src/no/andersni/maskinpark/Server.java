package no.andersni.maskinpark;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server extends Computer {
	private String cabinetType;
	private static int numberOfServers;
	protected static List<Server> serverList = new ArrayList<>();

	public Server() {
		super(); // Run constructor in Computer
		numberOfServers++;
	}

	public Server(String cabinetType) {
		this();
		this.cabinetType = cabinetType;
	}

	public static void createNewServer() {
		System.out.println("Legg inn server:");
		Server s = new Server();
		Scanner add = new Scanner(System.in);

		System.out.print("Tast inn produsent:");
		String brand = add.nextLine();
		s.setBrand(brand);

		System.out.print("Tast inn modell:");
		String model = add.nextLine();
		s.setModelName(model);

		System.out.print("Tast inn årsmodell:");
		int modelYear = add.nextInt();
		s.setModelYear(modelYear);

		System.out.print("Tast inn pris:");
		int price = add.nextInt();
		s.setPrice(price);

		serverList.add(s);
		Computer.computerList.add(s);
	}

	public String getCabinetType() {
		return cabinetType;
	}

	public void setCabinetType(String cabinetType) {
		this.cabinetType = cabinetType;
	}

	public static int getNumberOfServers() {
		return numberOfServers;
	}
}
