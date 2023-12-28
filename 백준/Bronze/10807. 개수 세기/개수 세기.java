import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String[] numbers = sc.nextLine().split(" ");
		int findNum;
			
		int findCount = 0;
			
		if (numbers.length == num) {
			findNum = sc.nextInt();
		} else {
			return;
		}
				
		for (String n : numbers) {
			if ( findNum == Integer.parseInt(n)) {
				findCount++;
			}
			continue;
		}
		System.out.println(findCount);
	}	
}
