package baekjoon.step_by_step.step_08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	2745. 진법 변환 
	B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
	10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 
	이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
	A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
	
	첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
	B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
	
	첫째 줄에 B진법 수 N을 10진법으로 출력한다.
*/

public class step_08_01 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        br.close();

        int tmp = 1;
        int sum = 0;

        for(int i = N.length()-1 ; i >= 0; i--){ // 여기서, 맨오른쪽 부터 계산!
            char C = N.charAt(i);
            
            if ('A' <= C && C<= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= B;
        }

        System.out.println(sum);
    }

}
