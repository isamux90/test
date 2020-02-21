import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double price = sc.nextFloat();
        double tips = price * 0.2 ;
        
        
        System.out.println("The check amount is "+(price+tips));

	}
	
	
}
