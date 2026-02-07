
public class Swappiong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  []arr= {10,20,30,40};
		int start=0,end=arr.length-1;
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;		}
		System.out.println("revere array");
		for(int val:arr) {
			System.out.println(val);
		}
	}
	

}
