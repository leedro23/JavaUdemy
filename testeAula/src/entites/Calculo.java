package entites;

public class Calculo {
	
	public float valor1;
	public float valor2;
	
	
	public float ExecutaSoma(float valor1, float valor2) {
		float soma = valor1 +valor2;
		return soma;
	}
	
	public float ExecutaSubtracao(float valor1, float valor2) {
		float subtracao = valor1 - valor2;
		return subtracao;
	}
	
	public float ExecutaProduto(float valor1 , float valor2) {
		float produto = valor1 * valor2;
		return produto;
	}
	
	

}
