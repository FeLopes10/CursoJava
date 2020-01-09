import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Renda:");

		double Renda = sc.nextDouble();

		double imposto;

		if (Renda <= 2000.0) {
			imposto = 0.0;
		} else if (Renda <= 3000.0) {
			imposto = (Renda - 2000.0) * 0.08;
		} else if (Renda <= 4500.0) {
			imposto = (Renda - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (Renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
	}
}
