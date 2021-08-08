package sr.bludots.memory;

import java.util.Arrays;

public class Assignment1 {
	// assignment 1:

	private Long t0;
	private Long t1;
	private String[] arr;

	public void naamEnAantalRecords(String[] arr, String naam) {
		t0 = System.currentTimeMillis();
		// vul een array met 1 miljoen records (allemaal zelfde naam)
		this.arr = arr;
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = naam;
		}

		System.out.println(Arrays.toString(arr));
	}

	public void wijzigEersteMidLaatsteRecord(String eerstNaam, String tweedeNaam, String derdeNaam) {
		// wijzig steeds van 1 record (de laatste, de middelste en de eerste) de naam
		int eersteIndex = 0;
		int laatsteIndex = arr.length - 1;
		int midIndex = (eersteIndex + laatsteIndex) / 2;

		arr[eersteIndex] = eerstNaam;
		arr[midIndex] = tweedeNaam;
		arr[laatsteIndex] = derdeNaam;

		System.out.println(Arrays.toString(arr));
		t1 = System.currentTimeMillis();
	}

	// zoek naar dit record en laat zien hoe lang dit duurt.

	public void tijdsDuur() {

		Long tijdsduur = t1 - t0;

		System.out.println("Tijdsduur: " + tijdsduur + " milliseconde");

	}
}
