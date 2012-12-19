/**
 * Uebungsgruppe G6E (Namen der Teilnehmer)
 * 
 */

/**
 * 
 * @author Jonas Stadler
 * @version 1.0
 */
public class Loesung40 {

	private final String ZTAG = "test";
	/**
	 * Wandele eine Zahl zwischen 1 und 3000 (jeweils inklusive) in ihre Darstellung im roemischen Zahlsystem um.
	 * 
	 * @param n
	 *            umzuwandelnde Zahl
	 * @return String Referenz auf die Repraesentation der umgewandelten Zahl.
	 */
	public String convertNumber(int n) {
		String number = String.valueOf(n);
		String romanNumber ="";
		
		if(number.length() > 4){
			number = number.substring(0, 4);
		}
		return number;
	//	return romanNumber;
	}

	/**
	 * Loesung der Aufgabe 40 / Blatt 10 / Wintersemester 2012/2013.
	 */
	public void run() {

		// Beispieltests.
		System.out.println("   1 = " + convertNumber(1)); // Sollte "I" ergeben.
		System.out.println("   4 = " + convertNumber(4)); // Sollte "IV" ergeben.
		System.out.println("   9 = " + convertNumber(9)); // Sollte "IX" ergeben.
		System.out.println("  17 = " + convertNumber(17)); // Sollte "XVII" ergeben.
		System.out.println("  47 = " + convertNumber(47)); // Sollte "XLVII" ergeben.
		System.out.println("  99 = " + convertNumber(99)); // Sollte "XCIX" ergeben.
		System.out.println("1000 = " + convertNumber(1000)); // Sollte "M" ergeben.
		System.out.println("1498 = " + convertNumber(1498)); // Sollte "MCDXCVIII" ergeben.
		System.out.println("2999 = " + convertNumber(2999)); // Sollte "MMCMXCIX" ergeben.
		//System.out.println("2999 = " + convertNumber(2900909)); // Sollte "MMCMXCIX" ergeben.

	}

	public static void main(String[] args) {

		Loesung40 meineLoesung = new Loesung40();
		meineLoesung.run();

	}
}
