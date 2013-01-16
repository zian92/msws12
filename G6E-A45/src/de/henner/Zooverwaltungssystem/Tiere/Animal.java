package de.henner.Zooverwaltungssystem.Tiere;


@SuppressWarnings("unused")
public class Animal {
	
	/**
	 * Die eindeutige ID dieses Tieres
	 * @uml.property  name="iD"
	 */
	private final int ID;

	/**
	 * @uml.property  name="name"
	 */
	private String name;

	/**
	 * Konstanten, um das Geschlecht darzustellen
	 */
	public enum Sex {
		/**
		 * @uml.property  name="sEX_MALE"
		 * @uml.associationEnd  
		 */
		SEX_MALE, /**
		 * @uml.property  name="sEX_FEMALE"
		 * @uml.associationEnd  
		 */
		SEX_FEMALE
	}

	/**
	 * Konstanten, um die Tierrasse darzustellen
	 */
	public enum Race {
		/**
		 * @uml.property  name="rACE_CHIMP"
		 * @uml.associationEnd  
		 */
		RACE_CHIMP, /**
		 * @uml.property  name="rACE_GORILLA"
		 * @uml.associationEnd  
		 */
		RACE_GORILLA, /**
		 * @uml.property  name="rACE_TIGER"
		 * @uml.associationEnd  
		 */
		RACE_TIGER, /**
		 * @uml.property  name="rACE_LION"
		 * @uml.associationEnd  
		 */
		RACE_LION, /**
		 * @uml.property  name="rACE_SLOTH"
		 * @uml.associationEnd  
		 */
		RACE_SLOTH, /**
		 * @uml.property  name="rACE_GUINEA_PIG"
		 * @uml.associationEnd  
		 */
		RACE_GUINEA_PIG, /**
		 * @uml.property  name="rACE_GOLDFISH"
		 * @uml.associationEnd  
		 */
		RACE_GOLDFISH, /**
		 * @uml.property  name="rACE_SHARK"
		 * @uml.associationEnd  
		 */
		RACE_SHARK
	}

	/**
	 * Konstanten, um das Futter darzustellen.
	 */
	public enum Food {
		/**
		 * @uml.property  name="fOOD_BANANA"
		 * @uml.associationEnd  
		 */
		FOOD_BANANA, /**
		 * @uml.property  name="fOOD_MEAT"
		 * @uml.associationEnd  
		 */
		FOOD_MEAT, /**
		 * @uml.property  name="fOOD_COOKIES"
		 * @uml.associationEnd  
		 */
		FOOD_COOKIES, /**
		 * @uml.property  name="fOOD_KRILL"
		 * @uml.associationEnd  
		 */
		FOOD_KRILL
	}

	/**
	 * Das  Geschlecht des Tieres.
	 * @uml.property  name="sex"
	 */
	private int sex;
	/**
	 * Die Nahrung des Tieres.
	 * @uml.property  name="food"
	 */
	private int food;
	/**
	 * Die Rasse des Tieres.
	 * @uml.property  name="race"
	 */
	private int race;
	/**
	 * Die Fütterungszeit des Tieres im Format hhmm. So soll z.B. <code>feedingTime = 1230</code> bedeuten, dass ein Tier um 12:30 Uhr gefüttert wird.
	 * @uml.property  name="feedingTime"
	 */
	private int feedingTime;
	
	/**
	 * Erstellt ein Tierobjekt mit den gegebenen Attributen.
	 * Dazu sollten die Konstanten aus den Enums Race, Food und Sex genutzt werden.
	 * @param id			Die eindeutige ID
	 * @param name			Der Name
	 * @param race			Die Rasse
	 * @param sex			Das Geschlecht
	 * @param food			Die Nahrung
	 * @param feedingTime	Die Fütterungszeit <i>(Format: hhmm)</i>
	 */
	public Animal(int id, String name, int race, int sex, int food, int feedingTime) {
		ID = id;
		this.name = name;
		this.race = race;
		this.sex = sex;
		this.food = food;
		this.feedingTime = feedingTime;
	}
}
