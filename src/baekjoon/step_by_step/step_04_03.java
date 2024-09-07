package baekjoon.step_by_step;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10818. 최소, 최대
	문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	
	입력 :첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
	둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
	모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
	
	출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/


// 배열 + Scanner
public class step_04_03 {

	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}

}

// 배열 + BufferedReader
// 반드시 자료형 타입 확인이 필요, st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환
// 입력받은 정수들을 배열에 저장하기 위해서 StringToken 에 들어있는 모든 토큰들이 없어질 때까지 배열에 모두 담는다.
//hasMoreTokens() 는 StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false를 반환
class step_04_03_01 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}
	
}

// 배열 + BufferedReader
/*
 * 1. 배열을 사용하지 않는다.
 * 2. 입력받은 문자를 즉시 비교한다. ( 그러면 시간복잡도가 N 으로 정렬할 필요 없어 시간을 단축시킬 수 있음 )
*/
//  비교를 위해 max 에는 가장 작은 값으로, min 에는 가장 큰 값으로 초기화
// 반복문에서 각 토큰을 가져와 기존 max 의 값보다 큰지, 기존 min 의 값보다 작은지 비교하면서 수행
class step_04_03_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
	}
	
}