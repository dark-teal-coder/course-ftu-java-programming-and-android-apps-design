package javaandroidappsdesign.lesson02;

import java.util.Scanner;

public class Sample107 {
	public static void main(String[] args) {	
		Scanner check = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int userAge = check.nextInt();
		check.close();
		
		if(userAge < 18) {
			System.out.println("You can't see this film!");
		}
		else {
			System.out.println("You can see this film!");
		}
		
		System.out.println("Thank You.");
	}
}