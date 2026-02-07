import java.util.Scanner;

public class Onedimensional {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int size=in.nextInt();
		
		int [] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("element "+ (i+1) + " :");
			arr[i]=in.nextInt();
			
			
		}		
		//index from 0 to 4
				//element 1 arr[0]:25;element 2 arr[1]:25;lement 3arr[2]:25;
			
				
		
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i] + " ");
		}
		
	}

}
