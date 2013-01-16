package de.henner.Zooverwaltungssystem;

public class ZooMonitor {
	/**
	 * Die eindeutige ID f�r die Tiere. W�chst mit jedem Aufruf von makeNewAnimal.
	 * @uml.property  name="animalID"
	 */
	private int animalID;
	/**
	 * Die eindeutige ID f�r die Habitate. W�chst mit jedem Aufruf von makeNewCage und makeNewAquarium.
	 * @uml.property  name="habitatID"
	 */
	private int habitatID;
	/**
	 * Die eindeutige ID f�r die Tierpfleger. W�chst mit jedem Aufruf von makeNewZooKeeper.
	 * @uml.property  name="zooKeeperID"
	 */
	private int zooKeeperID;
	/**
	 * Der Zoo den dieses Monitorobjekt �berwacht.
	 * @uml.property  name="monitoredZoo"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Zoo monitoredZoo;
	
	/**
	 * Erstellt einen neuen ZooMonitor, der einen neuen Zoo verwaltet.
	 */
	public ZooMonitor(){
		monitoredZoo = new Zoo();
		animalID = 0;
		habitatID = 0;
		zooKeeperID = 0;		
	}
	/**
	 * F�gt dem Zoo ein neues Tier mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param name			der Name
	 * @param race			die Rasse
	 * @param sex			das Geschlecht
	 * @param food			die Nahrung
	 * @param feedingTime	die F�tterungszeit <i>(Format: hhmm)</i>
	 */
	public void makeNewAnimal(String name, int race, int sex, int food, int feedingTime){
		monitoredZoo.makeNewAnimal(animalID++, name, race, sex, food, feedingTime);
	}
	/**
	 * F�gt dem Zoo einen neuen K�fig mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param width			Die Breite in Metern
	 * @param length		Die L�nge in Metern
	 * @param numberOfDoors	Die Anzahl der T�ren
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public void makeNewCage(int width, int length, int numberOfDoors, ZooKeeper keeper){
		monitoredZoo.makeNewCage(habitatID++, width, length, numberOfDoors, keeper);
	}
	/**
	 * F�gt dem Zoo ein neues Aquarium mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param width			Die Breite in Metern
	 * @param length		Die L�nge in Metern
	 * @param depth			Die Tiefe in Metern
	 * @param numberOfDoors	Die Anzahl der T�ren
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public void makeNewAquarium(int width, int length, int depth, int numberOfDoors, ZooKeeper keeper){
		monitoredZoo.makeNewAquarium(habitatID++, width, length, depth, numberOfDoors, keeper);
	}
	/**
	 * F�gt dem Zoo einen neuen Tiefpfleger mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param name		Der Vorname
	 * @param surname	Der Nachname
	 * @param address	Die Adresse
	 */
	public void makeNewZooKeeper(String name, String surname, String address){
		monitoredZoo.makeNewZooKeeper(zooKeeperID++, name, surname, address);
	}

}
