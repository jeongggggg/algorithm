package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
	14215. 세 막대
	영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.

	영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
	
	- 각 막대의 길이는 양의 정수이다
	- 세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
	- 삼각형의 둘레를 최대로 해야 한다.
	a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오. 
	
	첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.
	
	첫째 줄에 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
*/

/*
 	삼각형의 조건 : 가장 긴 변의 길이가 다른 변의 길이의 합보다 작아야 한다
 	
 	a+b+c-maxN은 가장 긴 변의 길이를 제외한 합인데 여기서 줄인 길이를 더해주어야 한다.

	줄여야 하는 길이는 가장 긴 변의 길이를 제외한 합에서 1만큼 줄여준 값이기 때문에
	
	(a+b+c-maxN)*2-1을 출력
*/
public class step_10_08 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        int c = Integer.parseInt(st.nextToken());

	        int maxN = 0;
	        if(a>b){
	            if(b>c) maxN = a;
	            else maxN = (a>c) ? a : c;
	        }
	        else maxN = (b>c) ? b : c;

	        if(a+b+c-maxN > maxN) System.out.println(a+b+c);
	        else System.out.print((a+b+c-maxN)*2-1);

	        br.close();
	    }

}
