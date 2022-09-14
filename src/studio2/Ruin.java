package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your starting amount?"); 
		double startAmount = in.nextDouble(); 
		double currentAmount= startAmount; 
		
		System.out.println("What is the winChance of the game?"); 
		double winChance= in.nextDouble(); 
		
		System.out.println("What is your win limit"); 
		double winLimit= in.nextDouble(); 
		
		System.out.println("How many days do you want to play?"); 
		int totalSimulations = in.nextInt(); 
		
		int ruin=0; 
		
		
		
		
		
		for (int i=1; i<=totalSimulations; i++)
		{
		
		int totalPlays=1; 
		currentAmount= startAmount; 
		
		//code for one day

	
			while (currentAmount<winLimit && currentAmount>0)
			{
				
			//System.out.println("plays: "+totalPlays); 
			
			
			double win= (Math.random()*100)+0; 
			if (winChance*100>=win)
			{
				currentAmount+=1; 
			}
			else 
			{
				currentAmount-=1; 
			}
			//System.out.println("current amount: "+currentAmount);
			totalPlays++; 
			
			}
			
			
		//print output 
			System.out.print("Simulations "+i +": "+ totalPlays);
			if (currentAmount==winLimit)
			{
				System.out.println (" WIN");
			}
			else if (currentAmount==0)
			{
				System.out.println (" LOSE");
				ruin++; 
			}
		
		}
			
		double a;
		double b= (1-winChance)/winChance; 
		if (winChance==0.5)
			{
				a = 1-startAmount/winLimit;
			}
		else
			{
			a = (Math.pow(b, startAmount) - Math.pow(b, winLimit))/(1 - Math.pow(b,  winLimit));
			}
		
		
			System.out.println("Loses: "+ruin); 
			System.out.println("Ruin Rate from Simulations: " +((double)ruin/totalSimulations));
			System.out.println("Expected ruin rate: "+ a); 
		
			
			
			
			
			
		
	}

}
