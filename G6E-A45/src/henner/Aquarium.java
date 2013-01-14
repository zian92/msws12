package henner;

public class Aquarium extends Habitat{
	/**
	 * Die Tiefe des Aquariums in Metern.
	 */
	private int depth;
	
	/**
	 * Erstellt ein Aquariumobjekt mit den gegebenen Attributen.
	 * @param id			Die eindeutige ID
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param depth			Die Tiefe in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public Aquarium(int id, int width, int length, int depth, int numberOfDoors, ZooKeeper keeper) {
		super(id, width, length, numberOfDoors, keeper);
		this.depth = depth;
	}

}
