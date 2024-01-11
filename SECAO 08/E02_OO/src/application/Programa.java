package application;

import java.util.Scanner;

import entities.Product;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
    
        System.out.println("Enter the pproduct data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: " + product);
        
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Uptated data: " + product);
        System.out.println();

        System.out.println("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        product.addProducts(remove);

        sc.close();
    }

}
