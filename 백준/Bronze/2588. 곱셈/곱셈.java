import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int[] arr = new int[3];
		
		// 100의 자릿수는 100으로 나누고 소수점 절삭
		arr[2] = (int) B/100; 
		int hundred = arr[2];
		// 10 자릿수는 ..
		// 10으로 나눠서 1의 자릿수로 오게 하고
		// 10의 자릿수 값* 10 으로 나눈 나머지
		int ten = (int) (B/10 % (hundred * 10)); 
		arr[1] = ten;
		// 셋째 자릿수는 ..
		// 100의 자릿수 * 100 + 10의 자릿수 * 10으로 나눈 나머지
		int one = B % (hundred * 100 + ten * 10);
		arr[0] = one;
		
		int third = arr[2];
		int second = arr[1];
		int first = arr[0];
		
		System.out.println(A*first);
		System.out.println(A*second);
		System.out.println(A*third);
		System.out.println(A*B);
	}
}
