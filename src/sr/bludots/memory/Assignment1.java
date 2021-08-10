package sr.bludots.memory;

import java.util.Arrays;


public class Assignment1 {
	// assignment 1:

	private Long t0;
	private Long t1;
	private String[] arr;

	public void naamEnAantalRecords(String[] arr, String naam) {
		// vul een array met 1 miljoen records (allemaal zelfde naam)
		t0 = System.currentTimeMillis();
		this.arr = arr;
		for (int i = 1; i <= arr.length - 1; i++) {
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
	}

	// zoek naar dit record en laat zien hoe lang dit duurt.

	public void zoekRecord(Integer key) {
		
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[key] == arr[i]) {
				System.out.println(arr[i]);
				break;
			}
		}
		t1 = System.currentTimeMillis();
		
		System.out.println("Duration: "+ (t1 - t0)+ " milliseconds");


	}
}
