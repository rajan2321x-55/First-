import java.util.Scanner;

public class Two_dimenshional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter the rowsize for 2d array");
		
		int rowsize=in.nextInt();
		
		
System.out.println("enter the colsize for 2d array");
		
		int colsize=in.nextInt();
		
		int [][] arr=new int[rowsize][colsize];
		System.out.println("enter the elements for 2d array");
		
		for(int i=0;i<rowsize;i++) {
	for(int j=0;j<colsize;j++) {
		System.out.println("element [" + i+"] ["+j+"]: ");
		arr[i][j]=in.nextInt();
	}
			
		}
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<colsize;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
