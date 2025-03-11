package composite.component;

import composite.composite.Tabel;

import java.util.ArrayList;

public class Area implements IArea{
    ArrayList<Tabel> listTable = new ArrayList<>();

    public  void addTable(Tabel a){
        listTable.add(a);
    }

    @Override
    public double totalArea() {
        double total = 0;
       for(Tabel a: listTable){
           total+= a.totalPrice();
       }
       return total;
    }
}
