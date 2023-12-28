# 2023.12.28 (목)
사용 언어 - JAVA 8

### logic
1. 숫자 입력을 받는다.
2. while (다음 줄에 내용이 존재하면)         <br>
 	2-1. 입력 내용 읽기 (비어있으면 반복문 종료)  <br>
	2-2. 입력 받은 거 둘로 나누기              <br>
	2-3. If (입력 받은 값이 두 개 이상이면)     <br>
		2-3-1. 변수 두 개에 나눈 값 담기         <br>
		2-3-2. 숫자 두 개 int형으로 변환        <br>
		2-3-3. 더한 값 출력
### 주요 문법
hasNextLine() : 다음 줄에 내용이 있는지 확인하는 메서드
isEmpty() : 내용이 없는 확인하는 메서드

틀린 코드 : 런타임 에러 (NoSuchElement)
```
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String num = sc.nextLine();
			String[] arguNum = num.split(" ");
			
			String one;
			String two;
			
			if(arguNum.length >= 2) {
				one = arguNum[0];
				two = arguNum[1];
			
				int firstNum = Integer.parseInt(one);
				int secondNum = Integer.parseInt(two);
					
				System.out.println(firstNum + secondNum);
			} else {
				return;
			}
		}
	}
}
```

맞은 코드
```
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
```

맞은 코드 (코드 길이 수정)
- 입력 문자열 읽기 + 분할 과정
- 배열 길이로 직접 확인
- 피연산자 변수 선언과 정수형으로 저장을 동시에 진행
- break문으로 수정
```
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String num = sc.nextLine().split(" ");

			if(arguNum.length >= 2) {
				int one = Integer.parseInt(arguNum[0]);
				int two = Integer.parseInt(arguNum[1]);
				System.out.println(firstNum + secondNum);
			} else {
				break;
			}
		}
		sc.close();
	}
}
```
