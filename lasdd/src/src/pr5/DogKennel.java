package src.pr5;
import src.pr5.dog;
import java.util.ArrayList;
public class DogKennel {
	private ArrayList<dog> Dogs = new ArrayList<dog>();
	
	public void AddDog(String name, int age) {
		Dogs.add(new dog(name, age));
	}
}
