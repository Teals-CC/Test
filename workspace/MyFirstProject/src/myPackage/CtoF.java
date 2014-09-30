package myPackage;

import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		
		String myName = scan.nextLine();
		
		int myNum = Integer.parseInt(myName) * 2;
		
		System.out.println("Enter your favorite number: ");
		
		int myFav = scan.nextInt();
		

		
		System.out.println(myName + " your favorite number is : " + myNum);
		
	}

}
