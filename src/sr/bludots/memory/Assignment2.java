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

	private HashMap<Integer, String> hashMap;
	private Integer records;
	private Long tr0;
	private Long tr1;

	public void aantalRecordsEnNaam(HashMap<Integer, String> hashMap, Integer records, String naam) {
		tr0 = System.currentTimeMillis();
		this.hashMap = hashMap;
		this.records = records;

		for (int i = 1; i <= records; i++) {
			hashMap.put(i, naam);
		}

		System.out.println(hashMap);
		tr1 = System.currentTimeMillis();
	}
	
	public void tijdsDuurRecordAanmaken() {
		System.out.println("Aanmaken van " + records + " records: " + (tr1 - tr0) + " milliseconde");
	}

	public void veranderIndexNaam(Integer record, String naam) {

		hashMap.put(record, naam);

		System.out.println("Record Update " + hashMap);
	}

	public void vraagNaarRecord(Integer vraagRecord) {
		Long t0 = System.currentTimeMillis();
		for (int i = 0; i <= records; i++) {
			if (hashMap.containsKey(vraagRecord) == hashMap.containsKey(i)) {
				System.out.println("Opgevraagd record: " + hashMap.get(i));
				break;
			}
		}
		Long t1 = System.currentTimeMillis();

		System.out.println("Opvraagtijdsduur: " + (t1 - t0) + " milliseconde");

	}

}
