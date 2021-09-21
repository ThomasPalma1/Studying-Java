package oop.app;

import java.util.Scanner;
import oop.app.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		
		System.out.println("Enter product data");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		sc.close();
	}

}
