package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10951. A+B - 4
	�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
	
	�� ������ ��
	- �� ������ �������� ������ ���еȴ�.
	- �Է��� ����� ���̻� ���� �� �ִ� ������ (EOF) �� ���� �� �����Ѵ�.
	
	�� EOF ��?
	�� �������� ���� �߿��� ���� ���� ���� ������ ���� �׳� �Է��� �־����ٴ� ��.
	�� �Է¿��� ���̻��� ���� �� �ִ� �����Ͱ� �������� ���� �� �ݺ����� �����϶�� ���̴�.
	�̷��� �����Ͱ� ���̻� �������� ���� �� �츮�� EOF (End of File) ��, ������ ���̶� �Ѵ�.
*/

/*
  	�Է��� �ƿ� ������ �ʱ� ������ ���ܰ� �߻��ϴ� ���´� ���� ������
	hasNextInt(), hasNext() �� �� �ƹ��ų� �ᵵ ��������,
	�׷��� nextInt() �� ���� ������ �Է¹ް��� ������ 
	hasNextInt() �� ���ִ°� �ٸ� �ڵ��� ���� ������ �߻����� �ʴ´�.
	����� hasNextInt() �� ��� �Է°��� �����ϰ�� true�� ��ȯ�ϸ� 
	������ �ƴҰ�� �ٷ� ���ܸ� ������ ���̻��� �Է��� ���� �ʰ� hasNextInt()���� false�� ��ȯ�ϸ鼭
	�ݺ����� ����ȴ�.
*/
public class step_03_12 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(in.hasNextInt()){
		
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
		
		}	
		in.close();
	}

}

/*
	���ڿ� �и� �������
	1. StringTokenizer Ŭ������ �̿��Ͽ� �и����ִ� ���
	2. split() �� �̿��ϴ� ���
	�� ������, StringTokenizer �� Ư�� ��Ȳ�� �ƴϸ� ���ɸ鿡�� �ξ� �����
	�ݵ�� �ڷ��� Ÿ���� �� ���ƾ� �Ѵ�.
	st.nextToken() �� ���ڿ��� ��ȯ�ϴ� Integer.parseInt()�� int ������ ��ȯ�����ش�.
	 readLine() �� ���� �Է��� �Ͽ� str �� ����� �����Ͱ� null �� ��� 
	 while �ݺ����� ������ѹ����� �ƴҰ�� �ݺ����� ��� �����ϵ��� �Ѵ�.
*/

class step_03_12_01 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
}

/*
	������ ������ ������ �� ���ڸ��� ������ �Է¹������� ����("")�� ��ġ�� �׻� ������ ��ġ��� ���� �� �� �ִ�.
	��ü������ ���ϰ� ������ �ۼ��ϴ� ������δ� charAt() �� �ִ�.
*/
class step_03_12_02 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
 
		while( (str=br.readLine()) != null ){
		    
			int a = str.charAt(0) - 48;
			int b = str.charAt(2) - 48;
			sb.append(a+b).append("\n");
		
		}
		System.out.print(sb);
	}
}

// ���� : https://st-lab.tistory.com/40