import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		// 줄 수
		for(int i = 0; i < input; i++) {
			for(int k = input - i; k > 1; k--) {
				System.out.print(" ");
			}
			//찍을 별 수
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}