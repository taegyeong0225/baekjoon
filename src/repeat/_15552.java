// ���� A+B
package repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15552 {
	public static void main(String[] args) throws IOException {
		// BufferedReader�� ����ϱ� ���ؼ��� throws IOException�� �� �־�� ��.
		
		// BufferedReader ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� ���� ���� �� ����
		int row = Integer.parseInt(br.readLine());
		int[] arr = new int[row];
		
		/* 1. for row�� ��ŭ �о���� �� �ݺ�
		 * 2. 	�о�� �ٿ� �ִ� �� split�ؼ� �� ���� �迭�� ����
		 * 3. 	�װ� �� ���� ���ؼ� �����
		*/
		
		// ������ Buffer �ݱ�
		br.close();
	}
}
