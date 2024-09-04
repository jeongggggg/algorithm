package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
	11022. A+B - 8
	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
	x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
*/

public class step_03_08 {

	public static void main(String args[]) {
		 
		Scanner in = new Scanner(System.in);
 
		int T = in.nextInt();
 
		for (int i = 1; i <= T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
 
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
 
		in.close();
	}

}

// BufferedReader 사용, 문자열 분리 StringTokenizer 
// 추가 설명은 step_03_07 과 같음
class step_03_08_01 {
	
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
        
		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
		br.close();
	}
	
}


// 위 코드를 StringBuilder 변경하여 사용
class step_03_08_02 {
	
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
            
			sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A+B)).append('\n');
			// sb.append("Case #"+ i + ": " + A + " + " + B + " = " + (A+B) +  "\n" );
		}
		br.close();
		System.out.println(sb);
	}
	
}

// BufferedWriter 
class step_03_08_03 {
	
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
 
		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
 
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
            
			bw.write("Case #"+i+": ");
			bw.write(A + " + " + B + " = ");
			bw.write((A+B) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
}

// 추가 개선 코드 
class step_03_08_04 {
	
	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= T; i++) {
			String str = br.readLine();
			int A = str.charAt(0)-'0';
			int B = str.charAt(2)-'0';
			sb.append("Case #").append(i).append(": ").append(A)
			.append(" + ").append(B).append(" = ").append(A+B).append('\n');
		}
		System.out.println(sb);
	}
	
}