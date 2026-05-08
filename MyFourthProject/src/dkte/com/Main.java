package dkte.com;

public class Main {

	public static void main(String[] args) {
		// TRY-CATCH in EXCEPTION HANDLING: in EXCEPTION we can catch specific exception and then we can continue remaning code.
		
		int[] marks = {92,93,94};
		System.out.println(marks[0]);
		//System.out.println(marks[5]);//ArrayIndexOutOfBoundsException
		//After error if we want to run remain code then we use try-catch
		
		try {
			System.out.println(marks[5]);//write that line which has exception
		}catch(Exception exception){//exception is object
			//do something after catching
			//write that which we have to run after catch the exception
			System.out.println(marks[2]);
			System.out.println(marks[1]);
			
		}
		System.out.println("The name is teju");
	}

}
