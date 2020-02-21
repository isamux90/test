import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    String city = sc.next();
    String movie = sc.next();
    
    
    switch (city) {
	case "fairfax":
		switch (movie) {
		case "Thor":System.out.println("In "+ city +" cinemax currently running movie :"+ movie);
			
			break;
		case "xman":System.out.println("In "+ city +" cinemax currently running movie :"+ movie);
			
			break;	

		default:System.out.println("this movie is not running in fairfax");
			break;
		}
		break;
	case "Mclean":
		switch (movie) {
		case "titanic":System.out.println("In "+ city +" cinemax currently running movie :"+ movie);
			
			break;
		case "pet":System.out.println("In "+ city +" cinemax currently running movie :"+ movie);
			
			break;	

		default:System.out.println("this movie is not running in Mcean");
			break;
		}
		
		break;
	case "Falls Church":
		switch (movie) {
		case "race":System.out.println("In "+ city +" cinemax currently running movie :"+ movie);
			
			break;
		case "fast":System.out.println("In "+ city +" cinemax currently running movie :"+ movie);
			
			break;	

		default:System.out.println("this movie is not running in Falls Church");
			break;
		}
		break;
	

	default:
		break;
	}
    
    
	
	}
	
}
