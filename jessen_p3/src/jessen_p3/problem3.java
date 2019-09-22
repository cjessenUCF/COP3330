package jessen_p3;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		// Create array of topics for users to rate
		
		String[] topics = new String[5];
		
		topics[0] = "Accuracy of college football team rankings";
		topics[1] = "Lack of stores in the Oviedo Mall";
		topics[2] = "Should breed specific legislation for dogs be allowed";
		topics[3] = "Viability of government-sponsored scholarships for private elementary school attendance";
		topics[4] = "Use of standardized testing in the public school system";
				
		int[][] responses = new int[5][10];
		boolean anotherUser = true;
		int userCount = 0;
		
		// Loop until there are no more users interesting to rating the topics
		
		while (anotherUser) {
			for(int x = 0; x < 5; x++) { 
				System.out.println(topics[x]);
				
				int rating = scnr.nextInt();
				
				responses[x][rating-1] = responses[x][rating-1] + 1;			
			}	
			
			System.out.println("Would another user like to rank these topics? Press N if there are no further users.");
			char userChoice = scnr.next().charAt(0);
			
			userCount++;
			
			if(userChoice == 'N') {
				anotherUser = false;
			}
		}
		
		int highestTotal = 0;
		int highestTotalTopic = 0;
		int lowestTotal = 9999;
		int lowestTotalTopic = 0;
		
		// Keep data counts to calculate the topics of most and least importance to users
		
		for(int x = 0; x < 5; x++) { 
			System.out.print("Topic " + (x + 1) + "\t\t");
			int runningTotal = 0;
			
			for (int y = 0; y < 10; y++) {
				System.out.print(responses[x][y] + "\t");
				runningTotal = runningTotal + (responses[x][y] * (y + 1));
			}
			
			if (runningTotal > highestTotal) {
				highestTotal = runningTotal;
				highestTotalTopic = x;	
			}
			
			if (runningTotal < lowestTotal) {
				lowestTotal = runningTotal;
				lowestTotalTopic = x;
			}
			
			double avg = runningTotal / userCount;
			System.out.print(avg);
			System.out.print("\n");
		}
		
		System.out.println("Topic: " + (highestTotalTopic + 1) + " has the highest ratings with " + highestTotal);
		System.out.println("Topic: " + (lowestTotalTopic + 1) + " has the lowest ratings with " + lowestTotal);
		
	}

}
