import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(1 <= input && input<= 100) {
			for(int i = 0; i < input; i++) {
				for(int j = 0; j <= i; j++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}