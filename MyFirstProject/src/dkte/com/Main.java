package dkte.com;

public class Main {
	public static void main(String[] args) {
		//String
		String name1 = "Teju";
		String name2 = "Trushna";
		String name3 = name1 + name2 ;
		String name4 = name1 + "and" +name2;
		System.out.println(name3); //string concatenation
		System.out.println(name4);
		
		//understand character position
		System.out.println(name1.charAt(0));
		//length()
		System.out.println(name1.length());
		//replace()
		 String name5 = name1.replace('T','P');//case sensitive
		 System.out.println(name5);
		 //substring
		 String name6 = "Teju and Rudra";
		 System.out.println(name6.substring(0,4));//last index not include in output
		}
	

}
