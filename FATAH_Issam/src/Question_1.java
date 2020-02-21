import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        
        if(number<100) {
        	
        	System.out.println("is lesser than 100");
        }else {
			System.out.println("is greater than 100");
		}
	}
	
}
