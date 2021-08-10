package sr.bludots.memory;

import java.util.HashMap;

public class Launcher {

	public static void main(String[] args) {
//		Assignment 1:
//
//		String[] namen = new String[1000000];
//		Assignment1 test = new Assignment1();
//		test.naamEnAantalRecords(namen, "Bryan");
//		test.wijzigEersteMidLaatsteRecord("Winston", "Mario", "Cheryl");
//		test.zoekRecord(999999);

//		Assignment2

		HashMap<Integer, String> lijstNamen = new HashMap<>();
		Assignment2 test2 = new Assignment2();

		test2.aantalRecordsEnNaam(lijstNamen, 10000, "Bryan");
		test2.tijdsDuurRecordAanmaken();
		test2.veranderIndexNaam(3, "Winston");
		test2.vraagNaarRecord(9999);
	}

}
