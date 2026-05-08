package dkte.com;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// Arrays : for storing large list(non-primitive)
		//[] for indicating it is list
		int age = 30;
		int[] marks = new int[3];//3 is size of array , new is keyword used in non primitive data type
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		//length
		System.out.println(marks.length);//not assign function parenthesis because it is one of the array property.
		
		//sort
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		//for  not declaring any value in java then it gives nulll or 0
		boolean[] marks1 = new boolean[3];
		System.out.println(marks1[2]); //output: false
		
		int[] age1 = new int[3];
		System.out.println(age1[2]); //output:0
		
		//if we already know the elements in array then there is no need of new keyword
		int[] marks2 = {93,95,98};
		
		//for 2D arrays
		int[][] finalmarks = {{97,98,99},{93,95,98}};
		System.out.println(finalmarks[0][0]);//first[0] for 1st student marks and second [0] for 1st student 1st subject mark
		System.out.println(finalmarks[1][1]);
		
		
		
		
		

	}

}
