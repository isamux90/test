import java.util.Scanner;

public class Question_9 {

	
	public static void main(String[] args) {
		
System.out.print("How many rows de you want ? ");
		
	Scanner sc = new Scanner(System.in);
	int rows = sc.nextInt();


			int comp = 1;
			
			
			
			for (int i = rows; i > 0; i--)
			{
			
			    for (int j = 1; j <= i; j++){
			    
			        System.out.print(" ");
			    }
			
			    for (int j = 1; j <= comp; j++){
			    
			        System.out.print(comp+" ");
			    }
			
			    System.out.println();
			
			    comp++;
				}}
}

		
	
	

