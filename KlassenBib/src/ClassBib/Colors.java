package ClassBib;

public class Colors {

	public Colors() {
	}
	
	/**
	 * Creates a RGB value
	 * 
	 * @author Jonas Stadler
	 * @version 1.0
	 * @param red
	 *            red
	 * @param green
	 *            green
	 * @param blue
	 *            blue
	 * @return
	 */
	public int makeRGB(int red, int green, int blue) {
		return red * 65536 + green * 256 + blue; //creates a new rgb value and returns ist.
	}

}
