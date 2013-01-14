/**
 *  Uebungsgruppe _____
 *  (Namen der Teilnehmer)
 *
 */

public class TestSchaltnetz {

    public void run() {

	Schaltnetz meinNetz = new Schaltnetz();

	/*
	  Erzeuge einen OR-Baustein.
	  Erzeuge einen AND-Baustein.
	  Verbinde den x-Eingang des OR-Bausteins mit dem Ausgang des AND-Bausteins.
	  Verbinde den y-Eingang des OR-Bausteins mit dem y-Eingang des Schaltnetzes.
	  Verbinde den x-Eingang des AND-Bausteins mit dem x-Eingang des Schaltnetzes.
	  Verbinde den y-Eingang des AND-Bausteins mit dem y-Eingang des Schaltnetzes.
	  Verbinde des Ausgang des Schaltnetzes mit dem Ausgang des OR-Bausteins.
	*/
	
	System.out.println("(true ,true ) -> " + meinNetz.eval(true,true) + 
			   " (sollte true sein)");
	System.out.println("(true ,false) -> " + meinNetz.eval(true,false) + 
			   " (sollte false sein)");
	System.out.println("(false,false) -> " + meinNetz.eval(false,false)  + 
			   " (sollte false sein)");
	System.out.println("(false,true ) -> " + meinNetz.eval(false,true) + 
			   " (sollte true sein)"); 
	
	/* 
	  Erzeuge einen NOT-Baustein.
	  Verbinde den Eingang des NOT-Bausteins mit dem Ausgang des OR-Bausteins.
	  Verbinde des Ausgang des Schaltnetzes mit dem Ausgang des NOT-Bausteins.
	*/

	System.out.println("Mit invertierter Ausgabe:");

	System.out.println("(true ,true ) -> " + meinNetz.eval(true,true) + 
			   " (sollte false sein)");
	System.out.println("(true ,false) -> " + meinNetz.eval(true,false) + 
			   " (sollte true sein)");
	System.out.println("(false,false) -> " + meinNetz.eval(false,false)  + 
			   " (sollte true sein)");
	System.out.println("(false,true ) -> " + meinNetz.eval(false,true) + 
			   " (sollte false sein)"); 

    }

    public static void main(String[] args) {
	TestSchaltnetz test = new TestSchaltnetz();
	test.run();	
    }

}