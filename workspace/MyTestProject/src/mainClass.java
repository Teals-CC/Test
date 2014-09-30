/*****************************************
 * 
 * @author Can Coler
 * Date: Sept 2, 2014
 * Purpose: Test the output from SecondClass
 *
 ********************************************/

public class mainClass {

	/******************************************
	* Purpose: To output the string from the SecondClass
	* Precond: SecondClass needs to be accessible
	* Postcond: myFunction() in SecondClass called and the output from myFunction
	* 			will get printed on the console
	* 
	* @param args
	*******************************************/
	public static void main(String[] args) {

		System.out.println("Howdy partner!");
		
		//This is where the new object is created and its value output
		SecondClass mySecondClass = new SecondClass();
		System.out.println(mySecondClass.myFunction(5,2));
		
		//this is where i'm printing my custom string
		System.out.println("We have our string here!");
	}

}
