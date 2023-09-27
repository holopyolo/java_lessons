public class pants extends Clothes implements MenClothing, WomenClothing{
    public pants(int size, int price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }
    @Override
    public void dressWomen() {
        System.out.printf("Штаны: размер - %d, цена - %d, цвет - %s\n", this.size, this.price, this.color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Штаны: размер - %d, цена - %d, цвет - %s\n", this.size, this.price, this.color);
    }
}
