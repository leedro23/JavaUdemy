package arry;

import java.util.Locale;
import java.util.Scanner;

import entites.Client;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client = null;
		
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		

		Client[] vect = new Client[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();

			System.out.print("Informe o nome: ");
			String name = sc.nextLine();
			System.out.println("Informe o e-mail: ");
			String email = sc.nextLine();
			// System.out.println("Confirme o número do quarto: ");
			int room = n;
			vect[n] = new Client(name, email, room);
			client = vect[n];
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(client);
			}
		}

	}

}
