
public class two_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		arraytype[][]arrayname=new arraytype[rowsize][colsize]
		//what is difference between varible and array
		
		int[][] numbers= {{25,35},{23,84},{87,93},{83,23}};
		//accessing index values
		System.out.println(numbers[0][0]);
		
		//access all element using for-loop
		System.out.println(" two dimen");
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		//accessing using for-each
		System.out.println("for each");
		for(int a[]:numbers) {//convert to 2d to 1d
			for(int b:a) {//get 1d array data is object and convert to variable
				System.out.print(b + " ");
			}
			System.out.println();
			
		}
	}

}
