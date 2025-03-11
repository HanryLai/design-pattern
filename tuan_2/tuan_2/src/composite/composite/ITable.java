package composite.composite;

import composite.leaf.Product;

public interface ITable {
    void addProduct(Product p);
    double totalPrice();
}
