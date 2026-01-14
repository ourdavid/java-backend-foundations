package introduction.product;

import introduction.product.entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        Product produto = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        produto.name = input.nextLine();
        System.out.print("Price: ");
        produto.price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        produto.quantity = input.nextInt();

        System.out.println("Product Data: " + produto);

        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int addQnt = input.nextInt();
        produto.addProducts(addQnt);
        System.out.println("Update Data: " + produto);

        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        int removeQnt = input.nextInt();
        produto.removeProducts(removeQnt);
        System.out.println("Update Data: " + produto);




        input.close();

    }
}
