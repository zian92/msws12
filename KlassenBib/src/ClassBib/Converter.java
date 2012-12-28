package ClassBib;
/**
 * Uebungsgruppe G6E (Namen der Teilnehmer)
 * 
 */

/**
 * 
 * @author Jonas Stadler
 * @version 1.0
 */
public class Converter {

	/**
	 * Convertiert die uebergebene Zahl in eine roemische Zahl.
	 * 
	 * @param temp
	 * @return
	 */
	private String convertRomanZehner(String temp) {
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
	private String convertRomanHunderter(String temp) {
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
	private String convertRomanTausender(String temp) {
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
	private String convertRomanEiner(String temp) {
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
	public String convertIntToRomanInt(int n) {
		String number = String.valueOf(n);
		String romanNumber = "";
		if (number.length() > 4) {
			number = number.substring(0, 4);
		}

		if (Integer.valueOf(number) > 999) {
			romanNumber = romanNumber + this.convertRomanTausender(number.substring(0, 1));
			number = number.substring(1);
		}
		if (Integer.valueOf(number) > 99) {
			romanNumber = romanNumber + this.convertRomanHunderter(number.substring(0, 1));
			number = number.substring(1);
		}
		if (Integer.valueOf(number) > 9) {
			romanNumber = romanNumber + this.convertRomanZehner(number.substring(0, 1));
			number = number.substring(1);
		}
		romanNumber = romanNumber + this.convertRomanEiner(number);
		return romanNumber;
	}

	/**
	 * Loesung der Aufgabe 40 / Blatt 10 / Wintersemester 2012/2013.
	 */
	public void testconvertIntToRomanInt() {
		// Beispieltests.
		System.out.println("   1 = " + convertIntToRomanInt(1)); // Sollte "I" ergeben.
		System.out.println("   4 = " + convertIntToRomanInt(4)); // Sollte "IV" ergeben.
		System.out.println("   9 = " + convertIntToRomanInt(9)); // Sollte "IX" ergeben.
		System.out.println("  17 = " + convertIntToRomanInt(17)); // Sollte "XVII" ergeben.
		System.out.println("  47 = " + convertIntToRomanInt(47)); // Sollte "XLVII" ergeben.
		System.out.println("  99 = " + convertIntToRomanInt(99)); // Sollte "XCIX" ergeben.
		System.out.println("1000 = " + convertIntToRomanInt(1000)); // Sollte "M" ergeben.
		System.out.println("1498 = " + convertIntToRomanInt(1498)); // Sollte "MCDXCVIII" ergeben.
		System.out.println("2999 = " + convertIntToRomanInt(2999)); // Sollte "MMCMXCIX" ergeben.
		System.out.println("3999 = " + convertIntToRomanInt(3999)); // Sollte "MMMCMXCIX" ergeben.
	}
}