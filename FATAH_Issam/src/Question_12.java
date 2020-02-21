import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Question_12 {

	public static void main(String[] args) {
		
		System.out.println("What is the command keyloop to exit aloop in Java ?");
		System.out.println("a.Quit");
		System.out.println("b.Continue");
		System.out.println("c.Break");
		System.out.println("d.Exit");
		System.out.println("Enter the choice :");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		
		
		
		while(!choice.equals("d")){
			
			System.out.println("incorect");
			System.out.println("press the button to continue");
			 choice = sc.nextLine();
			
		};
		
		System.out.println("correct");
		
	}	
	
}
