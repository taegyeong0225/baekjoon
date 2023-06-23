package conditional_statement;

import java.util.Scanner;

public class _2481_verC {
	public static void main(String[] args) {
		// 과정 1) 주사위 3번 입력 받기 (1~6)
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		sc.close();
		
		int money = 0;
		// 과정 2) 같은 눈이 나왔는지에 따른 상금계산
		// 세 개가 같다? 10,000원+(같은 눈)×1,000원
		if(first == second && second ==  third) {
			money = 10000 + first * 1000;
		}
		// 두 개가 같다?(세 가지 경우) 
		// 1,000원+(같은 눈)×100원
		else if(first == second || second == third || first == third) {
			int sameNum;
			
			if (first == second)
				sameNum = first;
			else if (first == third)
				sameNum = first;
			else if (second == third)
				sameNum = second;
			money = 1000 + first * 100;
		}
		
		// 세 개가 다 다르다? (그 중 가장 큰 눈)×100원 -> 크기 비교 필요
		else {
			int max = first;
			
			if(second > max)
				money = second * 100;
			if(third > max)
				money = third * 100;
		}
		System.out.println(money);
	}
}
