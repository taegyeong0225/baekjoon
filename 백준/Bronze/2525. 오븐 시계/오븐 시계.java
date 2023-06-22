import java.util.Scanner;

public class Main {
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
		
		// 시간을 더하니 60분 이상인 경우
		if(rMinute >= 60) {
			// 기존 시간 + 60으로 나눈 몫(더해질 시간
			// % 24로 24시가 나올 경우 0시로 표기
			int rHour = (hour + (rMinute/60)) % 24;
			rMinute = rMinute % 60;
			System.out.printf("%d %d", rHour, rMinute);
		}
		else // else를 안쓸 시 if문을 실행하고도 밑 문장을 실행하게 된다
			System.out.printf("%d %d", hour, rMinute);
	}
}
