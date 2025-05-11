package new1;

public class Matrices {
	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 0, 0},
	            {0, 5, 0},
	            {0, 0, 9}
	        };
		int flag=0;
		for (int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(i==j) {
					if(matrix[i][j]!=0) {
						flag=1;
					}
				}
			}
		}
		if (flag==1) {
			System.out.println("It is a diagonal matrix");
		}
		else {
			System.out.println("it is not");
		}
		
	}

}
