package labs;

import java.util.Scanner;

public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			System.out.println("It is a number.");
		}
		catch (Exception e) 
		{
			System.out.println("Invalid input!");
		}
	}

}
