package no.andersni.maskinpark;

public class Desktop extends Computer {
	private String cabinetType;
	private static int numberOfDesktops;

	public Desktop() {
		super(); // Run constructor in Computer
		numberOfDesktops++;
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
