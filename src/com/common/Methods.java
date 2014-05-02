package com.common;

import java.util.Scanner;
import com.common.Field;


public class Methods {
	
	private static final int WIN_LENGHT = 2; //количество совпадений - 1
	
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
	
	private static boolean seekLine(char field[][], int i){ //закрыть потом нахуй
		int counter = 0;
		for (int j = 0; j < Field.getLineSize() - 1; j++)
		{
			if (counter == WIN_LENGHT) {
				return true;
			}
			if ( (field[i][j+1] == field[i][j]) && (field[i][j] != ' ')) {
				counter++;
			} else {
				counter = 0;
			}
		}
		if (counter == WIN_LENGHT){
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean seekColumn(char field[][], int j){
		int counter = 0;
		for (int i = 0; i < Field.getLineSize() - 1; i++)
		{
			if (counter == WIN_LENGHT) {
				return true;
			}
			if ( (field[i+1][j] == field[i][j]) && (field[i][j] != ' ')) {
				counter++;
			} else {
				counter = 0;
			}
		}
		if (counter == WIN_LENGHT){
			return true;
		} else {
			return false;
		}
	}
	
	public static void seekRightDiag(char field[][], Field gameField){
		for (int j = 0; j < Field.getLineSize() - WIN_LENGHT; j++)
		placeHorizontalUp(j, gameField, "down");
	}
	  
	
	public static void placeHorizontalUp(int j, Field gameField, String place){ //Абсолютно адовый быдлокод
		if (place == "up"){		
			for (int i = 0; i < Field.getLineSize() - WIN_LENGHT; i++){
				System.out.println("Hu");
				for (; j < Field.getLineSize(); j++, i++){
					gameField.setField('X',i,j);
				}
			}
		} else {
				for (; j < Field.getLineSize() - 1; j++){
					System.out.println("Hu");
					for (int i = 0; i < Field.getLineSize() - 2; j++, i++){
						gameField.setField('X',j,i);
					}
				}
			}
		}
	
	
	public static boolean rule(char[][] field){
		boolean win = false;
		
		for(int j = 0; j < Field.getLineSize(); j++)
		{
			win = Methods.seekLine(field, j);
			if (win == true)
			{
				return true;
			}
		}
		for(int i = 0; i < Field.getLineSize(); i++)
		{
			win = Methods.seekColumn(field, i);
			if (win == true)
			{
				return true;
			}
		}
		
		
		return false;
	}
	
}
