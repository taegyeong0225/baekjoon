import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int[][] arr = new int[caseNum][3];
		for(int i = 0; i < caseNum; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			int c = a + b;
			arr[i][0] += a;
			arr[i][1] += b;
			arr[i][2] += c;
		}
		sc.close();
		
		for(int j = 1; j < caseNum + 1; j++)
			System.out.printf("Case #%d: %d + %d = %d\n", j, arr[j-1][0], arr[j-1][1], arr[j-1][2]);
	}
}