//rotating a matrix by 90 degree
public class RotateImage {

	public static void main(String[] args) {
		int[][] array={{1,2,3},{4,5,6},{7,8,9}};
		int[][] rotate= new int[array.length][array.length];
		int k=1;
		int row=array.length;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				
					rotate[j][row-k]=array[i][j];
				
				
			}
			k++;
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				System.out.print(rotate[i][j]+" ");
			}
			System.out.print("\n");
		}
		

	}

}
