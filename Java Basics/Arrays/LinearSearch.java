package Arrays;

public class LinearSearch {
public static int linearSearch(int ar[],int key){
    for(int i=0;i<ar.length;i++){
        if(ar[i] == key){
            return i;
        }
    }
    return -1;
}

    public static void main(String[] args) {
        int ar[] = {2,3,5,9,12,34,56};
        int key=12;
        int index = linearSearch(ar, key);
        System.out.println(index);
    }
}
