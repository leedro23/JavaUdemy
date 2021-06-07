package arryAndLists;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];
		double media = 0;
		double soma = 0;

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
			media = soma / vect.length;
		}

//		1.72
//		1.56
//		1.80
		System.out.printf("%.2f", media);

		sc.close();

	}

}
