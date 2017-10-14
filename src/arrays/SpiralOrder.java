package arrays;

public class SpiralOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2},{3,4},{5,6},{7,8}};
		spiralOrder(matrix);
	}
	
	private static void spiralOrder(int[][] matrix) {
		int size = matrix.length * matrix[0].length;
		int rowFirst = matrix.length - 1, colFirst = matrix[0].length - 1;
		int rowSec = 1, colSec = 0;
		int count = 0;
		
		while(rowFirst >= rowSec || colFirst >= colSec) {
			
			for(int i = rowSec - 1; i <= colFirst; i++) {
				if(rowFirst <= 0 && rowFirst < rowSec && count >= 1) continue;
				System.out.print(matrix[rowSec - 1][i] + "1st ");
			}
			if(rowFirst == 0 && colFirst != 0) break;
			
			for(int i = colSec + 1; i <= rowFirst; i++) {
				if(colFirst <= 0 && colFirst < colSec && count >= 1) continue;
				System.out.print(matrix[i][colFirst] + "2nd ");
			}
			if(rowFirst != 0 && colFirst == 0) break;
			
			for(int i = colFirst - 1; i >= colSec; i--) {
				if(rowFirst < rowSec) continue;
				System.out.print(matrix[rowFirst][i] + "3rd ");
			}
			
			for(int i = rowFirst - 1; i >= rowSec; i--) {
				if(i < 0 || colFirst <= colSec) continue;
				System.out.print(matrix[i][colSec] + "4th ");
			}
			
			rowFirst--;
			colFirst--;
			rowSec++;
			colSec++;
			count++;
		}
	}

}
