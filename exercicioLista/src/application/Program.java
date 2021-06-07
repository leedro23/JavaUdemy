package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employee will be registred?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			sc.nextLine();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println("Enter the emplyee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
//		Integer pos = position(list, idSalary);
		if (emp == null) {
			System.out.println("This id doesn't exist.");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
//			list.get(emp).increaseSalary(percent);
			emp.increaseSalary(percent);

		}
		System.out.println();
		System.out.println("list of employers: ");
		for (Employee e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	// Fun��o auxiliar que retorna a posi��o do empregado que deseja aumentar o
	// sal�rio.
	// Caso n�o exista, a fun��o retorna nulo
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	//Esta fun��o auxilar faz a valida��o para que n�o seja adicionado um id repetido.
	//Esta fun��o � chamada no momento do cadastro de empregados com o while. Enquanto o id
	//digitado n�o for diferente do que j� existe na lista, o cadastro n�o seguir� adiante.
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp!=null;
	}

}
