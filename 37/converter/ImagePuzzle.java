/**
 * Uebungsgruppe G6E (Namen der Teilnehmer)
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
			Pixel[] pix = null;
			// Zeige das Bild zur Kontrolle an.
			input.show();
			try {
				pix = input.getPixels();
				System.out.println("pixel bekommen");
output = input;
				for (Pixel p : pix) {
					String s = "X: " + p.getX() + " Y: " + p.getY();
					System.out.println("start " + s);
					int b = (p.getBlue() * 20);
					int g = (p.getGreen() * 20);
					int r = 0;
					output.setBasicPixel(p.getX(), p.getY(), r*65536+g*256+b); // set a pixel at described position, with rgb value
					System.out.println("end   " + s);
				}
				// Zeige das auszugebende Bild an.
				output.show();

				// Schreibe das auszugebende Bild in eine Datei.
				String directory = "./"; // Hier muss ein gueltiger Verzeichnisname
				// eingesetzt werden,
				// z.B. "C:\" oder "/Users/Shared/" oder ...
				output.write(directory + "black-puzzle-solution.png");
			} catch (Exception e) {
				System.out.println("error!");
				e.printStackTrace();
			}

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
			String directory = FileChooser.getMediaDirectory();
			// Hier muss ein gueltiger Verzeichnisname
			// eingesetzt werden,
			// z.B. "C:\" oder "/Users/Shared/" oder ...
			output.write(directory + "grass-puzzle-solution.png");
		}
	}

	public static void main(String args[]) {

		ImagePuzzle ip = new ImagePuzzle();

		ip.solveBlackPuzzle(); // Loese Aufgabe 37(a).
		// ip.solveGrassPuzzle(); // Loese Aufgabe 37(b).
System.exit(0);
	}

}