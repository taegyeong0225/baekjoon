package conditional_statement;

import java.util.Scanner;

public class _2525 {
	public static void main(String[] args) {
		// 과정 1. 시간 입력 세 개 받기 (시, 분, 시간(분))
		// 과정 2. 분 + 시간
		// 	1. 더한 시간이 60분 이상이라면?
		// -> '시간' + 60으로 나눈 몫, 60으로 나눈 나머지는 '분' 
		// 2. 그외의 경우 -> 그대로 더한 시간을 출력
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		sc.close();
		
		int rMinute = minute + time;
		int rHour = (hour + (rMinute / 60)) % 24;
		
		// rMinute = ((rMinute >= 60)? rMinute % 60 : 0);
		rMinute = rMinute % 60;
		System.out.printf("%d %d", rHour, rMinute);
	}
}
