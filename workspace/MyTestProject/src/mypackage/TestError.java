/************************************
 * 
 * The purpose of this class is to test student
 * understand of syntax errors. They will need to 
 * identify the errors in order to get full credit. 
 * 
 * @author Can Coler
 * 
 * September 17, 2014
 * 
 ************************************/

package mypackage;

public class TestError {

	public static void main(String[] args) {
		
		String myInput = "39";
		
		int celsius = Integer.parseInt(myInput);
		
		double celsiusDouble = (double)celsius;
		
		double answer = (double)celsius*9/(5+32);
				
		System.out.println("The fahrenheit equivalent of + celsius + is + answer");

	}

}
