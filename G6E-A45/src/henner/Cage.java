package henner;

public class Cage extends Habitat {

	/**
	 * Erstellt ein Käfigobjekt mit den gegebenen Attributen.
	 * @param id			Die eindeutige ID
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public Cage(int id, int width, int length, int numberOfDoors, ZooKeeper keeper) {
		super(id, width, length, numberOfDoors, keeper);
	}

}
