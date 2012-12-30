/**
 * Uebungsgruppe _____ (Namen der Teilnehmer)
 * 
 */

public class ImagePuzzle {

	/**
	 * Loesung der Aufgabe 37(a) / Blatt 10 / Wintersemester 2012/2013.
	 */
	public void solveBlackPuzzle() {

		// Erstelle Dialog zur Auswahl einer Bilddatei und lade das
		// ausgewaehlte Bild.
		Picture input = new Picture(FileChooser.pickAFile());

		// Referenzvariable, die auf das zu erstellende Bild verweisen soll.
		Picture output = null;

		// Falls keine Datei ausgewaehlt wurde, ist nichts zu tun.
		if (input != null) {

			// Zeige das Bild zur Kontrolle an.
			input.show();

			/*
			 * Hier ist die Loesung zu Aufgabe 37(a) einzutragen.
			 */

			// Zeige das auszugebende Bild an.
			output.show();

			// Schreibe das auszugebende Bild in eine Datei.
			String directory = ""; // Hier muss ein gueltiger Verzeichnisname
			// eingesetzt werden,
			// z.B. "C:\" oder "/Users/Shared/" oder ...
			output.write(directory + "black-puzzle-solution.png");
		}
	}

	/**
	 * Loesung der Aufgabe 37(b) / Blatt 10 / Wintersemester 2012/2013.
	 */
	public void solveGrassPuzzle() {

		// Erstelle Dialog zur Auswahl einer Bilddatei und lade das
		// ausgewaehlte Bild.
		Picture input = new Picture(FileChooser.pickAFile());

		// Referenzvariable, die auf das zu erstellende Bild verweisen soll.
		Picture output = null;

		// Falls keine Datei ausgewaehlt wurde, ist nichts zu tun.
		if (input != null) {

			// Zeige das Bild zur Kontrolle an.
			input.show();

			/*
			 * Hier ist die Loesung zu Aufgabe 37(b) einzutragen.
			 */

			// Zeige das auszugebende Bild an.
			output.show();

			// Schreibe das auszugebende Bild in eine Datei.
			String directory = "";
			// Hier muss ein gueltiger Verzeichnisname
			// eingesetzt werden,
			// z.B. "C:\" oder "/Users/Shared/" oder ...
			output.write(directory + "grass-puzzle-solution.png");
		}
	}

	public static void main(String args[]) {

		ImagePuzzle ip = new ImagePuzzle();

		ip.solveBlackPuzzle(); // Loese Aufgabe 37(a).
		ip.solveGrassPuzzle(); // Loese Aufgabe 37(b).

	}

}