package com.common;

import java.util.Scanner;
import com.common.Field;


public class Methods {
	
	private static final int WIN_LENGHT = 2; //количество совпадений - 1
	
	public static int InputInt(){
		System.out.print("Input number: ");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		System.out.print(number);
		return number;
	}
	
	public static char InputChar(){
		System.out.print("Input char: ");
		Scanner sc = new Scanner (System.in);
		char character = sc.next().charAt(0);
		return character;
		
	}
	
	public static char Alternation(int counter){
		char sign;
		if (counter % 2 == 0) {
			sign = 'X';
		} else {
			sign = 'O';
		}
		return sign;
	}
	
	private static boolean SeekLine(char field[][], int i){ //закрыть потом нахуй
		int counter = 0;
		for (int j = 0; j < Field.GetLineSize() - 1; j++)
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
	
	private static boolean SeekColumn(char field[][], int j){
		int counter = 0;
		for (int i = 0; i < Field.GetLineSize() - 1; i++)
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
	
	public static void SeekRightDiag(char field[][], Field gameField){
		for (int j = 0; j < Field.GetLineSize() - WIN_LENGHT; j++)
		PlaceHorizontalUp(j, gameField, "down");
	}
	  
	
	public static void PlaceHorizontalUp(int j, Field gameField, String place){
		if (place == "up"){		
			for (int i = 0; i < Field.GetLineSize() - WIN_LENGHT; i++){
				System.out.println("Hu");
				for (; j < Field.GetLineSize(); j++, i++){
					gameField.SetField('X',i,j);
				}
			}
		} else {
				for (; j < Field.GetLineSize() - 1; j++){
					System.out.println("Hu");
					for (int i = 0; i < Field.GetLineSize() - 2; j++, i++){
						gameField.SetField('X',j,i);
					}
				}
			}
		}
	
	
	public static boolean Rule(char[][] field){
		boolean win = false;
		
		for(int j = 0; j < Field.GetLineSize(); j++)
		{
			win = Methods.SeekLine(field, j);
			if (win == true)
			{
				return true;
			}
		}
		for(int i = 0; i < Field.GetLineSize(); i++)
		{
			win = Methods.SeekColumn(field, i);
			if (win == true)
			{
				return true;
			}
		}
		
		
		return false;
	}
	
}
