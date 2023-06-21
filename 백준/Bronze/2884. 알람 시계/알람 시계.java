import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		minute -= 45;
		if(minute < 0) {
			hour = (hour == 0)? 23 : hour - 1;
			minute += 60;
		}
		
		System.out.printf("%d %d", hour, minute);
	}
}
