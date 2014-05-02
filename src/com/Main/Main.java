package com.Main;

import com.common.*;
import com.examples.*;

public class Main {

	public static void main(String[] args) {
				
		//отрисовка пол€
		Field gameField = new Field();
		gameField.makeField();
		
		//Ќачало игрового цикла
		for (int counter = 0; counter < Field.getFieldSize(); counter++){
			int masCoordinates[] = new int[2];
			int keyInput = Methods.inputInt();
			
			gameField.viewField();
			System.out.println("~~~~~~~~~~~~~~~~~~");
						
			for (;;) {
				masCoordinates = gameField.findCell(keyInput);
				if (gameField.getFieldCell(masCoordinates[0], masCoordinates[1]) == ' '){
					gameField.setField(Methods.choise(counter), masCoordinates[0], masCoordinates[1]);
					gameField.viewField();
					break;
				} else {
					System.out.println("This square isn't empty, enter another field code: ");
					keyInput = Methods.inputInt();
				}
				
			}
		}
		gameField.viewField();
		//int key = Methods.InputInt();
		//gameField.FindCell(key);
//		
//		gameField.FieldView();
//
		
		
		
	}
}