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
		MALE, /**
		 * @uml.property  name="sEX_FEMALE"
		 * @uml.associationEnd  
		 */
		FEMALE
	}

	/**
	 * Konstanten, um die Tierrasse darzustellen
	 */
	public enum Race {
		/**
		 * @uml.property  name="rACE_CHIMP"
		 * @uml.associationEnd  
		 */
		CHIMP, /**
		 * @uml.property  name="rACE_GORILLA"
		 * @uml.associationEnd  
		 */
		GORILLA, /**
		 * @uml.property  name="rACE_TIGER"
		 * @uml.associationEnd  
		 */
		TIGER, /**
		 * @uml.property  name="rACE_LION"
		 * @uml.associationEnd  
		 */
		LION, /**
		 * @uml.property  name="rACE_SLOTH"
		 * @uml.associationEnd  
		 */
		SLOTH, /**
		 * @uml.property  name="rACE_GUINEA_PIG"
		 * @uml.associationEnd  
		 */
		GUINEA_PIG, /**
		 * @uml.property  name="rACE_GOLDFISH"
		 * @uml.associationEnd  
		 */
		GOLDFISH, /**
		 * @uml.property  name="rACE_SHARK"
		 * @uml.associationEnd  
		 */
		SHARK
	}

	/**
	 * Konstanten, um das Futter darzustellen.
	 */
	public enum Food {
		/**
		 * @uml.property  name="fOOD_BANANA"
		 * @uml.associationEnd  
		 */
		BANANA, /**
		 * @uml.property  name="fOOD_MEAT"
		 * @uml.associationEnd  
		 */
		MEAT, /**
		 * @uml.property  name="fOOD_COOKIES"
		 * @uml.associationEnd  
		 */
		COOKIES, /**
		 * @uml.property  name="fOOD_KRILL"
		 * @uml.associationEnd  
		 */
		KRILL
	}

	/**
	 * Das  Geschlecht des Tieres.
	 * @uml.property  name="sex"
	 */
	private Sex sex;
	/**
	 * Die Nahrung des Tieres.
	 * @uml.property  name="food"
	 */
	private Food food;
	/**
	 * Die Rasse des Tieres.
	 * @uml.property  name="race"
	 */
	private Race race;
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
	public Animal(int id, String name, Race race, Sex sex, Food food, int feedingTime) {
		ID = id;
		this.name = name;
		this.race = race;
		this.sex = sex;
		this.food = food;
		this.feedingTime = feedingTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public int getFeedingTime() {
		return feedingTime;
	}

	public void setFeedingTime(int feedingTime) {
		this.feedingTime = feedingTime;
	}

	public int getID() {
		return ID;
	}
}
