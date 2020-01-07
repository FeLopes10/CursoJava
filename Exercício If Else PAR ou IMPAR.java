import java.util.Scanner;

public class Main {

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
