package labs;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String country = sc.nextLine();
		switch(country) {
		case "USA":
		case "England":
			System.out.println("English");
			break;
		case "Spain":
		case "Argentina":
		case "Mexico":
			System.out.println("Spanish");
			break;
		default:
			System.out.println("unknown");
		}
		
		
	}

}
