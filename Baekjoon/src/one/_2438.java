package one;

import java.util.Scanner;

public class _2438 {
	public static void main(String[] args) {
		// 별 찍기
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
