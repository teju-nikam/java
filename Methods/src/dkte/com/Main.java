package dkte.com;

public class Main {

	public static void printJava() {//create onr printJava function 
			System.out.println("Hello Java");
		}
	
	public static void printName(String name) {
		System.out.println(name);
		}
	
	public static void printSum(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		//Methods
		//printJava();//call printJava function how many times we have to print Hello Java
		//printJava();
		//printJava();//we can print hello java for 3 times
		printName("Teju");
		printSum(1,5);
	}

	

}
