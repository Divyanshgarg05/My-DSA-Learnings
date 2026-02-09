//Given a 2*n board and tiles of size 2*1 , count thee number of ways 
//to tile the given board using the 2*1 tiles. 

package Recursion;

public class TilingProblem {

    public static int tillingProblem(int n){
        //base case
        if(n == 0 || n==1){
            return 1;
        }

        //vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice 
        int fnm2 = tillingProblem(n-2);

        int totWays = fnm1 +fnm2;

        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
