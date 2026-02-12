/**
 * 
 */
package atendimento;

import java.util.Scanner;

/**
 * 
 */
public class atendimento {

	/**
	 * @author anna.lfcsantos
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digite seu nome de usuário");
		String nome = scanner.nextLine();  
		
		System.out.println("Olá "+nome+"!! Seja Bem vindo ao Branco do Brasil");
		System.out.println("Saldo: R$ 1000,00");
		System.out.println("");
		
		System.out.println("Escolha 1 para: Depósito ");
		System.out.println("Escolha 2 para:Retirada");
		int escolha = scanner.nextInt();
		
		double saldo = 1000.00;
		
		//---------------------------Swith-------------------------------
		switch (escolha) {
		case 1:
			System.out.println("Ótimo!! Quanto você gostaria de depositar?");
			double deposito = scanner.nextDouble();
			if (deposito<=0) {
				System.out.println("Depósito inválida!! Deposite um valor.");		
			}
			else {
				System.out.println("Depósito concluído com sucesso.");
				System.out.println("Saldo atual: R$ "+(saldo+deposito));
				System.out.println("");
				
				System.out.println("Até a Próxima!!!");
			}
			break;
		case 2:
			System.out.println("Ótimo!! Quanto você gostaria de retirar?");
			double retirada = scanner.nextDouble();
			if (retirada>saldo) {
				System.out.println("Retirada inválida!! Limite de saldo estourado.");		
			}
			else {
				System.out.println("Retirada concluída com sucesso.");
				System.out.println("Saldo atual: R$ "+(saldo-retirada));				
				System.out.println("");
				
				System.out.println("Até a Próxima!!!");
			}
			break;
		default:
			System.out.println("Escolha uma opção");
			break;
		}
		//--------------------------Swith-----------------------------------

	}


	}

