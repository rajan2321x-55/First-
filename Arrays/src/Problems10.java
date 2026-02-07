
public class Problems10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("main diagonal");
		for(int i=0;i<matrix.length;i++) {
			System.out.println(matrix[i][i] + " ");
		}
		
		System.out.println(" secondary diagonal");
		for(int i=0;i<matrix.length;i++) {
			System.out.println(matrix[i][matrix.length-1-i]);
		}
	}

}
