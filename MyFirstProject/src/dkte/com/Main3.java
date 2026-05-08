package dkte.com;

public class Main3 {

	public static void main(String[] args) {
		// Casting
		//implicit casting : we can easily convert one data type to another
		double price = 100.00;
		double finalprice = 10 + price;//here 10 is integer but double data type has large memory so there is no error.
		System.out.println(finalprice);
		
		//explicit casting
		int p = 100;
		int fp = p + (int)18.0;//we have to add double in int so there is need to write int before double value 
		System.out.println(fp);
		/* in short 
		 * implicit casting : we want to store small value with large data type(direct store)
		 * explicit casting : we want to store large value with small data type (need to add small data type before value)
		 */
		
		
		//Constants
		float PI = 3.14F;
		PI = 3.15F;
		System.out.println(PI);
		final  float PI1 = 3.14F; //after applying final keyword we can not reassign the value
		System.out.println(PI1);
		

	}

}
