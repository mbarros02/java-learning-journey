package poo_orders_system.models;

public class Customer extends Register {

    private String email;
    private String sexo;
    private int age;

    public Customer(int id, String nome, String email, String sexo, int age) {
        super(id, nome);
        this.email = email;
        this.sexo = sexo;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

}
