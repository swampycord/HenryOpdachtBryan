package sr.bludots.memory;
//assignment 1:

import java.util.HashMap;

public class Assignment2 {

	// assignments 2:
	// vul een hashmap met 1 miljoen records, gebruik elke keer een unieke id, de
	// naam mag steeds hetzelfde
	// zijn of mag je veranderen als je dat voor elkaar krijgt
	// meet hoe lang het duurt om een record op te vragen
	// maak 1 record met een andere naam,
	// meet ook hoe lang het duurt om dit record via zijn key op te vragen...

	private HashMap<Integer, String> namen = new HashMap<>();
	private Long t0;
	private Long t1;
	private Integer totaalRecords;
	private String melding = "";

	public void aantalRecords(Integer totaalRecords) {
		this.totaalRecords = totaalRecords;
	}

	public void recordsEnNamen(Integer index, String naam) {
		t0 = System.currentTimeMillis();

		for (int i = 0; i <= totaalRecords; i++) {
			if (index <= totaalRecords && naam.matches("^[a-zA-Z]*$")) {
				if (namen.containsKey(index)) {
					namen.replace(index, naam);
				} else {
					namen.put(index, naam);
				}
			} else if (index > totaalRecords) {
				melding = index + " en hoger zijn buiten totale records";
			}
		}
		t1 = System.currentTimeMillis();

	}

	public void showRecords() {
		System.out.println(namen);
		System.out.println("Tijdsduur: " + (t1 - t0) + " milliseconde");
		System.err.println(melding);
	}

}
