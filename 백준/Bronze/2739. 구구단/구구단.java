import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();
    
    for(int i = 1; i <= 9; i++) {
        int rs = a * i;
        System.out.printf("%d * %d = %d\n", a, i, rs);
        }
    }
}
