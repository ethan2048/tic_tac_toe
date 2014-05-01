package com.examples;

import java.util.Scanner;

import com.common.*;

public class ExampleField {

	private static final int LINE_SIZE = 14;
	private static final int DEFAULT_CELL = 0;
	private static final int NUMBER_ZERO_ASCII = 0;
	
	
	private int exampleField[][] = new int[LINE_SIZE][LINE_SIZE];
	
	private void CellEraser(){
		for (int i = 0; i < LINE_SIZE; i++) {
			for (int j = 0; j < LINE_SIZE; j++) {
				exampleField[i][j] = DEFAULT_CELL;
			}
		}
	}
	
	public void FieldView(){
		System.out.print("dfdfd");
		for (int i = 0; i < LINE_SIZE; i++) {
			for (int j = 0; j < LINE_SIZE; j++) {
				System.out.print("[" + exampleField[i][j] + "]");
			}
		System.out.println();
		}
	}
	
	public void MakeField() {
		NumberingField();
		FieldView();
	}
	
	
	
	public void NumberingField(){
		int k = NUMBER_ZERO_ASCII;
		for (int i = 0; i < LINE_SIZE; i++){
			for (int j = 0; j < LINE_SIZE; j++)
			{
				exampleField[i][j] = k;
				k++;
			}
		}
	}
	
	
	public void FindCell(int keyboardNum){
	int x, y;
	x = keyboardNum % LINE_SIZE;
	y = keyboardNum / LINE_SIZE;
	exampleField[y][x] = Methods.InputInt();
	}
	//public 
	//System.out.println();
	
	
	
	
}
