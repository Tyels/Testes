import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in) ;
		
		Exer12Funcions chama = new Exer12Funcions();
		
		System.out.println("digite o primeiro numero");
		int x = le.nextInt();
		
		System.out.println("digite o segundo numero");
		int n = le.nextInt();
		
		int result = chama.potencia(x, n);
		
		System.out.println("o resultado é: " + result);
			
	}
}
