/**
 * 
 */
package insercaodedados;
import java.util.Scanner;

/**
 * 
 */
public class leituraTeclado {

	/**
	 * @author anna.lfcsantos
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Scanner: é uma classe da biblioteca padrão do Java usada para ler dados de entrada(como número, textos etc).
		
		//scanner: é o nome da variável que estamos criando que vai armazenar o objeto responsável pela leitura
		
		// newScanner(System.in): cria um novo objeto Scanner que vai ler dados apartir da entrada do sistema,
		//ou seja o teclado.
		
		//Lendo um Número inteiro
		
		System.out.println("Digite um número inteiro");
		int numero =scanner.nextInt(); //
		
		//Limpando o buffr antes de ler uma string
		
		System.out.println("Digite o seu nome");
		
		//nextLine() faz a limpeza direto... diferente de 
		
		System.out.println("Olá "+nome+" o seu número digitado foi: "+numero);
		scanner.close();
		//sempre limpe o buffer com nextline() após usar métudos como nextInt() ou nextduble()
		
		

	}

}
