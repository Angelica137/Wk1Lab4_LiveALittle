
/**
 * Write a description of class Lotto here. Lotto generates a lucky dip and
 * displays the lucky dip
 * 
 * @author Angelica Beristain
 * @version 15 March 2021
 */
public class Lotto {

	// Put the luckyDip() method here
	public void luckyDip() {
		int random;
		int i = 1;
		random = (int) (Math.random() * 49) + 1;
		System.out.println("Ball " + i + random);
	}

	// Test
	public static void main(String args[]) {

		Lotto l = new Lotto();
		l.luckyDip();
	}

}
