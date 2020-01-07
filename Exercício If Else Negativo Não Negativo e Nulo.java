import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inteiro;

		System.out.println("Qual inteiro?");
		inteiro = sc.nextInt();

		if (inteiro < 0) {
			System.out.println("NEGATIVO");
		} else if (inteiro > 0) {
				System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NULO");
		}
		
	}
}
