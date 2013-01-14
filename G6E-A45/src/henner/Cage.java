package henner;

public class Cage extends Habitat {

	/**
	 * Erstellt ein K�figobjekt mit den gegebenen Attributen.
	 * @param id			Die eindeutige ID
	 * @param width			Die Breite in Metern
	 * @param length		Die L�nge in Metern
	 * @param numberOfDoors	Die Anzahl der T�ren
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public Cage(int id, int width, int length, int numberOfDoors, ZooKeeper keeper) {
		super(id, width, length, numberOfDoors, keeper);
	}

}
