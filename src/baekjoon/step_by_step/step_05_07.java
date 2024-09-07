package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	2675. 문자열 반복 
	
	문제 : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		  즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
		  S에는 QR Code "alphanumeric" 문자만 들어있다.
		  QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
	
	입력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
		  각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
		  S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
	
	출력 : 각 테스트 케이스에 대해 P를 출력한다.
*/

// Scanner사용 
// 반드시 문자열 S 를 입력받을 때 Scanner.nextLine() 이 아닌 Scanner.next() 로 입력받아야 한다.
// nextLine() 으로 입력받으면 입력 과정에서 공백까지 읽어버리기 때문
public class step_05_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		in.close();
		
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = in.nextInt();
			String S = in.next();	// nextLine() 을 쓰면 error!
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}

	}

}

// BufferedReader
// BufferedReader.readLine() 은 한 줄을 통째로 읽기 때문에 split() 이나 StringTokenizer 로 숫자와 문자열 사이의 공백을 구분해주어야 한다.
// 분리된 문자의 첫번째는 int 형으로 변환해야하므로 Integer.parseInt() 를 사용하여 String 에서 int 형으로 변환
class step_05_07_01 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
	
			String[] str = br.readLine().split(" ");	// 공백 분리
			
			int R = Integer.parseInt(str[0]);	// String -> int
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

// 출력(System.out) 을 너무 자주 호출해주는 것 같으니 출력을 한 번만 호출하도록 변경
// 알고리즘을 간소화해보기 위해 charAt() 이 아닌 getBytes() 로 반환
class step_05_07_02 {

	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine());        
 
		for (int i = 0; i < T; i++) {
 
			String[] str = br.readLine().split(" ");
 
			int R = Integer.parseInt(str[0]);
 
			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					sb.append((char)val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}

}
