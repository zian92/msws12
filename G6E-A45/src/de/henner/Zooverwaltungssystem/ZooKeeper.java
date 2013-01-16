package de.henner.Zooverwaltungssystem;


@SuppressWarnings("unused")
public class ZooKeeper {
	
	/**
	 * Die eindeutige ID dieses Pflegers
	 * @uml.property  name="iD"
	 */
	private final int ID;
	/**
	 * Der Vorname des Pflegers.
	 * @uml.property  name="firstName"
	 */
	private String firstName;
	/**
	 * Der Nachname des Pflegers.
	 * @uml.property  name="surname"
	 */
	private String surname;
	/**
	 * Die Adresse des Pflegers.
	 * @uml.property  name="address"
	 */
	private String address;
	
	/**
	 * Erstellt einen Pfleger mit den gegebenen Attributen.
	 * @param id		Die eindeutige ID
	 * @param name		Der Vorname
	 * @param surname	Der Nachname
	 * @param address	Die Adresse
	 */
	public ZooKeeper(int id, String name, String surname, String address){
		ID = id;
		this.firstName = name;
		this.surname = surname;
		this.address = address;
	}
}
