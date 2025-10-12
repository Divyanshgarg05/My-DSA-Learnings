package D2Array;

public class TransposeOfSquare {
    public static void transpose(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int t=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=t;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                           {4,5,6},
                           {7,8,9}
    } ;
    transpose(matrix);
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
    
    }
}
