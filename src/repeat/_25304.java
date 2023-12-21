package repeat;
import java.util.Scanner;

public class _25304 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int totalPrice = sc.nextInt();
		int kindNum = sc.nextInt();
		
		int[] objectTotalPrice = new int[kindNum];
		for(int i = 0; i < kindNum; i++) {
			int perPrice = sc.nextInt();
			int number = sc.nextInt();
			objectTotalPrice[i] =  perPrice * number; 
			}	
		// price + number들의 합이 totalPrice와 같은지 확인
		int checkTotalPrice = 0;
		for(int total : objectTotalPrice) {
			checkTotalPrice += total;
		}
		if(checkTotalPrice == totalPrice)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		sc.close();
	}
}
