import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
		
		if (number<200 && number%2==0) {
			System.out.println("the number is less than 200 and is a even number");
		} else {
			System.out.println("invalid number");
		}
	}
	
}
