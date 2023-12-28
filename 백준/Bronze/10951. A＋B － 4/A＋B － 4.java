import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String num = sc.nextLine();
			
			if (num.isEmpty()) {
                break;
            }
			
			String[] arguNum = num.split(" ");
			
			String one;
			String two;
			
			if(arguNum.length >= 2) {
				one = arguNum[0];
				two = arguNum[1];
			
				int firstNum = Integer.parseInt(one);
				int secondNum = Integer.parseInt(two);
					
				System.out.println(firstNum + secondNum);
			}
		}
		sc.close();
	}
}
