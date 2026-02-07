import java.util.Arrays;
import java.util.Scanner;

public class Arrays_in {
	
	public static void main(String args[]) {
		
		
String [] foods= {"idly","dosa","poori"};

Scanner in=new Scanner(System.in);
System.out.println("enter the food");
String target=in.nextLine();

for(int i=0;i<foods.length;i++) {
	if(foods[i].equals(target)) {
		System.out.println(" element found at " +i );
		break;
	}
}
	
		
	}

}
