package baekjoon.step_by_step;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


/*
	10430. ������
	(A+B)%C�� ((A%C) + (B%C))%C �� ������?
	(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
	�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

// Scanner ���
public class step_01_09 {
	
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
}
	

// BufferedReader ��� + StringTokenizer Ŭ������ �̿��Ͽ� �и����ִ� ���
class step_01_09_01 {
	
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
		
 
			// ���� String ���� ���� ���ϰ� �Է°� ���ÿ� �����ڷ� �и����൵ ��.
	 
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st1 = new StringTokenizer(br1.readLine()," ");
			int A1 = Integer.parseInt(st1.nextToken());
			int B1 = Integer.parseInt(st1.nextToken());
			int C1 = Integer.parseInt(st1.nextToken());
	        
			System.out.println( (A1+B1)%C1 );
			System.out.println( (A1%C1 + B1%C1)%C1 );
			System.out.println( (A1*B1)%C1 );
			System.out.println( (A1%C1 * B1%C1)%C1 );
	}
}

// BufferedReader ��� + br.readLine() �� ���� �о�� ���� split(" ") �Ͽ� ���� ������ ������ �� String �迭�� ���� �����ϴ� ���
class step_01_09_02 {
	
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
}

// BufferedReader + StringBuilder
class step_01_09_03 {
	
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
}

// BufferedReader + BufferedWriter
class step_01_09_04 {
	
	
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
}


