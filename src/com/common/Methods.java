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
		for (int i = 0; i < Field.getLineSize() - WIN_LENGHT; i++){
			//placeHorizontalGeneral(i, gameField, "down");
			placeHorizontalGeneral(i, gameField, "up");
			System.out.println("Hu");

		}
	}
	  
	
	public static boolean placeHorizontalGeneral(int j, Field gameField, String place){ //Абсолютно адовый быдлокод
		if (place == "up"){		
			int counter = 0;
			for (int i = 0; i < Field.getLineSize() - WIN_LENGHT; i++){
				System.out.println("Hu");
				for (; j < Field.getLineSize(); j++, i++){
					gameField.setField('X',i,j);
					if (gameField.getFieldCell(i, j) == gameField.getFieldCell(i++, j)) {
						counter++;
						if (counter == WIN_LENGHT) {
							return true;
						}
					} else {
						counter = 0;
					}
				}
			}
			return false;
		} else {
				for (int i = j; i < Field.getLineSize() - WIN_LENGHT;){
					//placeHorizontalUp(j, gameField, "up");
					//	System.out.println("Hu");
					for (int k = 0; k < Field.getLineSize() - j; k++, i++){
						gameField.setField('X', i, k);
					}
				}
		}
		return false;
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
