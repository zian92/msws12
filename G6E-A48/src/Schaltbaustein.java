/**
 * Modellierung eines Schaltbausteins, z.B. AND, OR oder NOT.
 * Der Baustein hat genau einen Ausgang, an dem der berechnete
 * Boolesche Wert anliegt.
 */
abstract public class Schaltbaustein {

    /**
     * Auslesen des durch den Schaltbaustein berechneten Werts.
     * @return Berechneter Wert.
     */
    abstract public boolean eval();

}