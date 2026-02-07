import java.util.Scanner;

public class problems_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
	
		
		int[] arr=new int[n]; 
		
		int []temp=new int[n];
		int newlength=0;
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
			
		}
		System.out.println("\n original array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<n;i++) {
			boolean isduplicate=false;
			for(int j=0;j<newlength;j++) {
				if(arr[i]==temp[j]) {
					isduplicate=true;
					break;
					
				}
	
				
			}
			if(!isduplicate) {
				temp[newlength++]=arr[i];
			}
			
		}
		System.out.println("\n removed duplicate ");
for(int i=0;i<newlength;i++) {
	System.out.println(temp[i] + " ");
}
	}

}
