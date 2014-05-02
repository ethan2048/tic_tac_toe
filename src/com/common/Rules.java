package com.common;

public class Rules {
	private static final int WIN_LENGHT = 2;

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

	
	private static boolean seekColumn(char field[][], int j, String direction){
		int counter = 0, k = 0, g = 0;
		
		if (direction == "string") {
			k = 1;
		}	
		if  (direction == "column"){ 
			g = 1;
		} else {
			System.out.println("Error in string");
			return false;
		}
		
			for (int i = 0; i < Field.getLineSize() - 1; i++)
			{
				if (counter == WIN_LENGHT) {
					return true;
				}
				if ( (field[i+k][j+g] == field[i][j]) && (field[i][j] != ' ')) {
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
