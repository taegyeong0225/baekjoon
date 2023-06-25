// 런타임 에러 (InputMismatch)
package IoAndCal;

import java.util.Scanner;

public class _11382_1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.print(a+b+c);
    }
}
