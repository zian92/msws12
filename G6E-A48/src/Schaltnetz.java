/**
 * Modellierung eines Schaltnetzes mit zwei Eingaengen (X und Y),
 * an denen jeweils Boolesche Werte anliegen koennen. Das Schaltnetz
 * hat genau einen Ausgang, der dem Ausgang eines Schaltbausteins
 * entspricht.
 */
public class Schaltnetz {

    // Schaltbaustein, dessen Ausgabe der Ausgabe des
    // Schaltnetzes entspricht.
    private Schaltbaustein output; 
    
    /**
     * Setzt die Eingabe am Eingang X des Schaltnetzes.
     * @param value Neuer Wert fuer den Eingang X des Schaltnetzes
     */
    public void setValueX(boolean value) {
	/* ... */
    }
    
    /**
     * Setzt die Eingabe am Eingang Y des Schaltnetzes.
     * @param value Neuer Wert fuer den Eingang Y des Schaltnetzes
     */
    public void setValueY(boolean value) {
	/* ... */
    }
    
    /**
     * Wertet das Schaltnetz fuer die aktuell an den 
     * Eingaengen X und Y anliegenden Booleschen Werte aus.
     * @return Ergebnis der Auswertung.
     */
    public boolean eval() {
	return output.eval();
    }

    /**
     * Wertet das Schaltnetz aus, wobei angenommen wird, dass
     * die als Parameter uebergebenen Booleschen Werte an den 
     * Eingaengen X und Y anliegen.
     * @param x Boolescher Wert, der am Eingang X anliegt.
     * @param y Boolescher Wert, der am Eingang Y anliegt.
     * @return Ergebnis der Auswertung.
     */
    public boolean eval(boolean x, boolean y) {
	setValueX(x);
	setValueY(y);
	return output.eval();
    }

}