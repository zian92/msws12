package de.henner.Zooverwaltungssystem.Habitat;

import de.henner.Zooverwaltungssystem.ZooKeeper;



@SuppressWarnings("unused")
public  class Habitat {
	/**
	 * Die eindeutige ID dieses Habitats.
	 * @uml.property  name="iD"
	 */
	private final int ID;
	
	/**
	 * Die Breite dieses Habitats in Metern.
	 * @uml.property  name="width"
	 */
	private int width;
	/**
	 * Die Länge dieses Habitats in Metern.
	 * @uml.property  name="length"
	 */
	private int length;
	/**
	 * Die Anzahl der Türen dieses Habitats.
	 * @uml.property  name="numberOfDoors"
	 */
	private int numberOfDoors;
	/**
	 * Der verantwortliche Tierpfleger dieses Habitats.
	 * @uml.property  name="keeper"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private ZooKeeper keeper;
	
	/**
	 * Erstellt ein Habitatobjekt mit den gegebenen Attributen.
	 * @param id			Die eindeutige ID
	 * @param width			Die Breite in Metern
	 * @param length		Die Länge in Metern
	 * @param numberOfDoors	Die Anzahl der Türen
	 * @param keeper		Der verantwortliche Tierpfleger
	 */
	public Habitat(int id, int width, int length, int numberOfDoors, ZooKeeper keeper){
		ID = id;
		this.width = width;
		this.length = length;
		this.numberOfDoors = numberOfDoors;
		this.keeper = keeper;
	}
}
