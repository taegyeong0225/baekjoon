# [Bronze IV] 빠른 A+B - 15552 

[문제 링크](https://www.acmicpc.net/problem/15552) 

### 성능 요약

메모리: 241880 KB, 시간: 716 ms

### 분류

구현, 사칙연산, 수학

### 제출 일자

2023년 12월 21일 20:29:58

### 문제 설명

<p>본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.</p>

<p>C++을 사용하고 있고 <code>cin</code>/<code>cout</code>을 사용하고자 한다면, <code>cin.tie(NULL)</code>과 <code>sync_with_stdio(false)</code>를 둘 다 적용해 주고, <code>endl</code> 대신 개행문자(<code>\n</code>)를 쓰자. 단, 이렇게 하면 더 이상 <code>scanf</code>/<code>printf</code>/<code>puts</code>/<code>getchar</code>/<code>putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.</p>

<p>Java를 사용하고 있다면, <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용할 수 있다. <code>BufferedWriter.flush</code>는 맨 마지막에 한 번만 하면 된다.</p>

<p>Python을 사용하고 있다면, <code>input</code> 대신 <code>sys.stdin.readline</code>을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 <code>.rstrip()</code>을 추가로 해 주는 것이 좋다.</p>

<p>또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.</p>

<p>자세한 설명 및 다른 언어의 경우는 <a href="http://www.acmicpc.net/board/view/22716">이 글</a>에 설명되어 있다.</p>

<p><a href="http://www.acmicpc.net/blog/view/55">이 블로그 글</a>에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.</p>

### 입력 

 <p>첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.</p>

### 출력 

 <p>각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.</p>

 <hr>

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
