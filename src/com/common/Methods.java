package com.common;

import java.util.Scanner;
import com.common.Field;


public class Methods {
	
	public static int inputInt(){
		System.out.print("Input number: ");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		System.out.print(number);
		return number;
	}
	
	public static char inputChar(){
		System.out.print("Input char: ");
		Scanner sc = new Scanner (System.in);
		char character = sc.next().charAt(0);
		return character;
		
	}
	
	public static char choise(int counter){
		char sign;
		if (counter % 2 == 0) {
			sign = 'X';
		} else {
			sign = 'O';
		}
		return sign;
	}
	
}
