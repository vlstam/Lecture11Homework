package homework;

import java.util.Scanner;

public class Lecture10Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int a = size; a >= 1; a--) {
            for (int c = 0; c <= a; c++) {
                System.out.print(" ");
            }

            for (int b = size; b >= 1; b--) {
                System.out.print('#'+" ");

            }
            size--;
            System.out.println();
        }
    }
}

