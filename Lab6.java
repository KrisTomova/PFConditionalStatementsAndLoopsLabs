package labs;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		int age = sc.nextInt();
		switch (day) {
		case "Weekday":
			if(age>=0 && age<=18) {
				System.out.println("12$");
			}
			else if(age>18 && age<=64) {
				System.out.println("18$");
			}
			else if(age>64 && age<=122) {
				System.out.println("12$");
			}
			else System.out.println("Error!");
			break;
		case "Weekend":
			if(age>=0 && age<=18) {
				System.out.println("15$");
			}
			else if(age>18 && age<=64) {
				System.out.println("20$");
			}
			else if(age>64 && age<=122) {
				System.out.println("15$");
			}
			else System.out.println("Error!");
			break;
		case "Holiday":
			if(age>=0 && age<=18) {
				System.out.println("5$");
			}
			else if(age>18 && age<=64) {
				System.out.println("12$");
			}
			else if(age>64 && age<=122) {
				System.out.println("10$");
			}
			else System.out.println("Error!");
			break;
		}
	}

}
