package Game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			String[] rps = {"r", "p", "s"};
			String cmove = rps[new Random().nextInt(rps.length)];
			
			String mymove;
			
			while(true)
			{
				System.out.println("Please enter your move(r,p s)");
				mymove = sc.nextLine();
				if(mymove.equals("r") || mymove.equals("p") || mymove.equals("s"))
				{
					break;
				}
				System.out.println(mymove +"is not valid move");
			}
			System.out.println("Computer played: "+cmove);
			if(mymove.equals(cmove))
			{
				System.out.println("The game was Tie!");
			}
			else if(mymove.equals("r"))
			{
				if(cmove.equals("p"))
				{
					System.out.println("You Lose!");
				}
				else if(cmove.equals("s"))
				{
					System.out.println("You Win!");
				}
			}
			else if(mymove.equals("p"))
			{
				if(cmove.equals("r"))
				{
					System.out.println("You Win!");
				}
				else if(cmove.equals("s"))
				{
					System.out.println("You Lose!");
				}
			}
			else if(mymove.equals("s"))
			{
				if(cmove.equals("p"))
				{
					System.out.println("You Win!");
				}
				else if(cmove.equals("r"))
				{
					System.out.println("You Lose!");
				}
			}
			System.out.println("Play Again? (Y/N)");
			String playAgain = sc.nextLine();
			
			if(!playAgain.equals("y") || !playAgain.equals("Y"))
			{
				break;
			}
		}
	}
}
