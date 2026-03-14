package poo_orders_system;

public class Customer extends Register implements Base<Customer>{

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

    @Override
    public Customer register() {
        return null;
    }

    @Override
    public Customer update() {
        return null;
    }

    @Override
    public void list() {

    }
}
