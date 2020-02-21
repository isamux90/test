import java.util.Scanner;

public class Question_11 {

public static void main(String[] args) {
	
	
		for (int i = 0; i <= 4000; i++) {
			
			if(i%4==0 && i%100==0 && i%400==0 || i%4==0 && i%100!=0) {
				
				continue;
				
			}else {
				System.out.println(i);
			}
			}
			
		}
		
	}
	
