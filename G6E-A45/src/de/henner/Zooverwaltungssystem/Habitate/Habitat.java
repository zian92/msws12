package de.henner.Zooverwaltungssystem.Habitate;

import de.henner.Zooverwaltungssystem.ZooKeeper;

public abstract class Habitat {
	/**
	 * Die eindeutige ID dieses Habitats.
	 */
	private final int ID;
	
	/**
	 * Die Breite dieses Habitats in Metern.
	 */
	private int width;
	/**
	 * Die Länge dieses Habitats in Metern.
	 */
	private int length;
	/**
	 * Die Anzahl der Türen dieses Habitats.
	 */
	private int numberOfDoors;
	/**
	 * Der verantwortliche Tierpfleger dieses Habitats.
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
