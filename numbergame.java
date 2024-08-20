package internship;
import java.util.Random;
	import java.util.Scanner;
public class numbergame {
		public static void main(String[]args) {
			Scanner sc = new Scanner (System.in);
			
			//initialization of values 
			
			int userguess,computerguess,totalattempts,totalmatches,win;
			
			totalattempts = 0;
			totalmatches = 0;
			win = 0;
			int max = 100;
			int userreply=1;
			boolean answer = false;
			
		//Generate a random number within a specified range, such as 1 to 100.
			computerguess = (int) (1+Math.random()*(max-1));
			
				//limit the number of attempts the user has to guess the number.
			
			if(userreply == 1) {
				int maxattempts=10;
				totalmatches++;
			while(maxattempts!=0) {	
				maxattempts--;
				int attempts = 0;
			System.out.println("Can you guess the number in 10 attempts"); 
	    	 
	    	 /*Compare the user's guess with the generated number and provide feedback on whether the guess
	    	 is correct, too high, or too low.*/
	    	 
			while(!answer) {
				
				//Prompt the user to enter their guess for the generated number.
				
				System.out.println("Enter your guessed number betweeen 1 to 100");
				userguess = sc.nextInt();
				attempts++;
				if(userguess<computerguess) {
					System.out.println("too low, Try again");
				}
				else if(userguess>computerguess) {
					System.out.println("too high , Try again ");
			}
				else if(userguess==computerguess){
					System.out.println("Congratulation ,You guessed it correct");
					win++;
					answer = true;
					System.out.println("Attempts taken to guess correctly are :"+attempts);
					break;
				}
					else {
					 System.out.println("Could not guess collectly ");
				     System.out.println("Dont loose so easily , You can do it !!!");
				     System.out.println();
					}
					System.out.println();
					totalattempts+=attempts;
				}
			}
			  if (maxattempts == 0) {

			        System.out.println("Maximum number of attempts exceeded");
			    }
			System.out.println("Wanna play another round ??");
				     System.out.println();
				     System.out.println("For YES type 1 , For NO type 2");
				      userreply=sc.nextInt();
			}
			
			//score display
			
			System.out.println("Here is your Score");
			for(int i =0;i<30;i++) {
				System.out.print("=");
			}
			System.out.println();
			System.out.println("Total Attempts"+"  |  "+"Total Matches"+"  |  "+"Wins");
			//for(int i=0;i<1;i++) {
		    System.out.println(" "+totalattempts+"             |   "+totalmatches+"             |  "+win+" ");
			//}
			System.out.println();
			for(int i =0;i<30;i++) {
				System.out.print("=");
			}
			System.out.println();
				System.out.println("End of the game :)"
						+ "Hope you enjoyed ");
	}
	}

