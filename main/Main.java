package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); //Liest die Benutzereingaben 
		
		System.out.println("Willkommen!");
		System.out.println("Geben sie bitte die Anzahl der Spieler ein:");
		if(userInput.hasNextInt()) {
			//TODO threadpool aufbauen
		} else {
			System.out.println("Bitte ein Zahl eingeben!");
		}
	}

}
