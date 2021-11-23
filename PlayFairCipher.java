import java.lang.reflect.Array;
import java.util.Scanner;
public class PlayFairCipher {
    public static char [][] matrix={{'C','R','Y','P','T'},{'O','A','B','D','E'},{'F','G','H','I','K'},{'L','M','N','Q','S'},{'T','U','V','W','X','Y'}};
//    public void Encyption(String plain_text){
//
//    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
