package baekjoon.step_by_step;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	1152.�ܾ��� ����
	���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
	�� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
	
	ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. 
	�� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, 
	������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
*/

//Scanner + StringTokenizer
public class step_05_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String S = in.nextLine();
		in.close();
 
		// st �� ������ �������� ���� ��ū���� st �� �����Ѵ�
		StringTokenizer st = new StringTokenizer(S," ");
		
		// countTokens() �� ��ū�� ������ ��ȯ�Ѵ�
		System.out.println(st.countTokens());	
		
	}

}


// BufferedReader  + StringTokenizer
class step_05_08_01 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		System.out.print(st.countTokens());
	}
}
