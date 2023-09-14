package no.andersni.maskinpark;

import java.util.List;

public class ReportImpl implements Report {
	@Override
	public void showReport(String computerType) {
		if (computerType.equals("Laptop") || computerType.equals("Desktop") || computerType.equals("Server")) {
			int numberOfComputers = 0;
			List<? extends Computer> computerList = null;

			if (computerType.equals("Laptop")) {
				numberOfComputers = Laptop.getNumberOfLaptops();
				computerList = Laptop.laptopList;
			} else if (computerType.equals("Desktop")) {
				numberOfComputers = Desktop.getNumberOfDesktops();
				computerList = Desktop.desktopList;
			} else if (computerType.equals("Server")) {
				numberOfComputers = Server.getNumberOfServers();
				computerList = Server.serverList;
			}

			System.out.println(numberOfComputers + (numberOfComputers == 1 ? " " + computerType : " " + computerType + "s"));
			System.out.println("-".repeat(30));
			System.out.printf("%-15s %-15s %-15s %-6s\n", "Produsent", "Modell", "Produksjonsår", "Pris");

			for (Computer computer : computerList) {
				System.out.printf("%-15s %-15s %-15s %-6s\n", computer.getBrand(), computer.getModelName(), computer.modelYear, computer.getPrice());
			}

			System.out.println("-".repeat(30));
			int sum = computerList.stream().mapToInt(Computer::getPrice).sum();
			System.out.printf("%-22s %-6d\n", "SUM", sum);
			System.out.println("-".repeat(30));
		} else if (computerType.equals("Computer")) {
			if (Laptop.getNumberOfLaptops() > 0) {
				showReport("Laptop");
			}
			if (Desktop.getNumberOfDesktops() > 0) {
				showReport("Desktop");
			}
			if (Server.getNumberOfServers() > 0) {
				showReport("Server");
			}

			int totalNumberOfComputers = Computer.getNumberOfComputers();
			System.out.println(totalNumberOfComputers + (totalNumberOfComputers == 1 ? " Computer" : " Computers"));
			System.out.println("-".repeat(30));
			System.out.printf("%-22s %-6d\n", "TOTAL SUM", Computer.getTotalPriceOfComputers());
			System.out.println("-".repeat(30));
		}
	}


	@Override
	public void saveReportToFile(String filetype) {
	// TODO
	}

	@Override
	public void saveReportToDB(String database) {
	// TODO
	}
}
