import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:");

		Double x = sc.nextDouble();
		Double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (y == 0.0) {
			System.out.println("Eixo x");
		} else if (x == 0.0) {
			System.out.println("Eixo y");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");

		}
		sc.close();
	}
}