/**
 * НаǻишеǾе ǻǼǺгǼаǸа, ǶǺяǾǺ изчиǽǷява ȀаǶǾǺǼиеǷ ǹа ǻǺǷǺжиǾеǷǹǺ чиǽǷǺ
 * въведеǹǺ ǺǾ ǶǺǹзǺǷаǾа.
 */
package homework;

import java.util.Scanner;

public class Lecture10Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int fact = 1;
        int a = 1;
        n = scanner.nextInt();
        while(a <= n){
                fact *= a;
                if(fact <= 0){
                    break;
                }
                a++;
        }
        System.out.println(fact);
    }
}
