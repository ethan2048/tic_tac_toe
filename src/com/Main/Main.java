package com.Main;

import com.common.*;
import com.examples.*;

public class Main {

	public static void main(String[] args) {
				
		//отрисовка пол€
		Field gameField = new Field();
		gameField.MakeField();
		
		//Ќачало игрового цикла
//		for (int counter = 0; counter < Field.GetFieldSize(); counter++){
//			int masCoordinates[] = new int[2];
//			int keyInput = Methods.InputInt();
//			
//			
//			//gameField.ViewField();
//			System.out.println("~~~~~~~~~~~~~~~~~~");
//						
//			for (;;) {
//				masCoordinates = gameField.FindCell(keyInput);
//				if (gameField.GetFieldCell(masCoordinates[0], masCoordinates[1]) == ' '){
//					gameField.SetField(Methods.Alternation(counter), masCoordinates[0], masCoordinates[1]);
//					gameField.ViewField();
//					break;
//				} else {
//					System.out.println("This square isn't empty, enter another field code: ");
//					keyInput = Methods.InputInt();
//				}
//				
//			}
			

			
			
		//}
		Methods.SeekRightDiag(gameField.GetField(), gameField);
		gameField.ViewField();
		//int key = Methods.InputInt();
		//gameField.FindCell(key);
//		
//		gameField.FieldView();
//
		
		
		
	}
}