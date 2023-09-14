package no.andersni.maskinpark;

public interface Report {
	void showReport(String computerType);
	void saveReportToFile(String filetype);
	void saveReportToDB(String database);
} // TODO Implementer rapport i klasser
