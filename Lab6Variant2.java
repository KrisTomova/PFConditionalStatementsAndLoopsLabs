package labs;

import java.util.Scanner;

public class Lab6Variant2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		int age = sc.nextInt();
		int ticketPriceChildren = 0;
		int ticketPriceAdults = 0;
		int ticketPriceSeniors = 0;
		switch (day) {
		case "Weekday":
			ticketPriceChildren=12;
			ticketPriceAdults=18;
			ticketPriceSeniors=12;
			break;
		case "Weekend":
			ticketPriceChildren=15;
			ticketPriceAdults=20;
			ticketPriceSeniors=15;
			break;
		case "Holiday":
			ticketPriceChildren=5;
			ticketPriceAdults=12;
			ticketPriceSeniors=10;
			break;
		}
		if(age>=0 && age<=18) {
			System.out.printf("%s$",ticketPriceChildren);
		}
		else if(age>18 && age<=64) {
			System.out.printf("%s$", ticketPriceAdults);
		}
		else if(age>64 && age<=122) {
			System.out.printf("%s$",ticketPriceSeniors);
		}
		else System.out.println("Error!");
	}

}
