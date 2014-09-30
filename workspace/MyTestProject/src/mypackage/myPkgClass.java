package mypackage;

import java.util.Random;

public class myPkgClass {

	public static void main(String[] args) {

		Random rand = new Random();

		int number = rand.nextInt(10);

		System.out.println(number);

	}

}
