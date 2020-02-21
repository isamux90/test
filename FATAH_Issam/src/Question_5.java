import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
		
		if(year%4==0 || year%4==0 && year%100!=0) {
			
			if(year%100!=0) {System.out.println("the year is leap");}
			
			else if (year%400==0) {
				System.out.println("the year is leap");
			}
			
		}else {
			System.out.println("this year is not leap");
		}
        
        
		
	}

	}
	
