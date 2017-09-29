package labs;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		if(score>=3.00) {
			System.out.println("Passed!");
		}
		else 
			System.out.println("Failed!");
	}

}
