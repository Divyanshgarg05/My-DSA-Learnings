package D2Array;
public class Transpose {
    public static int[][] Transpose(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int [][]arr = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[j][i] = matrix[i][j];
        }
        }
        return arr;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,},
                        {5,6,7,8},
                        {9,10,11,12}
    };
    int arr[][] = Transpose(matrix);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    }
}
