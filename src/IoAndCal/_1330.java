// 조건문, 숫자 비교
package IoAndCal;

import java.util.Scanner;

public class _1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a>b)
			System.out.println(">");
		else if(a==b)
			System.out.println("==");
		else
			System.out.println("<");		
	}
}
