package composite.composite;


import composite.leaf.Product;

import java.util.ArrayList;

public class Tabel implements ITable{
    ArrayList<Product> listProducts = new ArrayList<>();

    @Override
    public void addProduct(composite.leaf.Product p) {
        listProducts.add(p);
    }

    @Override
    public double totalPrice() {
        double total = 0;
        for(Product product: listProducts){
            total += product.getPrice();
        }
        return total;
    }
}
