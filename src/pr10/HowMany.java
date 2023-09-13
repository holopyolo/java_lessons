package pr10;
import java.util.Scanner;
public class HowMany {
	public int CountPlease() {
		Scanner inp = new Scanner(System.in);
		String line;
		int counted = 0;
		while((line = inp.nextLine()) != null) {
			if(line.isEmpty()) {break;}
			counted += line.split("( |,|.)").length;
		}
		return counted;
	}
}
