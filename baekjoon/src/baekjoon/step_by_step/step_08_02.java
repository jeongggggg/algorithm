package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	11005. 진법 변환2 
	10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
	10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
	A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
	
	첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

	첫째 줄에 10진법 수 N을 B진법으로 출력한다.
*/


public class step_08_02 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int N = Integer.parseInt(st.nextToken()); // 10진수 숫자
	        int B = Integer.parseInt(st.nextToken()); // 몇진법?

	        br.close();

	        StringBuilder result = new StringBuilder();

	        while (N > 0) {
	            int remainder = N % B;
	            if (remainder < 10) {
	                result.append((char) (remainder + '0'));
	            } else {
	                result.append((char) (remainder - 10 + 'A'));
	            }
	            N /= B;
	        }

	        System.out.println(result.reverse().toString());
	    }

}
