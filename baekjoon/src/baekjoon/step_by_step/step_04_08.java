package baekjoon.step_by_step;
import java.util.Scanner;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	3052. 나머지
	두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
	예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
	수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
	그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	
	첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 
	이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
	
	첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
*/

// HashSet +Scanner
public class step_04_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
        
		in.close();
		System.out.print(h.size());
	}

}

// HashSet + BufferedReader
class step_04_08_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
 
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.print(h.size());
	}

}

// 배열 사용
class step_04_08_02 {

	public static void main(String[] args) throws IOException {
		
		 boolean[] arr = new boolean[42];
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        for(int i = 0 ; i < 10 ; i++) {
	            arr[Integer.parseInt(br.readLine()) % 42] = true;
	        }
	        
	        int count = 0;
	        for(boolean value : arr) {
	            if(value){    // value 가 true 라면
	                count++;
	            }
	        }
	        System.out.println(count);
	}

}