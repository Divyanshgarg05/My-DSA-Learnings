package Arrays;

public class Reverse {
    public static void swap(int ar[],int l,int h){
        int t = ar[l];
         ar[l] = ar[h];
         ar[h] = t;
    }
    public static  void reverse(int ar[]){
        int l = 0;
        int h = ar.length - 1;
        while(l<h){
            swap(ar,l,h);
            l++ ;
            h--;
        }
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,8};
        reverse(ar);

        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
