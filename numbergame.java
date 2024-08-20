package internship;
import java.util.Random;
	import java.util.Scanner;
public class numbergame {
		public static void main(String[]args) {
			Scanner sc = new Scanner (System.in);
			
			//initialization of values 
			
			int userguess,computerguess,totalattempts,totalmatches,win;
			
			totalattempts = 0;
			totalmatches = 1;
			win = 0;
			int max = 100;
			String userreply= "N";
			boolean answer = false;
			
		//Generate a random number within a specified range, such as 1 to 100.
			computerguess = (int) (1+Math.random()*(max-1));
			
				//limit the number of attempts the user has to guess the number.
			
				int maxattempts=0;
				int attempts = 0;
			System.out.println("Can you guess the number in 10 attempts"); 
	    	 
	    	 /*Compare the user's guess with the generated number and provide feedback on whether the guess
	    	 is correct, too high, or too low.*/
	    	 
			while(!answer) {
				maxattempts++;
				
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
					if(maxattempts==10) {
						System.out.println("You have reached to the maximum try , please Restart");
						break;
					}
				}
			System.out.println("Wanna play another round ??");
		     System.out.println();
		     System.out.println("For YES type 'Y' , For NO type 'N'");
		      userreply=sc.next();
		      
		if(userreply == "Y"||userreply=="y") {
			totalmatches++;
           while(!answer) {
				maxattempts++;
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
					if(maxattempts==10) {
						System.out.println("You have reached to the maximum try , please Restart");
						break;
					}
				}
		}	
		
		//score display
		
		else {
			
			
			System.out.println("Here is your Score");
			for(int i =0;i<50;i++) {
				System.out.print("=");
			}
			System.out.println();
			System.out.println("Total Attempts"+"  |  "+"Total Matches"+"  |  "+"Wins");
		    System.out.println(" "+totalattempts+"             |   "+totalmatches+"             |  "+win+" ");
			System.out.println();
			for(int i =0;i<50;i++) {
				System.out.print("=");
			}
			System.out.println();
				System.out.println("End of the game :)Hope you enjoyed ");
	}
	}
}

