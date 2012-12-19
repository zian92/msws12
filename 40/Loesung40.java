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

	/**
	 * Convertiert die uebergebene Zahl in eine roemische Zahl.
	 * 
	 * @param temp
	 * @return
	 */
	private String convertZehner(String temp) {
		switch (Integer.valueOf(temp)) {
			case 1:
				temp = "X";
				break;
			case 2:
				temp = "XX";
				break;
			case 3:
				temp = "XXX";
				break;
			case 4:
				temp = "XL";
				break;
			case 5:
				temp = "L";
				break;
			case 6:
				temp = "LX";
				break;
			case 7:
				temp = "LXX";
				break;
			case 8:
				temp = "LXXX";
				break;
			case 9:
				temp = "XC";
				break;
			default:
				temp = "";
				break;
		}
		return temp;
	}

	/**
	 * Convertiert die uebergebene Zahl in eine roemische Zahl.
	 * 
	 * @param temp
	 * @return
	 */
	private String convertHunderter(String temp) {
		switch (Integer.valueOf(temp)) {
			case 1:
				temp = "C";
				break;
			case 2:
				temp = "CC";
				break;
			case 3:
				temp = "CCC";
				break;
			case 4:
				temp = "CD";
				break;
			case 5:
				temp = "D";
				break;
			case 6:
				temp = "DC";
				break;
			case 7:
				temp = "DCC";
				break;
			case 8:
				temp = "DCCC";
				break;
			case 9:
				temp = "CM";
				break;
			default:
				temp = "";
				break;
		}
		return temp;
	}

	/**
	 * Convertiert die uebergebene Zahl in eine roemische Zahl.
	 * 
	 * @param temp
	 * @return
	 */
	private String convertTausender(String temp) {
		switch (Integer.valueOf(temp)) {
			case 1:
				temp = "M";
				break;
			case 2:
				temp = "MM";
				break;
			case 3:
				temp = "MMM";
				break;
			default:
				temp = "";
				break;
		}
		return temp;
	}

	/**
	 * Convertiert die uebergebene Zahl in eine roemische Zahl.
	 * 
	 * @param temp
	 * @return
	 */
	private String convertEiner(String temp) {
		switch (Integer.valueOf(temp)) {
			case 1:
				temp = "I";
				break;
			case 2:
				temp = "II";
				break;
			case 3:
				temp = "III";
				break;
			case 4:
				temp = "IV";
				break;
			case 5:
				temp = "V";
				break;
			case 6:
				temp = "VI";
				break;
			case 7:
				temp = "VII";
				break;
			case 8:
				temp = "VIII";
				break;
			case 9:
				temp = "IX";
				break;
			default:
				temp = "";
				break;
		}
		return temp;
	}

	/**
	 * Wandele eine Zahl zwischen 1 und 3000 (jeweils inklusive) in ihre Darstellung im roemischen Zahlsystem um.
	 * 
	 * @param n
	 *            umzuwandelnde Zahl
	 * @return String Referenz auf die Repraesentation der umgewandelten Zahl.
	 */
	public String convertNumber(int n) {
		String number = String.valueOf(n);
		String romanNumber = "";
		if (number.length() > 4) {
			number = number.substring(0, 4);
		}

		if (Integer.valueOf(number) > 999) {
			romanNumber = romanNumber + this.convertTausender(number.substring(0, 1));
			number = number.substring(1);
		}
		if (Integer.valueOf(number) > 99) {
			romanNumber = romanNumber + this.convertHunderter(number.substring(0, 1));
			number = number.substring(1);
		}
		if (Integer.valueOf(number) > 9) {
			romanNumber = romanNumber + this.convertZehner(number.substring(0, 1));
			number = number.substring(1);
		}
		romanNumber = romanNumber + this.convertEiner(number);
		return romanNumber;
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
	}

	public static void main(String[] args) {
		Loesung40 meineLoesung = new Loesung40();
		meineLoesung.run();
	}
}