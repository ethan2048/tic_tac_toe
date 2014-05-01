package com.common;

public class Field {

	private static final int LINE_SIZE = 5;
	private static final char DEFAULT_CELL = ' ';
	private static final int FIELD_SIZE = LINE_SIZE * LINE_SIZE;
	
	public static int GetLineSize(){
		return LINE_SIZE;
	}
	
	public static int GetFieldSize(){
		return FIELD_SIZE;
	}
	
	
	private char field[][] = new char[LINE_SIZE][LINE_SIZE];
	
	public char GetFieldCell(int i, int j){
		return field[i][j];
	}
	
	public char[][] GetField(){
		return field;
	}
	
	public void SetField(char letter, int i, int j){
		field[i][j] = letter; 
	}
	
	private void CellEraser(){
		for (int i = 0; i < LINE_SIZE; i++) {
			for (int j = 0; j < LINE_SIZE; j++) {
				field[i][j] = DEFAULT_CELL;
			}
		}
	}
	
	public void ViewField(){
		System.out.println();
		for (int i = 0; i < LINE_SIZE; i++) {
			for (int j = 0; j < LINE_SIZE; j++) {
				System.out.print("[" + field[i][j] + "]");
			}
		System.out.println();
		}
	}
	
	public void MakeField() {
		CellEraser();
		//ViewField();
	}
	
	
	public int[] FindCell(int keyboardNum){
		int x[] = new int[2];
		do {System.out.println("out of");
			if ( (keyboardNum >= 0) && (keyboardNum < FIELD_SIZE) ) {
				System.out.println("I'm in! \n");
				x[1] = keyboardNum % LINE_SIZE;
				x[0] = keyboardNum / LINE_SIZE;
			} else {
				System.out.println("Error. Your number higer than field size.");
				keyboardNum = Methods.InputInt();
			}
		} while (keyboardNum > FIELD_SIZE);
		return x; 
	}
	
	
	
}
