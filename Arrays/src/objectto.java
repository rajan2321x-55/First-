
public class objectto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {7,1,5,3,9
				
		};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
				
			}else if(arr[i]<min2&&arr[i]!=min1) {
				min2=arr[i];
				
			}
		}
		System.out.println("second " + min2);
	}

}
