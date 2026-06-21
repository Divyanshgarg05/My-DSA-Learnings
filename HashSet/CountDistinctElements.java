package HashSet;
import java.util.*;
public class CountDistinctElements {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int []num = {4,3,2,5,6,7,4,3,2,1,7,8};

        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }

        System.out.println(set.size());
    }
}
