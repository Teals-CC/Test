package myPackage;

public class myFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myValue = "39";
		String myObj = "asdfas";
		String myObj2 = null;
		
		
		int celsius = Integer.parseInt(myValue);
		double celsiusDouble = (double)celsius;
		
		double answer = ((double)celsius*9/5)+32;
				
		for(int x = 0; x<10; x++)
		{
			int y = 2;
			double z = x + y;
			System.out.println(z);
		}
		
		
		
		System.out.println(answer);
		
		int x = 1;
		int y = 2;
		double z = x + y;
		
		System.out.println(z);
	}
}
