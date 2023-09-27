package src.pr4;
import pr4.shop;
import pr4.pc;
import java.util.Scanner;
public class inter {
	public void start() {
		shop Shop = new shop();
		Scanner inp = new Scanner(System.in);
		while(true) {
			System.out.println("\n1: add pc\n2: delete pc\n3: find pc");
			int choise = inp.nextInt();
			switch(choise) {
			case 1:
			{
				System.out.println("format : <price id> ");
				double price = inp.nextDouble();
				int id = inp.nextInt();
				Shop.addToCatalog(new pc(id, price));
				break;
			}
			case 2:
			{
				System.out.println("format : <id> ");
				int id = inp.nextInt();
				Shop.deleteFromCatalog(id);
				break;
			}
			case 3:
			{
				System.out.println("format : <id> ");
				int id = inp.nextInt();
				try {
					pc foundPc = Shop.searchProduct(id);
					System.out.printf("Found\nid: %d\nprice: %f ", foundPc.getId(), foundPc.getPrice());
				}
				catch(Throwable t){
					System.out.printf("Not found %d", id);
				}
				break;
			}
			}
		}
	}
	
}
