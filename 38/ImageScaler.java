import java.io.File;

import org.mediacomputation.givenclasses.FileChooser;
import org.mediacomputation.givenclasses.Picture;

/**
 * Uebungsgruppe _____ (Namen der Teilnehmer)
 * 
 */

public class ImageScaler {

	private Picture input;

	public ImageScaler() {

		// Erstelle Dialog zur Auswahl einer Bilddatei und lade das
		// ausgewaehlte Bild.
		input = new Picture(FileChooser.pickAFile());

	}

	/**
	 * Skaliere ein Bild.
	 * 
	 * @param xScale
	 *            Skalierungsfaktor in x-Richtung
	 * @param yScale
	 *            Skalierungsfaktor in y-Richtung
	 * @return Picture Referenz auf das skalierte Bild
	 */
	public Picture scale(double xScale, double yScale) {

		// Referenzvariable, die auf das zu erstellende Bild verweisen soll.
		Picture output = null;

		// Falls keine Datei ausgewaehlt wurde, ist nichts zu tun.
		if (input != null) {

			// Zeige das Bild zur Kontrolle an.
			input.show();

			/*
			 * Hier ist die Loesung zu Aufgabe 38 einzutragen.
			 */

			// Zeige das Bild zur Kontrolle an.
			output.show();

		}

		return output;
	}

	/**
	 * Loesung der Aufgabe 38 / Blatt 10 / Wintersemester 2012/2013.
	 */
	public void run() {

		Picture output;

		String directory = new File("").getAbsolutePath() + "\\"; // Hier muss ein gueltiger Verzeichnisname
		// eingesetzt werden,
		// z.B. "C:\" oder "/Users/Shared/" oder ...

		// Erster Test
		output = scale(2.00, 1.00);
		output.write(directory + "scaled0.png");

		// Zweiter Test
		output = scale(1.00, 1.50);
		output.write(directory + "scaled1.png");

		// Dritter Test
		output = scale(0.36, 2.79);
		output.write(directory + "scaled2.png");

	}

	public static void main(String[] args) {

		ImageScaler is = new ImageScaler();
		is.run();

	}

}
