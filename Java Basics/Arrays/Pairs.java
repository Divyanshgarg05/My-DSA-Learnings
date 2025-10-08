package Arrays;

public class Pairs {
    public static void pairs(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                System.out.print("(" +ar[i]+","+ar[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ar[] = {2,4,6,8,10};
        pairs(ar);

    }
}
