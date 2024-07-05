package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10952. A+B - 5
	�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
	�Է��� ���������� 0 �� ���� ���´�.
*/


// while ( true ) �� ���� �ݺ� �ϸ鼭 ���� A �� B �� �� �� 0 �ϰ�� break; �� ���� �ݺ����� �������ְ�, �ƴҰ�� �Է¹��� A �� B �� �����ش�.
public class step_03_11 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
				
		while(true){
		
			int A=in.nextInt();
			int B=in.nextInt();
		
			if(A==0 && B==0){
				in.close();
				break;
			}
			System.out.println(A+B);
		}

	}

}

/*
 * BufferedReader.readLine() �� ���� �Է� �ް� �Ǵµ�, 
 * �̴� ���ڿ� �� ���� �� ���� �Է¹ޱ� ������ ������� �ԷµǾ������. 
 * �׷��� ������ ������ �������� ���ڿ��� �и����־�� �Ѵ�.
 * 
 * ���ڿ� �и� �������
 * String.split() �� ���� �и����ִ� ���, 
 * StringTokenizer �� �и��Ǿ� �����ϸ鼭 �������� ����� �ִ�
 * 
 * StringTokenizer �� ���� ���ڿ� �и��� �� �������� �޼ҵ�, 
 * st.nextToken() �� ���ڿ��� ��ȯ�ϴ� Integer.parseInt()�� int ������ ��ȯ�����־�� �Ѵ�
 * 
*/
class step_03_11_01 {
	
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
	
}

/*
 * �Է¹���� �� �ڸ� ���̴� ������ ��ġ�� �����̶�� ���� �̿��Ͽ� Ǯ ���� �ִ�.
 * ���� StringTokenizer �� ��� �������� �ʿ� ������ ���� ���鿡�� �� �� ������ ���� ��
 * 
*/
class step_03_11_02 {
	
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = br.readLine();
			
			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;
            
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
	
}
