package repeat;
import java.util.Scanner;

public class _25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int four = sc.nextInt();
		sc.close();
		
		int repeat = four / 4;
		
		for(int i = 0; i < repeat; i++)
			System.out.print("long ");
		System.out.println("int");
	}
}
