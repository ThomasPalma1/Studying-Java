package vectors;

import java.util.Scanner;

import entities.ProductToVector;

public class VectorTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ProductToVector[] vect = new ProductToVector[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductToVector(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;

		System.out.printf("AVERANGE = %.2f%n", avg);
		sc.close();
	}

}
