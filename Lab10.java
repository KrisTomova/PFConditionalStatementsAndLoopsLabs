package labs;

import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int times = sc.nextInt();
		if(times>10)
			 System.out.println(number+" X " +times+" = "+number*times);
		 while(times<=10) {
			System.out.println(number+" X " +times+" = "+number*times);
			times++;
		}
	}
		

}
