import java.util.Scanner;

public class Main {

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N1;
		int N2;

		System.out.print("Primeiro Numero:");
		N1 = sc.nextInt();
		System.out.print("Segundo Numero:");
		N2 = sc.nextInt();

		if (N1 % N2 == 0 || N2 % N1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
