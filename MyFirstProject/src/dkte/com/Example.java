package dkte.com;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// conditional example
		//for example
				Scanner sc = new Scanner(System.in);
				int cash = sc.nextInt();
				//pen = 10 book = 40
				System.out.println("Enter the cash:");
				if(cash>10) {
					System.out.println("Cannot buy anything");
					System.out.println("You need more cash");
				}
				else if(cash>10 && cash<40) {
					System.out.println("You can buy one thing");
					
				}
				else {
					System.out.println("You can get both");
				}

	}

}
