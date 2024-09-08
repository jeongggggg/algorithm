package baekjoon.step_by_step.step_08;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	2869. 달팽이는 올라가고 싶다 
	땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
	달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
	달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
	
	첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
	
	첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
*/

// 낮에 올라가는 길이와 밤에 내려오는 길이를 단순히 빼서 나눗셈하면 안된다는 것
// up-down 의 차이 값보다 작은 나머지가 존재하면 다음날 up 때 올라가야하는 경우가 발생


/*
	즉 up 일 때 나머지 블럭이 남아있다면 하루가 더 소요된다는 것
	down 은 항상 up 보다 횟수가 하나 작다.
 	1. ( length - down ) % ( up - down ) 가 정확하게 0 으로 떨어지는 경우
	2. ( length - down ) % ( up - down ) 가 나머지가 남는 경우
	
	( 7 - 1 ) % ( 3 - 1 ) = 0
	( 8 - 1 ) % ( 3 - 1 ) = 1
*/
public class step_08_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int up = in.nextInt();		// A
		int down = in.nextInt();	// B
		int length = in.nextInt(); 	// C
 
		int day = (length - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((length - down) % (up - down) != 0) {
			day++;
		}
		
		in.close();
		System.out.println(day);

	}

}

class step_08_07_01{
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
 
		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
	}
}
