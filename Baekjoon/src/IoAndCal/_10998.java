package one;

import java.util.Scanner;

public class _10998 {
	// 곱셈 출력
	// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int mul;
	
		if(one > 0 && two < 10) {
			mul = one * two;
			System.out.println(mul);
		}
		sc.close();
	}
}
