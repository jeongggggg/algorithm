package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
 	11021. A+B - 7
 	�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

public class step_03_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int a = in.nextInt();
 
		for (int i = 1; i <= a; i++) {
			int c = in.nextInt();
			int d = in.nextInt();
 
			System.out.println("Case #" + i + ": " + (c + d));
		}
 
		in.close();

	}

}

// BufferedReader ���, ���ڿ� �и� StringTokenizer 
// �ݵ�� �ڷ��� Ÿ���� �� ���ƾ� ��. st.nextToken() �� ���ڿ��� ��ȯ�ϴ� Integer.parseInt()�� int ������ ��ȯ
class step_03_07_01 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			System.out.println("Case #" + i + ": " 
			+(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())));
		}
		br.close();
	}

}

// StringBuilder
class step_03_07_02 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
        
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())).append('\n');
			
			// sb.append("Case #"+ i + ": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n" );


		}
		br.close();
		System.out.println(sb);
	}

}

// BufferedWriter
/*
	BufferedWriter.write() �޼ҵ�� �ܵ����� int �� ���� ������� �̴� �ƽ�Ű �ڵ尪���� �νĵǱ� ������ �ٸ� ���ڰ� ���͹�����. 
	�׷��� �̸� �����ϰ� �ʹٸ� �ݵ�� ���ڿ��� int ���� �Բ� �־���� int ���� ����� ����� �� �ִ�.
*/ 
class step_03_07_03 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+i+": ");
			bw.write(Integer.parseInt(st.nextToken())
				+Integer.parseInt(st.nextToken())+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}

// �����ؼ� ���� ����
/*
 	A �� B �� "������" �� �ڸ����� �Է¹ޱ� ������ ���ڿ��� �Է¹����� ������ ���� ��ġ�� ������ �����Ǿ��ִ�.
	�׷� ���ڿ��� Ư�� ��ġ�� ���ڸ� ��ȯ���ִ� charAt() �� �� �� �ִٸ� 
	StringTokenizer ��ü�� ��� �������� �ʾƵ� �Ǳ⿡ �ð��� ���� ���� �� �� ���� ��
	
	�Ǽ� �� �� �ִ� �κ��� String.charAt() �� �ش� ��ġ�� ���ڸ� char �� ��ȯ�Ѵ�.
	�� ���� 0�̶�� ���ڿ��� ��ȯ�Ǹ� �ƽ�Ű �ڵ尪�� 48�� ��ȯ�ȴ�.
	�̸� int������ �����Ϸ��� �ϰų� ���� ����� �ƴ� ������ ����Ϸ� �ϸ� 0 �̶�� ���ڰ� �ƴ� 48�� ��µȴ�.
	�׷��� ���ε�� ���� '6' �� ���� 6 ���� �ٲٰ� �ʹٸ� 48�� ���ָ� �ȴ�.
	���� ���� ��������� �𸥴ٸ� -'0' ���� �ص� �ȴ�.
*/
class step_03_07_04 {

	public static void main(String args[]) throws IOException {
		 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
 
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
		}
		System.out.println(sb);
	}

}

// ���� : https://st-lab.tistory.com/33
