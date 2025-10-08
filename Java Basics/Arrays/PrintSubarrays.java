package Arrays;

public class PrintSubarrays {
    public static void printSubarrays(int ar[]){
        for(int i=0;i<ar.length ;i++){
            
            for(int j=i;j<ar.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int ar[] = {2,4,6,8,10};
        printSubarrays(ar);
    }
}
