import java.util.Arrays;

public class one_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//types of arrays
		//1.one dimenesional arrays
		//2.multi dimensional array
		//
//		/1.one dimenesional arrays:
//			1d array is a collection of elements with single index value
//			1d array can have multiple column but one row
//			
//			creation of 1d array involves 2 types:
//				1.declare an array
//				2.assign values to the array
//		
//		syntax:
//			Arraytype [] arrayname=new arraytype[size];
		
//		arraytype ->specfies the type of element to be stored in array
//		arrayname->sprcfies the name of the array
//		[size]->specfies the size of the array;
		
		
		//assign values directly
		//array methods:
		//toString();
		//length
		//equal()-->will act as same as ==operator
		//
		
		int []arr= {25,23,4,5};
		int [] arr1= {25,23,4,5};
		int [] arr2=arr;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		
		
	}System.out.println(Arrays.toString(arr));
	System.out.println(arr==arr2);
	System.out.println(arr==arr1);
	System.out.println(arr.equals(arr2));
	System.out.println(arr.equals(arr1));
	//access using index
	System.out.println(arr[2]);
	
	//for each loop or enchaned loop syntax:
	//for( datatype varible _name:object(array_name)){
	
	//statement
	//
	
	System.out.println("foreach");
	for(int num:arr) {
		System.out.print(num + " ");
	}
	System.out.println("reverse");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
		}}

