/**
 * Uebungsgruppe G6E (Stadler, Niehaus, Pöll)
 * 
 */

/**
 * 
 * @author Henner Niehaus
 * @version 1.0
 */
public class Loesung42 {

	/**
	 * Zwei Arryays, die die Anzahl an Geldscheinen [500, 200, 100, 50, 20, 10
	 * ,5] bzw. Münzen [2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01] in eben dieser
	 * Reihenfolge repräsentieren.
	 * 
	 */
	private int[] coins = new int[8], notes = new int[7];

	/**
	 * Berechnet die Stückelung des übergebenen Geldbetrags in möglichst großen
	 * Scheinen und Münzen
	 * 
	 * @param euroAmount, centAmount
	 * @return
	 */
	public void calcDenomination(int euroAmount, int centAmount) {
		euroAmount += (int) (centAmount / 100.);
		centAmount %= 100;

		euroAmount = denominateNotes(euroAmount);
		centAmount += 100 * euroAmount;
		denominateCoins(centAmount);
		printMoney();
	}

	/**
	 * Gibt die Arrays, die die Stückelung repräsentieren, in der Konsole aus.
	 * 
	 * @param
	 * @return
	 */
	private void printMoney() {
		System.out.println("500 Euro Scheine: " + notes[0]
				+ "\t200 Euro Scheine: " + notes[1] + "\t100 Euro Scheine: "
				+ notes[2] + "\n50 Euro Scheine: " + notes[3]
				+ "\t20 Euro Scheine: " + notes[4] + "\t10 Euro Scheine: "
				+ notes[5] + "\n5 Euro Scheine: " + notes[6]
				+ "\t2 Euro Muenzen: " + coins[0] + "\t1 Euro Muenzen: "
				+ coins[1] + "\n50 Cent Muenzen: " + coins[2]
				+ "\t20 Cent Muenzen: " + coins[3] + "\t10 Cent Muenzen: "
				+ coins[4] + "\n5 Cent Muenzen: " + coins[5]
				+ "\t2 Cent Muenzen: " + coins[6] + "\t1 Cent Muenzen: "
				+ coins[7] + "\n\n");
	}

	/**
	 * Teilt den übergebenen Eurobetrag in Scheine auf. Dabei werden die jeweils
	 * größtmöglichen gewählt. Gibt den unstückelbaren Rest (sollte <5 sein)
	 * zurück.
	 * 
	 * @param euros
	 * @return restAmount
	 */
	private int denominateNotes(int euros) {
		notes[0] = (int) (euros / 500.);
		euros %= 500;
		notes[1] = (int) (euros / 200.);
		euros %= 200;
		notes[2] = (int) (euros / 100.);
		euros %= 100;
		notes[3] = (int) (euros / 50.);
		euros %= 50;
		notes[4] = (int) (euros / 20.);
		euros %= 20;
		notes[5] = (int) (euros / 10.);
		euros %= 10;
		notes[6] = (int) (euros / 5.);
		return (euros %= 5);
	}

	/**
	 * Teilt den übergebenen Centbetrag in Münzen auf. Dabei werden die jeweils
	 * größtmöglichen gewählt. Gibt den unstückelbaren Rest zurück (sollte = 0
	 * sein).
	 * 
	 * @param cents
	 * @return restAmount
	 */
	private int denominateCoins(int cents) {
		coins[0] = (int) (cents / 200.);
		cents %= 200;
		coins[1] = (int) (cents / 100.);
		cents %= 100;
		coins[2] = (int) (cents / 50.);
		cents %= 50;
		coins[3] = (int) (cents / 20.);
		cents %= 20;
		coins[4] = (int) (cents / 10.);
		cents %= 10;
		coins[5] = (int) (cents / 5.);
		cents %= 5;
		coins[6] = (int) (cents / 2.);
		cents %= 2;
		coins[7] = cents;
		return cents;
	}
	
	/*
	 * Hier können Aufrufe und Tests der Geldstückelung eingetragen werden.
	 * Diese Methode sollte durch die Main Methode gestartet werden, nachdem ein entsprechendes
	 * Aufgabe42 Objekt erstellt wurde.
	 */
	public void run() {
		calcDenomination(112, 450); // 116,5€, Sollte 1x100€, 1x10€,1x5€, 1x1€, 1x0,5€ ausgeben
		calcDenomination(1, 0); // 1€, Sollte 1x1€ ausgeben
		calcDenomination(0, 20); // 0,2€, Sollte 1x0,2€ ausgeben
		calcDenomination(200, 1); // 200,01€, Sollte 1x200€, 1x0,01€ ausgeben
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Loesung42()).run();
	}

}
