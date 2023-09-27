public class Tie extends Clothes implements MenClothing{
    public Tie(int size, int price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.printf("Галстук: размер - %d, цена - %d, цвет - %s\n", this.size, this.price, this.color);
    }
}
