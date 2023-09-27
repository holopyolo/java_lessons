public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(int size, int price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.printf("Тишка: размер - %d, цена - %d, цвет - %s\n", this.size, this.price, this.color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Тишка: размер - %d, цена - %d, цвет - %s\n", this.size, this.price, this.color);
    }
}
