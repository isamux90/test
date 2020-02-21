import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		
		
		  
	      int n = 0;
		  int m = 1;
	        

	        for (int i = 0; i <= number; i++)
	        {
	        	 int sum = n + m;
		            n = m;
		            m = sum;
	        	
	        	System.out.print(n + " ");

	           
	        }
	    }
	
}
	
	

