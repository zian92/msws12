import java.io.File;

import org.mediacomputation.givenclasses.FileChooser;
import org.mediacomputation.givenclasses.Picture;
import org.mediacomputation.givenclasses.Pixel;

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

			// TODO faktoren neu berechnen!!!!!!!!!!!!!!
			// TODO
			// TODO

			int newScaleX = (int) (xScale + 0.5);
			int newScaleY = (int) (yScale + 0.5);
			int newSX = (int) (input.getWidth() * (xScale));
			int newSY = (int) (input.getHeight() * (yScale));

			if (newScaleX == newScaleY && newScaleX == 1) return input; // falls keine saklierung vorgenomen wird

			// int x = (int) java.lang.Math.floor(input.getWidth() / newx); // x pixel scale ->
			// int y = (int) java.lang.Math.floor(input.getHeight() / newy); // y pixel scale

			output = new Picture(newSX, newSY);
			int sdUPixelX = 0;// berechnen
			int sdCPixelX = 0;
			int sdAPixelx = 0;
			int sdUPixelY = 0;// berechnen
			int sdCPixelY = 0;
			int sdAPixelY = 0;

			if (newScaleX < 1) {
				sdUPixelX = input.getWidth() / (input.getWidth() * newScaleX);
			}
			if (newScaleY < 1) {
				sdUPixelY = input.getHeight() / (input.getHeight() * newScaleY);
			}

			for (int i = 0; i < input.getWidth(); i++) { // breite
				for (int j = 0; j < input.getHeight(); j++) { // höhe
					Pixel p = input.getPixel(i, j);
					System.out.println("Work X: " + i + " Y: " + j);
					if (newSX < 1) { // verkleinerung breite
						if (sdCPixelX < sdUPixelX) {
							sdCPixelX++;
						} else {
							output.setBasicPixel(sdAPixelx, sdAPixelY, this.makeRGB(p.getRed(), p.getGreen(), p.getBlue()));
							sdCPixelX = 0;
						}
					} else { // vergrößerung breite
						for (int k = 0; k < newSX; k++) {
							output.setBasicPixel(i + k, j, this.makeRGB(p.getRed(), p.getGreen(), p.getBlue()));
						}
					}
					if (newSY < 1) {// verkleinerun höhe
						if (sdCPixelY < sdUPixelY) {
							sdCPixelY++;
						} else {
							output.setBasicPixel(sdAPixelx, sdAPixelY, this.makeRGB(p.getRed(), p.getGreen(), p.getBlue()));
							sdCPixelY = 0;
						}
					} else {// vergrößerung höhe
						for (int k = 0; k < newSY; k++) {
							output.setBasicPixel(i, j + k, this.makeRGB(p.getRed(), p.getGreen(), p.getBlue()));
						}
					}
				}
			}

			// Zeige das Bild zur Kontrolle an.
			input.hide();
			output.show();

		}

		return output;
	}

	/**
	 * Creates a RGB value
	 * 
	 * @author Jonas Stadler
	 * @version 1.0
	 * @param red
	 *            red
	 * @param green
	 *            green
	 * @param blue
	 *            blue
	 * @return
	 */
	private int makeRGB(int red, int green, int blue) {
		return red * 65536 + green * 256 + blue;
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