import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:");

		Double Valor = sc.nextDouble();

		if (Valor < 0.0 || Valor > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (Valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (Valor <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (Valor <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}
