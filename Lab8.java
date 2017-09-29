package labs;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int currentNumber = 1;
		for (int i=0; i<n;i++) {
			System.out.println(currentNumber);
			sum+=currentNumber;
			currentNumber+=2;
		}
		System.out.println("Sum: "+sum);
	}
}
