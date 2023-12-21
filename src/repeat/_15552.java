// 빠른 A+B
package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15552 {
	public static void main(String[] args) throws IOException {
		// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
		
		// BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 몇 줄을 받을 지 설정
		int row = Integer.parseInt(br.readLine());
		int[] arr = new int[row];
		
		/* 1. for row수 만큼 읽어오는 것 반복
		 * 2. 	읽어온 줄에 있는 걸 split해서 두 개를 배열에 담음
		 * 3. 	그거 두 개를 더해서 출력함
		*/
		
		// 열어준 Buffer 닫기
		br.close();
	}
}
