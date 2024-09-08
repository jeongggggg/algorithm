package baekjoon.step_by_step.step_11;
import java.io.*;

/*
	24266. 알고리즘 수업 - 알고리즘의 수행 시간 5
	오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

	입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
	
	MenOfPassion 알고리즘은 다음과 같다.
	
	MenOfPassion(A[], n) {
	    sum <- 0;
	    for i <- 1 to n
	        for j <- 1 to n
	            for k <- 1 to n
	                sum <- sum + A[i] × A[j] × A[k]; # 코드1
	    return sum;
	    
	}
	    
    첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
    첫째 줄에 코드1 의 수행 횟수를 출력한다.
	둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
*/

public class step_11_06 {
	public static void main(String[] args) throws IOException {
        // 입력을 받을 BufferedReader와 출력을 할 BufferedWriter를 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 사용자로부터 입력받은 문자열을 long 타입으로 변환하여 변수 n에 저장
        long n = Long.parseLong(br.readLine());
        br.close(); // 입력이 끝났으므로 BufferedReader를 닫음

        // n^3의 값을 계산하여 출력, 그 다음 줄에 숫자 3을 출력
        bw.write(n * n * n + "\n" + 3 + "\n"); 
        bw.flush(); // 버퍼에 저장된 데이터를 실제 출력
        bw.close(); // 출력이 끝났으므로 BufferedWriter를 닫음
    }
}
