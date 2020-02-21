import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		
		int number =0;
		int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("write the numbers");
        while(true)
               {
                       number=input.nextInt(); 
                       if(number<0)
                        break;
                       sum = sum +number;
               }
                       System.out.println("Sum ="+sum);
      }
	
}
