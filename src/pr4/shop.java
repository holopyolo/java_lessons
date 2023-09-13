package pr4;
import pr4.pc;
import java.util.ArrayList;
import java.util.Scanner;
public class shop {
	private ArrayList<pc> catalog = new ArrayList<pc>();

	public void addToCatalog(pc Pc) {
		this.catalog.add(Pc);
	}

	public void deleteFromCatalog(int id) {
		for (pc Now : this.catalog) {
			if(Now.getId() == id) {
				catalog.remove(Now);
			}
		}
	}
	public pc searchProduct(int id) {
		for (pc Now : this.catalog) {
			if(Now.getId() == id) {
				return Now;
			}
		}
		throw new Error();
	}
	
}
