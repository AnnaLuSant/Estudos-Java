/**
 * 
 */
package mediaDados;
import java.util.Scanner;

/**
 * 
 */
public class mediadados {

	/**
	 * @author anna.lfcsantos
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = scanner.next();
		
		System.out.println("Digite sua nota do primeiro bimestre");
		double nota1 = scanner.nextDouble();
		System.out.println("");
		
		System.out.println("Digite sua nota do Segundo bimestre");
		double nota2 = scanner.nextDouble();
		System.out.println("");
		
		System.out.println("Digite sua nota do Terceiro bimestre");
		double nota3 = scanner.nextDouble();
		System.out.println("");
		
		System.out.println("Digite sua nota do Quarto bimestre");
		double nota4 = scanner.nextDouble();
		System.out.println("");
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media>=7.0) {
			System.out.println("Olá "+nome+"!! Sua media final é: "+media+ ". Você foi aprovado :)");
		}
		else if (media>=5.0) {
			System.out.println("Olá "+nome+"!! Sua media final é: "+media+ ". Você está de recuperação ;)");
			
		}
		else {
			System.out.println("Olá "+nome+"!! Sua media final é: "+media+ ". Você foi reprovado :(");
		}
		
		System.out.println("Até a próxima "+nome+"!! 👍");
		scanner.close();
		
		
		
		


	}

}
