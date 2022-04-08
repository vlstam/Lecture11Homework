package homework;

import java.util.Scanner;

public class Lecture10Homework5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String myWord = scan.next();
//        for(int a = 0; a <= myWord.length(); a++){
//            if(myWord.charAt(a) != myWord.length()){
//                System.out.println("not a ");
//            }
        //System.out.println("is a");
//        }
       int a = 0;
       int b = myWord.length() - 1;
        while(a < b){
            if(myWord.charAt(a) != myWord.charAt(b)){
                System.out.println("The word is not a palindrome");
                break;
            }
            a++;
            b--;
            System.out.println("The word is a palindrome");
        }

    }
}
