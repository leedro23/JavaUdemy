package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		
		System.out.println(list.size());
		//Remove todas as palavras que come?arem com M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		//Remove o que estiver na posi??o 1
		list.remove(1);
		
		//Retorna o index do elemento. Caso n?o exista, o indexOf retorna -1
		list.indexOf("Bob");
		
		//Para filtrar uma lista, ? preciso criar uma nova. E a partir dessa nova, converter em tipo stream
		//que aceita opera??es com express?es lambda. A partir disso, ? preciso chamar o filter. Esse filter devolve
		//um stream, conforme o predicado entre parenteses do filter. Entretanto, este filter n?o ? compat?vel com
		// list. Ent?o se faz necess?rio a converss?o atrav?s do collect
		List<String>result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		//Ajuda a encontrar o primeiro elemento que atende ao predicado do filter. Para isso, precisa-se
		//criar uma var?avel que seja do tipo da lista, fazendo o filtro e usando a fun??o findFirst.
		//Essa fun??o retorna um optional String. caso n?o encontre, o retorno ser? null.
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		for (String x : list) {
			if( x == "Alex") {
				x = "Felix";
			}
			System.out.println(x);
		}
		

	}

}
