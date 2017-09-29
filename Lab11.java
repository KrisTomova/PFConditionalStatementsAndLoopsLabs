package labs;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n%2==0) {
			System.out.println("Please write an odd number.");
			n = sc.nextInt();
		}
		if(n<0) System.out.println("The number is: "+(-n));
		else System.out.println("The number is: "+n);
	}

}
