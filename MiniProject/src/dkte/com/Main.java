package dkte.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int myNumb = (int)(Math.random()*100);
		int usernumb;
		do {
			System.out.println("Guess my number:");
			usernumb = sc.nextInt();
			if(usernumb==myNumb) {
				System.out.println("Yohooo.....You guess correct number");
				break;
				
			}
			else if (usernumb>myNumb){
				      System.out.println("Your number is too large");
			}
			
			else {
				System.out.println("Your number is too small");
			}
			
		}while(usernumb>=0);
		
		System.out.println("My number was:");
		System.out.println(myNumb);

	}

}
