package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	27323. 직사각형  
	정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 직사각형의 넓이를 cm2 단위로 구하시오.
	표준 입력에 다음과 같은 형태로 입력이 주어진다.
	세로 길이가 A cm, 가로 길이가 B cm인 직사각형의 넓이를 cm2 단위로 구하고, 단위 (cm2)를 생략하여 출력한다.
	
	[제한]
	- 1 ≦ A ≦ 100.
	- 1 ≦ B ≦ 100.
	- A, B 는 정수이다.
*/
public class step_10_01 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        System.out.print(A*B);

        br.close();
    }

}
