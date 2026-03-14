package poo_orders_system;

public class Products extends Register{

    private String description;
    private double value;

    public Products(int id, String nome, String description, double value) {
        super(id, nome);
        this.description = description;
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }
}
