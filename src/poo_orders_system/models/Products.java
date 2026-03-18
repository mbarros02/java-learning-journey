package poo_orders_system;

import java.util.ArrayList;

public class Products extends Register implements Base<Products>{

    private ArrayList<Products> list = new ArrayList<>();

    public Products(int id, String description, String nome, double value) {
        super(id, description, nome, value);
    }

    @Override
    public Products register() {
        Products products = new Products(getId(), getDescription(), getNome(), getValue());
        list.add(products);
        return null;
    }

    @Override
    public Products update() {
        return null;
    }

    @Override
    public void list() {

    }

    @Override
    public String toString() {
        return "Products{" +
                "list=" + list +
                '}';
    }
}
