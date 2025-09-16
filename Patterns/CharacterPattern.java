package Patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        int n = 65;
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)n);
                n +=1;
            }
            System.out.println();
        }
    }
}
