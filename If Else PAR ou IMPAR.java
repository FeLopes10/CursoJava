import java.util.Scanner;

public class Main {

/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N;

		System.out.println("Par ou Impar?");
		N = sc.nextInt();

		if (N % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}
}
