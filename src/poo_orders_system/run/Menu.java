package poo_orders_system.run;

import java.util.Scanner;
import poo_orders_system.models.Products;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id;
        String name, description;
        double value;


        System.out.println("Cadastrar Produto: ");
        System.out.println("Id: ");
        id = scan.nextInt();
        System.out.println("Product Name: ");
        name = scan.next();
        System.out.println("Product Description: ");
        description = scan.next();
        System.out.println("Valor do Produto: ");
        value = scan.nextDouble();

        Products products = new Products(id, description, name, value);
        products.register();

        System.out.println(products);

    }
}
