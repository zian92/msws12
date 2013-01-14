package henner;

public class ZooKeeper {
	
	/**
	 * Die eindeutige ID dieses Pflegers
	 */
	private final int ID;
	/**
	 * Der Vorname des Pflegers.
	 */
	private String firstName;
	/**
	 * Der Nachname des Pflegers.
	 */
	private String surname;
	/**
	 * Die Adresse des Pflegers.
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
