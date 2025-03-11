package composite.leaf;

public class Coffee implements  Product {
    private  double price;
    public  Coffee(double price){
        this.price = price;
    }


    @Override
    public double getPrice() {
        return this.price;
    }
}
