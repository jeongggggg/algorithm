package baekjoon.step_by_step.step_11;
import java.util.Scanner;
/*
	24262. 알고리즘 수업 - 알고리즘의 수행 시간1
	오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
	입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.
	MenOfPassion 알고리즘은 다음과 같다.
	
	MenOfPassion(A[], n) {
	    i = [n / 2];
	    return A[i]; # 코드1
	}
	
	첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.
	
	첫째 줄에 코드1 의 수행 횟수를 출력한다.
	둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
	
	
*/
public class step_11_01 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        
	        // 수행 시간 함수는 상수 시간이므로 1을 출력합
	        System.out.println(1);
	        // 수행 시간 함수의 최고차항의 차수는 0 (상수 시간).
	        System.out.println(0);
	    }

}
