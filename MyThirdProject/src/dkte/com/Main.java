package dkte.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// loop
		/*Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter the number:");
			number = sc.nextInt();
			System.out.print("Here is your number:");
			System.out.println(number);
			
		}while(number>=0);
		
		System.out.println("The end");*/
		
		
		//break and continue
		int i = 0;
		while(true) 
		{
			if(i==3){//for exclude 3
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			if(i>5) {
				break;//without this loop will run for infinite time
			}
		}

	}

}
