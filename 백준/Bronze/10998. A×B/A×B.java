import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int one = sc.nextInt();
	    int two = sc.nextInt();
	    int mul;
	
	    if(one > 0 && two < 10) {
		mul = one * two;
		System.out.println(mul);
	}
	sc.close();
	}
}