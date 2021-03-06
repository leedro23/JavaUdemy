package arrayAndList2;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Array2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double sum = 0;
		double media = 0;

		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);

			sum += vect[i].getPrice();
			media = sum / vect.length;
		}

		System.out.printf("%.2f%n", media);
		sc.close();

	}

}
