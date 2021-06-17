package arry;

import java.util.Locale;
import java.util.Scanner;

import entites.Client;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client = null;

		Client[] vect = new Client[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Informe o nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Informe o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Confirme o número do quarto: ");
			int room = sc.nextInt();
			vect[room] = new Client(name, email);
		}

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

	}

}
