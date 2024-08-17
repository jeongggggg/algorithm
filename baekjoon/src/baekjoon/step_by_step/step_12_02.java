package baekjoon.step_by_step;
import java.util.Scanner;

/*
 	2231. 분해합
 	어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
 	어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
 	예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 
 	물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
	자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
	
	첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
	
	첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 */

public class step_12_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 자연수 N 입력받기
        int result = 0; // 생성자가 없을 경우 기본값 0으로 초기화
        
        // 1부터 N-1까지의 수를 확인
        for (int i = 1; i < N; i++) {
            int sum = i; // 현재 수 i를 sum에 저장
            int temp = i;
            
            // 각 자리수의 합을 구해서 sum에 더하기
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            // 분해합이 N과 같으면, 가장 작은 생성자를 찾은 것
            if (sum == N) {
                result = i;
                break;
            }
        }
        
        System.out.println(result);
        sc.close();
    }

}
