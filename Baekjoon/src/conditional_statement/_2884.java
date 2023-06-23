package conditional_statement;

import java.util.Scanner;

public class _2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		int mhour = (hour + ((minute - 45 < 0)? 23 : 0))%24;
		int mMinute = minute + ((minute - 45 < 0)? 15 : -45);
		
		System.out.printf("%d %d", mhour, mMinute);
	}
}
