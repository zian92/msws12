package de.henner.Zooverwaltungssystem;

public class ZooMonitor {
	/**
	 * Die eindeutige ID für die Tiere. Wächst mit jedem Aufruf von makeNewAnimal.
	 * @uml.property  name="animalID"
	 */
	private int animalID;
	/**
	 * Die eindeutige ID für die Habitate. Wächst mit jedem Aufruf von makeNewCage und makeNewAquarium.
	 * @uml.property  name="habitatID"
	 */
	private int habitatID;
	/**
	 * Die eindeutige ID für die Tierpfleger. Wächst mit jedem Aufruf von makeNewZooKeeper.
	 * @uml.property  name="zooKeeperID"
	 */
	private int zooKeeperID;
	/**
	 * Der Zoo den dieses Monitorobjekt überwacht.
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
	 * Fügt dem Zoo ein neues Tier mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param name			der Name
	 * @param race			die Rasse
	 * @param sex			das Geschlecht
	 * @param food			die Nahrung
	 * @param feedingTime	die Fütterungszeit <i>(Format: hhmm)</i>
	 */
	public void makeNewAnimal(String name, int race, int sex, int food, int feedingTime){
		monitoredZoo.makeNewAnimal(animalID++, name, race, sex, food, feedingTime);
	}
	/**
	 * Fügt dem Zoo einen neuen Käfig mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public void makeNewCage(int width, int length, int numberOfDoors, ZooKeeper keeper){
		monitoredZoo.makeNewCage(habitatID++, width, length, numberOfDoors, keeper);
	}
	/**
	 * Fügt dem Zoo ein neues Aquarium mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param depth			Die Tiefe in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public void makeNewAquarium(int width, int length, int depth, int numberOfDoors, ZooKeeper keeper){
		monitoredZoo.makeNewAquarium(habitatID++, width, length, depth, numberOfDoors, keeper);
	}
	/**
	 * Fügt dem Zoo einen neuen Tiefpfleger mit den gegebenen Attributen und einer neuen ID hinzu.
	 * @param name		Der Vorname
	 * @param surname	Der Nachname
	 * @param address	Die Adresse
	 */
	public void makeNewZooKeeper(String name, String surname, String address){
		monitoredZoo.makeNewZooKeeper(zooKeeperID++, name, surname, address);
	}

}
