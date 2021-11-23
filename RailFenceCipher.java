import java.util.ArrayList;
import java.util.Scanner;

public class RailFenceCipher {
    public static void Encryption(String plainText){
        //calculated the length of the string
        int length=plainText.length();
        //created two arraylist to store the string
        ArrayList<Character> a=new ArrayList<Character>();
        ArrayList<Character> b=new ArrayList<Character>();
        //loop to divide the string
        for(int i=0;i<length;i++){
            if(i%2==0){
                a.add(plainText.charAt(i));
            }
            else {
                b.add(plainText.charAt(i));
            }
        }
        //length of the two new array list
//        System.out.println(a);
//        System.out.println(b);
        //To print the both array list
        System.out.println("Here is your Encrypted text : "+"\n");
        for(Character F:a){
            System.out.print(F);
        }

        for(Character C:b){
            System.out.print(C);
        }
        System.out.println("\n");
    }
    public static void Decryption(String plainText){
        int size=plainText.length();
//        System.out.println(size);
        int len1=0;
        if(size%2!=0){
            len1=(size/2)+1;
//            System.out.println(len1);
        }
        else{
            len1=size/2;
//            System.out.println(len1);
        }
        ArrayList<Character> a=new ArrayList<Character>();
        ArrayList<Character> b=new ArrayList<Character>();
        for(int i=0;i<len1;i++){
            a.add(plainText.charAt(i));
        }
        int len2=size-len1;
        for(int i=0;i<len2;i++){
            b.add(plainText.charAt((len1)+i));
        }
//        System.out.println(len2);
//        System.out.println(a);
//        System.out.println(b);
        //to print th both array list
//        for(Character F:a){
//            System.out.print(F);
//        }
//
//        for(Character C:b){
//            System.out.print(C);
//        }
        System.out.println("\n"+"Here is your Decrypted text: "+"\n");
        for(int i=0;i<len1;i++){
            System.out.print(a.get(i));
            if(len1==len2){
                System.out.print(b.get(i));
            }
            else {
                if (i<len1-1){
                    System.out.print(b.get(i));
                }
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner text=new Scanner(System.in);
        System.out.println("Do you want to Decrypt or Encrypt ( E / D ):");
        char option=text.next().charAt(0);
        if(option=='E'){
            System.out.println("Enter the text that you want to Encrypt : ");
            String plainText=text.next();
            Encryption(plainText);
        }
        else{
            System.out.println("Enter the text that you want to decrypt : ");
            String plainText=text.next();
            Decryption(plainText);
        }
    }
}
