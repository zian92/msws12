package de.henner.Zooverwaltungssystem;



import java.util.Vector;

import de.henner.Zooverwaltungssystem.Habitat.Aquarium;
import de.henner.Zooverwaltungssystem.Habitat.Cage;
import de.henner.Zooverwaltungssystem.Habitat.Habitat;
import de.henner.Zooverwaltungssystem.Tiere.Animal;

public class Zoo {
	/**
	 * Die Habitate dieses Zoos.
	 * @uml.property   name="habitats"
	 * @uml.associationEnd   multiplicity="(0 -1)" elementType="de.henner.Zooverwaltungssystem.Habitat.Habitat"
	 */
	private Vector<Habitat> habitats;
	/**
	 * Die Tiere dieses Zoos.
	 * @uml.property   name="animals"
	 * @uml.associationEnd   multiplicity="(0 -1)" elementType="de.henner.Zooverwaltungssystem.Tiere.Animal"
	 */
	private Vector<Animal> animals;
	/**
	 * Die Tierpfleger dieses Zoos.
	 * @uml.property  name="zooKeepers"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="de.henner.Zooverwaltungssystem.ZooKeeper"
	 */
	private Vector<ZooKeeper> zooKeepers;
	
	/**
	 * Erstellt ein Zooobjekt.
	 */
	public Zoo(){
		
	}
	/**
	 * Fügt diesem Zoo ein neues Tier mit den gegebenen Attributen hinzu.
	 * @param id			die eindeutige ID
	 * @param name			der Name
	 * @param race			die Rasse
	 * @param sex			das Geschlecht
	 * @param food			die Nahrung
	 * @param feedingTime	die Fütterungszeit <i>(Format: hhmm)</i>
	 */
	public void makeNewAnimal(int id, String name, int race, int sex, int food, int feedingTime){
		animals.add(new Animal(id, name, race, sex, food, feedingTime));
	}
	/**
	 * Fügt diesem Zoo einen neuen Käfig mit den gegebenen Attributen hinzu.
	 * @param id			Die eindeutige ID
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public void makeNewCage(int id, int width, int length, int numberOfDoors, ZooKeeper keeper){
		habitats.add(new Cage(id, width, length, numberOfDoors, keeper));
	}
	/**
	 * Fügt diesem Zoo ein neues Aquarium mit den gegebenen Attributen hinzu.
	 * @param id			Die eindeutige ID
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param depth			Die Tiefe in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public void makeNewAquarium(int id, int width, int length, int depth, int numberOfDoors, ZooKeeper keeper){
		habitats.add(new Aquarium(id, width, length, depth, numberOfDoors, keeper));
	}
	/**
	 * Fügt diesem Zoo einen neuen Tiefpfleger mit den gegebenen Attributen hinzu.
	 * @param id		Die eindeutige ID
	 * @param name		Der Vorname
	 * @param surname	Der Nachname
	 * @param address	Die Adresse
	 */
	public void makeNewZooKeeper(int id, String name, String surname, String address){
		zooKeepers.add(new ZooKeeper(id, name, surname, address));
	}

}
