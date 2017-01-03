//Jose Mora
//ICE 5
import java.util.*;
public class ICE5 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String s = "He sprung from the cabin-window, as he said this, upon the ice-raft which lay close" +
				"to the vessel. He was soon borne away by the waves and lost in darkness and distance.";
		String doAgain;
		do {
			System.out.println("Print a start word: ");
			String sWord = keyboard.nextLine();
			System.out.println("Print an end word");
			String lWord = keyboard.nextLine();
			System.out.println("Location of 1st Word: " + s.indexOf(sWord));
			System.out.println("Location of 2nd Word: " + s.indexOf(lWord));
			System.out.println(s.substring(s.indexOf(sWord), s.indexOf(lWord)));
			System.out.println("Press Y to Continue");
			doAgain = keyboard.nextLine();
		} while (doAgain.equals("y") || doAgain.equals("Y"));
	}
}
