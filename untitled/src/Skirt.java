public class Skirt extends Clothes implements WomenClothing{
    public Skirt(int size, int price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public void dressWomen() {
        System.out.printf("Юбка: размер - %d, цена - %d, цвет - %s\n", this.size, this.price, this.color);
    }
}
