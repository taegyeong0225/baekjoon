// 기능면에서 동일, 가독성 및 코드 정리함

package arrangement;

import java.util.Scanner;

public class _10807_upgrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String[] numbers = sc.nextLine().split(" ");
		
		if (numbers.length != num) {
			return;
		}
		
		int findNum = sc.nextInt();
				
		int findCount = 0;
		
		for (String n : numbers) {
			if ( findNum == Integer.parseInt(n)) {
				findCount++;
			}
		}
		System.out.println(findCount);
	}	
}
