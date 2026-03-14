package poo_orders_system;

import java.util.ArrayList;

public class Products extends Register implements Base<Products>{

    public Products(int id, String description, ArrayList<Register> list, String nome, double value) {
        super(id, description, list, nome, value);
    }

    @Override
    public Products register() {
        return null;
    }

    @Override
    public Products update() {
        return null;
    }

    @Override
    public void list() {

    }
}
