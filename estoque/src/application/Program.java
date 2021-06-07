package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.print("Digite o nome do produto: ");
		product.name = sc.next();
		System.out.print("Digite o valor do produto: ");
		product.price = sc.nextDouble();
		System.out.print("Digite a quantidade de produto: ");
		product.quantity = sc.nextInt();
		System.out.println(product);

		System.out.print("Add quantity: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("updated data: " + product);

		System.out.print("Remove quantity: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.print("Updated data: " + product);
		
		sc.close();

	}

}
