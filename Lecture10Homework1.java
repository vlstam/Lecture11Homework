/**
 * Напишете програма, която събира само положителни числа до 100, ако
 * потребителят въведе отрицателно число го пропускате
 */
package homework;

import java.util.Scanner;

public class Lecture10Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        n = scanner.nextInt();
        do {
            sum += n;
            if (sum < 0) {
                continue;
            }    n++;


        } while (n <= 100);
        System.out.println(sum);
    }
}
