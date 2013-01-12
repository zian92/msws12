import de.js.GeldStueckelung;

/**
 * Uebungsgruppe G6E (Stadler, Niehaus, Pöll)
 * 
 */

/**
 * 
 * @author Jonas Stadler
 * @version 1.0
 */

public class Loesung42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeldStueckelung gs = new GeldStueckelung();
		
		gs.stueckel(503.5);
		gs.makeOutput();
		//System.out.println(GeldStueckelung.getGeldWerte()[2]);
	}

}
