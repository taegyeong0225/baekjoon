package repeat;

import java.util.ArrayList;
import java.util.Scanner;

public class _10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a와 b가 0일 때까지 a와 b 입력받고 더한 값 저장하기

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a = 1; int b = 1;
		while(!(a == 0 && b == 0)) {
			a = sc.nextInt();
			b = sc.nextInt();
			int c = a + b;
			arr.add(c);
		}
		for(int i = 0; i < arr.size() - 1; i++)
			System.out.println(arr.get(i));
			
		sc.close();
	}
}
