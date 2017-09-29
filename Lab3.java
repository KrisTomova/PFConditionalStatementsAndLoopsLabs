package labs;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		minutes = minutes+30;
		if(minutes>59) {
			hours++;
			minutes = minutes - 60;
		}
		if(hours>23) {
			hours=hours-24;
		}
		if(minutes<10) System.out.println(hours+":0"+minutes);
		else System.out.println(hours+":"+minutes);
		// or for the last syso :
		//System.out.printf("%d:%02d", hours,minutes);
	}

}
