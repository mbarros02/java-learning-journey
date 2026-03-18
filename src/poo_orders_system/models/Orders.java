package poo_orders_system;

import java.util.ArrayList;

public class Orders extends Register implements Base<Orders>{

    public Orders(int id, String description,
                  String nome, double value) {
        super(id, description, nome, value);
    }

    @Override
    public Orders register() {
        return null;
    }

    @Override
    public Orders update() {
        return null;
    }

    @Override
    public void list() {

    }
}
