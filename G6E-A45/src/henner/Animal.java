package henner;

public class Animal {
	
	/**
	 * Die eindeutige ID dieses Tieres
	 */
	private final int ID;

	private String name;

	/**
	 * Konstanten, um das Geschlecht darzustellen
	 */
	public enum Sex {
		SEX_MALE, SEX_FEMALE
	}

	/**
	 * Konstanten, um die Tierrasse darzustellen
	 */
	public enum Race {
		RACE_CHIMP, RACE_GORILLA, RACE_TIGER, RACE_LION, RACE_SLOTH, RACE_GUINEA_PIG, RACE_GOLDFISH, RACE_SHARK
	}

	/**
	 * Konstanten, um das Futter darzustellen.
	 */
	public enum Food {
		FOOD_BANANA, FOOD_MEAT, FOOD_COOKIES, FOOD_KRILL
	}

	/**
	 * Das  Geschlecht des Tieres.
	*/
	private int sex;
	/**
	 * Die Nahrung des Tieres.
	 */
	private int food;
	/**
	 * Die Rasse des Tieres.
	 */
	private int race;
	/**
	 * Die Fütterungszeit des Tieres im Format hhmm.
	 * So soll z.B. <code>feedingTime = 1230</code> bedeuten, dass ein Tier um 12:30 Uhr gefüttert
	 * wird.
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
