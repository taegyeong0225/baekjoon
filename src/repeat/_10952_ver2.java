package repeat;

import java.util.Scanner;

public class _10952_ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if( a == 0 && b == 0)
				break;
			int c = a + b;
			System.out.println(c);
		}
		sc.close();
	}
}
