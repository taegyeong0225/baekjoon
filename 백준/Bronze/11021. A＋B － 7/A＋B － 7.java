import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		
		int[] arr = new int[caseNum];
		for(int i = 0; i < caseNum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a + b;
			arr[i] += c;
		}
		sc.close();
		
		for(int j = 1; j < caseNum + 1; j++)
			System.out.printf("Case #%d: %d\n", j, arr[j-1]);
	}
}
