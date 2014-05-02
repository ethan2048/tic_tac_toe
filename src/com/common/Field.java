package com.common;

public class Field {

	private static final int LINE_SIZE = 3;
	private static final char DEFAULT_CELL = ' ';
	private static final int FIELD_SIZE = LINE_SIZE * LINE_SIZE;
	
	public static int getLineSize(){
		return LINE_SIZE;
	}
	
	public static int getFieldSize(){
		return FIELD_SIZE;
	}
	
	
	private char field[][] = new char[LINE_SIZE][LINE_SIZE];
	
	public char getFieldCell(int i, int j){
		return field[i][j];
	}
	
	public char[][] getField(){
		return field;
	}
	
	public void setField(char letter, int i, int j){  //Добавить условие возможности добавления только X или O
		field[i][j] = letter; 
	}
	
	private void сellEraser(){
		for (int i = 0; i < LINE_SIZE; i++) {
			for (int j = 0; j < LINE_SIZE; j++) {
				field[i][j] = DEFAULT_CELL;
			}
		}
	}
	
	public void riewField(){
		System.out.println();
		for (int i = 0; i < LINE_SIZE; i++) {
			for (int j = 0; j < LINE_SIZE; j++) {
				System.out.print("[" + field[i][j] + "]");
			}
		System.out.println();
		}
	}
	
	public void makeField() {
		сellEraser();
		//ViewField();
	}
	
	
	public int[] findCell(int keyboardNum){
		int x[] = new int[2];
		do {System.out.println("out of");
			if ( (keyboardNum >= 0) && (keyboardNum < FIELD_SIZE) ) {
				System.out.println("I'm in! \n");
				x[1] = keyboardNum % LINE_SIZE;
				x[0] = keyboardNum / LINE_SIZE;
			} else {
				System.out.println("Error. Your number higer than field size.");
				keyboardNum = Methods.inputInt();
			}
		} while (keyboardNum > FIELD_SIZE);
		return x; 
	}
	
	
	
}
