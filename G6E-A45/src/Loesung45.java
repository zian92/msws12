/**
 * Uebungsgruppe G6E (Stadler, Niehaus, Pöll)
 * 
 */

/**
 * 
 * @author Henner Niehaus
 * @version 1.0
 */
import de.henner.Zooverwaltungssystem.*;
import de.henner.Zooverwaltungssystem.Tiere.Animal;
import de.henner.Zooverwaltungssystem.Tiere.Animal.Food;
import de.henner.Zooverwaltungssystem.Tiere.Animal.Race;
import de.henner.Zooverwaltungssystem.Tiere.Animal.Sex;
public class Loesung45 {
	
	public void solve(){
		
		ZooMonitor moni = new ZooMonitor();
		moni.makeNewAnimal("Cheeta", Race.CHIMP, Sex.MALE, Food.BANANA, 1645);
		moni.makeNewAnimal("Jonas", Race.SLOTH, Sex.MALE, Food.COOKIES, 1200);
		moni.makeNewAnimal("Eva", Race.GUINEA_PIG, Sex.FEMALE, Food.KRILL, 730);
		for(int i = 0; i < 3; i++){
			System.out.print(moni.getMonitoredZoo().getAnimals().get(i).getName() + "\t");
			System.out.print(moni.getMonitoredZoo().getAnimals().get(i).getRace().toString() + "\t");
			System.out.print(moni.getMonitoredZoo().getAnimals().get(i).getSex().toString() + "\t");
			System.out.print(moni.getMonitoredZoo().getAnimals().get(i).getFood().toString() + "\t");
			System.out.println(moni.getMonitoredZoo().getAnimals().get(i).getFeedingTime() + "\n");
		}
	}
	
	public static void main(String args[]){
		new Loesung45().solve();
	}
}