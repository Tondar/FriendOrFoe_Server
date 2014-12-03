package main;

import java.util.Scanner;

import listener.Listener;

public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); //Liest die Benutzereingaben 
		int numberOfPlayers = 0;
		
		System.out.println("Willkommen!");
		while (numberOfPlayers == 0 ) {
			System.out.println("Geben sie bitte die Anzahl der Spieler ein:");
			if(userInput.hasNextInt()) {
				numberOfPlayers = userInput.nextInt();
			} else {
				System.out.println("Bitte ein Zahl eingeben!");
				userInput.next();
			}
		}
		
		Thread listener = new Thread( new Listener());
		listener.start();
		
	}

}
