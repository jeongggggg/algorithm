package baekjoon.step_by_step;

import java.util.Scanner;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;


/*
	10430. 나머지
	(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
	(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
*/

public class step_01_09 {
	
	
	// Scanner 사용
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
 
		in.close();
 
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );

	}
	
	
	// BufferedReader 사용 + StringTokenizer 클래스를 이용하여 분리해주는 방법
	/*
	public static void main(String[] args) throws IOException {
	        
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 		String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
	        
			System.out.println( (A+B)%C );
			System.out.println( (A%C + B%C)%C );
			System.out.println( (A*B)%C );
			System.out.println( (A%C * B%C)%C );
		
 
			// 굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 됨.
	 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
	        
			System.out.println( (A+B)%C );
			System.out.println( (A%C + B%C)%C );
			System.out.println( (A*B)%C );
			System.out.println( (A%C * B%C)%C );
		}
	}
	*/
	
	// BufferedReader 사용 + br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법
	/*
	 public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int C = Integer.parseInt(str[2]);
        
		System.out.println( (A+B)%C );
		System.out.println( (A%C + B%C)%C );
		System.out.println( (A*B)%C );
		System.out.println( (A%C * B%C)%C );
 
	}
	*/
	
	// BufferedReader + StringBuilder
	/*
		 public static void main(String[] args) throws IOException {
			     
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
	        
			StringBuilder sb = new StringBuilder();
	 
			sb.append( (A+B)%C );
			sb.append('\n');
	 
			sb.append( (A%C + B%C)%C );
			sb.append('\n');
	 
			sb.append( (A*B)%C );
			sb.append('\n');
	 
			sb.append( (A%C * B%C)%C );
	 
			System.out.println(sb);
	 
		}
	 */
	
	// BufferedReader + BufferedWriter
	
	/*
	 	public static void main(String[] args) throws IOException {
		     
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
	        
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
			bw.write( ((A+B)%C) + "\n" );
			bw.write( ((A%C + B%C)%C) + "\n" );
			bw.write( ((A*B)%C) + "\n" );
			bw.write( ((A%C * B%C)%C) + "\n" );
	 
			bw.flush();
			bw.close();
 
		} 
	*/
}
