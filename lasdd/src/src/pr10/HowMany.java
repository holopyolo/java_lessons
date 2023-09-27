package src.pr10;
import java.util.Scanner;
public class HowMany {
	public int CountPlease() {
		System.out.println("asd");
		Scanner inp = new Scanner(System.in);
		String line;
		int counted = 0;
		while((line = inp.nextLine()) != "") {
			if(line.isEmpty()) {break;}
			counted += line.split("").length;
		}
		return counted;
	}
}
