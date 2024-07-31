package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

/*
	1085. 직사각형에서 탈출   
	한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
	직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
	
	첫째 줄에 x, y, w, h가 주어진다.
	
	첫째 줄에 문제의 정답을 출력한다.
	
	[제한]
	1 ≤ w, h ≤ 1,000
	1 ≤ x ≤ w-1
	1 ≤ y ≤ h-1
	x, y, w, h는 정수
*/

// 주어지는 변수는 총 4개다.
// 한수의 위치를 나타내는 x, y 그리고 직사각형 오른쪽 위 꼭짓점의 위치인 w, h
// 직사각형을 탈출하는 최소거리는 4가지 방법 중 하나다.
// 위, 아래, 좌, 우 중 최솟값만 찾으면 되는 것

// 최솟값을 찾는 방법은 if - else 문을 써도 되고, Math.min() 함수를 써도 된다.

// BufferedReader 로 입력받고 int형으로 쓰고싶을 경우 반드시 Integer.parseInt() 로 형 변환을 해주어야한다.
public class step_10_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
        
		int x_min = Math.min(x, w-x);	// x축 최소거리
		int y_min = Math.min(y, h-y);	// y축 최소거리
        
		// x와 y축 최소거리 중 가장 작은 값
		System.out.println(Math.min(x_min, y_min));
	}

}

class step_10_02_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		in.close();
        
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
        
		int x_min = Math.min(x, w-x);	// x축 최소거리
		int y_min = Math.min(y, h-y);	// y축 최소거리
        
		// x와 y축 최소거리 중 가장 작은 값
		System.out.println(Math.min(x_min, y_min));
	}

}
