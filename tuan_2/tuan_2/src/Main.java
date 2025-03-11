import composite.component.Area;
import composite.composite.Tabel;
import composite.leaf.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee(120);
        Coffee coffee2 = new Coffee(100);
        Coffee coffee3 = new Coffee(10);

        Tabel tab1 = new Tabel();
        Tabel tab2 = new Tabel();

        tab1.addProduct(coffee3);
        tab2.addProduct(coffee1);
        tab2.addProduct(coffee2);
        Area area = new Area();
        area.addTable(tab2);
        area.addTable(tab1);
        System.out.printf("TOTAL "+ tab2.totalPrice());
        System.out.printf("TOTAL2  "+ tab1.totalPrice());
        System.out.printf("All total:   "+ area.totalArea());

    }
}