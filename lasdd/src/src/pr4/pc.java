package pr4;

public class pc {
	private double price = 0;
	private int id = 0;
	public pc(int id) {
		this.id = id;
	}
	public pc(int id, double price) {
		this.id = id;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
