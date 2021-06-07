package main;

import java.util.Locale;
import java.util.Scanner;
import entites.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digita a �rea do tri�ngulo A: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite a �rea di tri�ngulo B: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.println("Tri�ngulo X: " + areaX);
		System.out.print("Tria�ngulo Y: " + areaY);
	}

}