package conditional_statement;

import java.util.Scanner;

public class _2884_ver1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		if(minute - 45 < 0) {
			int mhour = hour - 1;
			if(mhour >= 0)
				System.out.print((mhour)+" "+(60 + (minute-45)));
			else if(mhour < 0)
				System.out.println((24+(mhour))+" "+(60 + (minute-45)));
			// else if(mhour == 0)
				// System.out.println(0+" "+(60 + (minute-45)));
		}
		else if(minute - 45 >= 0)
			System.out.print(hour+" "+minute);
		// else if(minute - 45 == 0)
			//System.out.println(hour+" "+0);
	}
}
