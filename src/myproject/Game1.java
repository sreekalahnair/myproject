package myproject;
import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int numbertoguess = rand.nextInt(100)+1;
		int numberOftries= 0;
		Scanner s = new Scanner (System.in);
		while(true) {
			System.out.println("guess a number between 1 to 100 ");
			int guess= s.nextInt();
			numberOftries++;
			if (guess<numbertoguess) {
				System.out.println("too low!try again");
				
			}
			else if (guess>numbertoguess) {
				System.out.println("too high!try again.");
				
			}
			else {System.out.println("Congratulations!you found the numberin"+ numberOftries + " tries");
			break;
			}
		}
		
	}

}
