# 2023.12.21
사용 언어 - JAVA 8

### String끼리의 덧셈 ( -> StringBuilder 이용으로 시간 단축 필요)
- 문자열 특성 : + 연산자로 문자열을 결합하면 새로운 String 인스턴스가 생성됨 (인스턴스 내용 변경 X, 새로운 인스턴스 생성)
- StringBuffer는 내용 변경 가능 (인스턴스 생성시 적절한 길이의 char형 배열 생성, 이 공간을 문자열을 저장하고 편집할 수 있는 공간(버퍼)로 사용)
<a href="https://dkswnkk.tistory.com/584">참고 블로그</a>

### BufferedReader 클래스
- readLine()은 반환값이 String임
- 예외처리를 무조건 해주어야 함

### StringTokenizer 클래스
- BufferedReader 메서드로 입력 받기 -> 라인 단위
- 문자열을 여러 개의 토큰으로 분리하는 클래스

- StringTokenizer는 java.util에 포함되어 있는 클래스, 빈 문자열을 토큰으로 인식 X, 반환값이 문자열
- split는 String 클래스에 속해있는 메소드, 빈 문자열을 토큰으로 인식, 반환값이 문자열 배열

  ```java
  import java.io.IOException;
  public static void main(String[] agrs) throws IOException { }
  ```

틀린 코드 : 시간 초과
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
 // BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
	public static void main(String[] args) throws IOException {

		// BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 몇 줄을 받을 지 설정
		int row = Integer.parseInt(br.readLine());

		/* 
		 * 1. for row 수 만큼 읽어오는 것 반복
		 * 2. 	읽어온 줄에 있는 걸 split 해서 두 개를 배열에 담음
		 * 3. 	그거 두 개를 더해서 출력함
		*/

		StringTokenizer st;

		for(int i = 0; i < row + 1; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a  = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a + b);
		}

		// 열어준 Buffer 닫기
		br.close();
	}
}
```

맞은 코드

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        StringBuilder build = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());

            build.append((c + b)).append("\n");
        }

        System.out.println(build);
    }
}
```
