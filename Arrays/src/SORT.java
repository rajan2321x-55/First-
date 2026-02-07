import java.util.Arrays;

public class SORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {5,8,6,4,7};
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		
		//binary
		int index=Arrays.binarySearch(arr,4);
		System.out.println("\n binary " + index);
		
		//array copy
		int[] original = {4,8,6,3};
		int[] copy=Arrays.copyOf(original, original.length);
		System.out.println(" \n copying " + Arrays.toString(copy));
		
		
		int[] copyrange=Arrays.copyOfRange(original, 0,3);//des-1
		System.out.println("\n copy based on range  " + Arrays.toString(copyrange));
		
		
		//clone array
		
		int [] arr1= {25,45,78};
		System.out.println("\n og " + Arrays.toString(arr1));
		int [] clone=arr1.clone();
				System.out.println("\n cloned " + Arrays.toString(clone));
	}
	

}
