package no.andersni.maskinpark;

public class Laptop extends Computer {
	protected String batteryType;
	protected int screenSize;
	private static int numberOfLaptops;

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
