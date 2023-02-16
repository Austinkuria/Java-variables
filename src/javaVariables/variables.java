/**
 * 
 */
package javaVariables;

/**
 * @author Austin
 *
 */
public class variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string-stores text such as "Hello world".Surrounded by double quotes.
//int-stores integer(whole numbers)eg23.
//float- stores floating point numbers,with decimals such as 1.90.
//char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//boolean - stores values with two states: true or false
	
		String name = "Austin Kuria";
		System.out.println(name);
		
		int myAge = 19;
		System.out.println(myAge);
		
//You can also declare a variable without assigning the value, and assign the value later
		int myNum;
	    myNum = 15;
	    System.out.println(myNum);
	    
//if you assign a new value to an existing variable, it will overwrite the previous value	    
	    int myNum2 = 15;
	    myNum2 = 20;  // myNum is now 20
	    System.out.println(myNum2);
	    
//If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
	   /* final int myNum3 = 15;
	    myNum3 = 20; 
	    System.out.println(myNum3); // will generate an error: cannot assign a value to a final variable*/
	    
		float salary = 1234.56f;
		System.out.println(salary);
		
		char myLetter = 'D';
		System.out.println(myLetter);
		
		boolean myBool = true;
		System.out.print(myBool);
	}

}
