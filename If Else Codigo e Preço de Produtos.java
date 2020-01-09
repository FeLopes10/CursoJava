import java.util.Scanner;

public class Main {
	
	/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

    CÓDIGO      ESPECIFICAÇÃO       PREÇO
     1          Cachorro quente     R$4,00
     2          X - Salada          R$4,50
     3          X - Bacon           R$5,00
     4          Torrada simples     R$2,00
     5          Refrigerante        R$1,50  */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque o CÓDIGO do produto e em seguida a QUANTIDADE:");

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		}

		System.out.printf("Total a pagar : R$ %.2f%n", total);

		sc.close();
	}
}
