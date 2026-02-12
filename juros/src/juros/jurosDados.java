/**
 * 
 */
package juros;

import java.util.Scanner;

/**
 * 
 */
public class jurosDados {

	/**
	 * @author anna.lfcsantos
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu capital");
		double capital = scanner.nextDouble();
		
		System.out.println("Digite a taxa aplicada (Em porcentagem)");
		double taxa = scanner.nextDouble();
		
		System.out.println("Digite o tempo aplicado sobre o juros");
		double tempo = scanner.nextDouble();
		
		//double taxa = taxaP/100;
		double js =capital * (taxa/100) * tempo;
		String jurosS = String.format("%.2f", js);
		double jc = capital * Math.pow((1 + (taxa/100)), tempo);
		String jurosC = String.format("%.2f", jc);
		
		
		System.out.println("Olá "+nome);
		System.out.printf("Se os valores forem aplicados em um Juros Simples o valor será de:R$ %.2f",js);
		System.out.println("");
		System.out.printf("Se os valores forem aplicados em um Juros Composto o valor será de:R$ %.2f",jc);
		System.out.println("");
		System.out.println("Até a próxima");
		
		
		scanner.close();
		

	}

}
