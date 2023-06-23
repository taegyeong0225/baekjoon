package IoAndCal;

import java.math.BigInteger;
import java.util.Scanner;

public class _11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        sc.close();
        BigInteger d = a.add(b);
        BigInteger e = d.add(c);
        System.out.print(e);
    }
}
