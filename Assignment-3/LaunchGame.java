package gusserGame;

import java.util.*;

class Guesser{
	int guessNum;
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number between 1 to 10");
		guessNum = sc.nextInt();
		if(guessNum>10) {
			System.out.println("Please guess between 1 to 10");
			guessNum = sc.nextInt();
			return guessNum;
		}else {
			return guessNum;
		}
	}
}

class Player{
	
int guessNum1;
int guessNum2;
int guessNum3;

	
	int guessNum1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 kindly guess the number between 1 to 10");
		guessNum1 = sc.nextInt();
		if(guessNum1>10) {
			System.out.println("Please guess between 1 to 10");
			guessNum1 = sc.nextInt();
			return guessNum1;
		}else {
			return guessNum1;
		}    
	}
	
	int guessNum2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 2 kindly guess the number between 1 to 10");
		guessNum2 = sc.nextInt();
		if(guessNum2>10) {
			System.out.println("Please guess between 1 to 10");
			guessNum2 = sc.nextInt();
			return guessNum2;
		}else {
			return guessNum2;
		}
    }
	
	int guessNum3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 3 kindly guess the number between 1 to 10");
		guessNum3 = sc.nextInt();
		if(guessNum3>10) {
			System.out.println("Please guess between 1 to 10");
			guessNum3 = sc.nextInt();
			return guessNum3;
		}else {
			return guessNum3;
		}
    }
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
	}
	void compare() {
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {

	Umpire u = new Umpire();
	u.collectNumFromGuesser();
	u.collectNumFromPlayers();
	u.compare();
		
	}

}
