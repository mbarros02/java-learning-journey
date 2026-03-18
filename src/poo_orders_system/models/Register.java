package poo_orders_system;

import java.util.ArrayList;

public class Register {

    private int id;
    private String nome;
    private String description;
    private double value;
    private ArrayList<Register> list = new ArrayList<>();

    public Register(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.list = new ArrayList<>();
    }

    public Register(int id, String description, String nome, double value) {
        this.id = id;
        this.description = description;
        this.list = list;
        this.nome = nome;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
