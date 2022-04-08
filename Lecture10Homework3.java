/**
 * НаǻǼавеǾе ǻǼǺгǼаǸа PrintTriangle1, ǶǺяǾǺ ǻечаǾа ǹа еǶǼаǹа ǽǷедǹаǾа
 * ȀигǿǼа
 */

package homework;

public class Lecture10Homework3 {
    public static void main(String[] args) {
        int size = 5;
        for (int a = size; a >=1 ; a--) {
            for (int b = size; b >=1; b--) {
                System.out.print(b + " ");
            }
            size--;
            System.out.println();
        }
    }

}
