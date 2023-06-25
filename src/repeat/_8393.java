// 합 구하기
package repeat;

import java.util.Scanner;

public class _8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = num - 1; i > 0; i--)
			num += i;
		
		System.out.print(num);
	}
}
