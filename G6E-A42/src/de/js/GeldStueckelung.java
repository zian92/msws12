package de.js;

/**
 * Uebungsgruppe G6E (Stadler, Niehaus, Pöll)
 * 
 */

/**
 * 
 * @author Jonas Stadler
 * @version 1.0
 */

public class GeldStueckelung {

	private static double[] geldWerte = { 0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200, 500 };
	private double value;
	private int[] geldCount;

	public GeldStueckelung() {
		this.value = 0;
		this.geldCount = new int[GeldStueckelung.geldWerte.length];
	}

	public GeldStueckelung(double value) {
		this.value = value;
		this.geldCount = new int[GeldStueckelung.geldWerte.length];
	}

	public void makeOutput(){
		this.makeOutput(this.geldCount,this.value);
	}
	
	public void makeOutput(int[] foroutput, double value){
		if(foroutput.length > GeldStueckelung.geldWerte.length){
			System.out.println("Groestmoegliche stueckelung für "+value);
			for(int i =0;i< foroutput.length;i++){
				System.out.println(GeldStueckelung.getGeldBezeichnung(foroutput[i])+": "+foroutput[i]);
			}
		}else {
			System.out.println("Datenfeld zu gross.");
		}
	}
	
	public int[] stueckel() {
		return stueckel(this.value);
	}
	
	public int[] stueckel(double value) {
		for (int i = GeldStueckelung.geldWerte.length - 1; i >= 1; i--) {
			this.geldCount[i] = (int) this.devideValue(i);
			value = value - (this.geldCount[i] * GeldStueckelung.geldWerte[i]);
		}
		return this.geldCount;
	}

	public int[] getGeldCount() {
		return this.geldCount;
	}

	public double getGeldCountValue() {
		double temp = 0;
		for (int i = 0; i < GeldStueckelung.geldWerte.length; i++) {
			temp = temp + GeldStueckelung.geldWerte[i] * GeldStueckelung.geldWerte[i];
		}
		return temp;
	}

	private double devideValue(int arrayCount) {
		double val = GeldStueckelung.geldWerte[arrayCount];
		double temp = this.value % val;
		System.out.println(temp);
		return temp;
	}

	public static double getMaxWert() {
		return geldWerte[geldWerte.length - 1];
	}

	public static String getGeldBezeichnung(int arrayCount) {
		if (arrayCount < 6) return "Cent";
		return "Euro";
	}

	public static String getGeldBezeichnung(double value) {
		if (value < 1) return "Cent";
		return "Euro";
	}

	public static String[] getGeldBezeichnung() {
		String[] temp = new String[GeldStueckelung.geldWerte.length];
		for (int i = 0; i < GeldStueckelung.geldWerte.length; i++) {
			temp[i] = GeldStueckelung.geldWerte[i] + " " + GeldStueckelung.getGeldBezeichnung(GeldStueckelung.geldWerte[i]);
		}
		return temp;
	}

	public static double[] getGeldWerte() {
		return geldWerte;
	}

	public void setValue(double newValue) {
		this.value = newValue;
	}

	public double getValue() {
		return this.value;
	}
}
