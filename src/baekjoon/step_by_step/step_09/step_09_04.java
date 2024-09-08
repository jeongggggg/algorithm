package baekjoon.step_by_step.step_09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	1978. 소수 찾기 
	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	
	첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

	주어진 수들 중 소수의 개수를 출력한다.
*/

// 방법1) 소수는 1 과 자기 자신만을 약수로 갖기 때문에 2 부터 판별하려는 수 직전까지 하나씩 나눠보면서 나누어 떨어지는 수가 없다면 소수고, 나누어 떨어지는 수가 있다면 소수가 아닐 것
// 방법2) 합성수 Number = A × B 에서 A 와 B 중 적어도 하나는 Number 의 제곱근보다 작거나 같다. -> Number - 1 까지가 아닌 Number 의 제곱근 까지만 검사
// 방법3) 에라토스테네스의 체

// StringTokenizer 를 통해 문자열을 분리
// StringTokenizer 자체가 토큰이 남아있는지 여부를 true, false 로 반환시켜주는 hasMoreTokens() 라는 메소드를 갖고 있기 때문에 굳이 N 을 쓸 필요가 없기에 N 은 입력만 받고 따로 변수를 두지 않는다.
public class step_09_04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();	// N 은 쓰지 않음.	
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
        
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}

}
