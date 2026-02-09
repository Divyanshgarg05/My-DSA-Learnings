//Given n friends , each one can remain single or can be paired up with some other friend.
//Each friend can be paired only once .FInd out the total number of ways in which friends can remain single 
//or can be paired up

package Recursion;

public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        
        //single
        int fnm1 = friendsPairing(n-1);


        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        return  fnm1 + pairWays;

    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
