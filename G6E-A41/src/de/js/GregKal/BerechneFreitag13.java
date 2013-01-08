/**
 * 
 */
package de.js.GregKal;

/**
 * @author Jonas
 * 
 */
public class BerechneFreitag13 {
	int[][] tage = new int[31][7];

	/**
	 * 
	 */
	public BerechneFreitag13() {
	}

	public void is400yearsmod7() {
		int days = 400 * 365; // alle tage ohne schalttage
		for (int i = 1600; i < 2001; i++) {
			if (this.isLeapYear(i)) days++;
		}
		System.out.println("Check 400 years mod 7 = " + days % 7);
	}

	public void run() {
		this.is400yearsmod7();
	}

	/**
	 * Returns the Strin-name of a weekday.
	 * 
	 * @author Jonas Stadler
	 * @param dayofweek
	 *            0 to 6
	 * @return Name of the Day
	 */
	public String giveDays(int dayofweek) {
		if (dayofweek > 7) {
			dayofweek = dayofweek % 7;
		}
		switch (dayofweek) {
			case 0:
				return "Montag";
			case 1:
				return "Dienstag";
			case 2:
				return "Mitwoch";
			case 3:
				return "Donnerstag";
			case 4:
				return "Freitag";
			case 5:
				return "Samstag";
			case 6:
				return "Sonntag";
			default:
				return "no day!";
		}
	}

	/**
	 * Checks if the given year is a leap year. If not, the function returns false.
	 * 
	 * @author Jonas Stadler
	 * @param year
	 * @return
	 */
	public boolean isLeapYear(int year) {
		switch (year) {
			case 1600:
			case 1604:
			case 1608:
			case 1612:
			case 1616:
			case 1620:
			case 1624:
			case 1628:
			case 1632:
			case 1636:
			case 1640:
			case 1644:
			case 1648:
			case 1652:
			case 1656:
			case 1660:
			case 1664:
			case 1668:
			case 1672:
			case 1676:
			case 1680:
			case 1684:
			case 1688:
			case 1692:
			case 1696:
			case 1704:
			case 1708:
			case 1712:
			case 1716:
			case 1720:
			case 1724:
			case 1728:
			case 1732:
			case 1736:
			case 1740:
			case 1744:
			case 1748:
			case 1752:
			case 1756:
			case 1760:
			case 1764:
			case 1768:
			case 1772:
			case 1776:
			case 1780:
			case 1784:
			case 1788:
			case 1792:
			case 1796:
			case 1804:
			case 1808:
			case 1812:
			case 1816:
			case 1820:
			case 1824:
			case 1828:
			case 1832:
			case 1836:
			case 1840:
			case 1844:
			case 1848:
			case 1852:
			case 1856:
			case 1860:
			case 1864:
			case 1868:
			case 1872:
			case 1876:
			case 1880:
			case 1884:
			case 1888:
			case 1892:
			case 1896:
			case 1904:
			case 1908:
			case 1912:
			case 1916:
			case 1920:
			case 1924:
			case 1928:
			case 1932:
			case 1936:
			case 1940:
			case 1944:
			case 1948:
			case 1952:
			case 1956:
			case 1960:
			case 1964:
			case 1968:
			case 1972:
			case 1976:
			case 1980:
			case 1984:
			case 1988:
			case 1992:
			case 1996:
			case 2000:
				return true;
			default:
				return false;
		}
	}
}
