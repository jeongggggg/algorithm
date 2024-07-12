package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	2908.���
	������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
	�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
	����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
	����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, 
	����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
	�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. 
	�� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
*/


// Scanner + StringBuilder.reverse();
public class step_05_09 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
        // StringBuilder ������ ���ÿ� append() ��� �޼ҵ忡 ���� �־���
        // append() �� �־��� ���� Ÿ���� StringBuilder �� ��ȯ
        // ����� ���� reverse() ��� �޼ҵ带 ���� ����Ǿ��ִ� ���ڿ��� ����
        // StringBuilder Ÿ���� ���ڿ��� ��ȯ��Ű�� ���� toString() 
        // Integer.parseInt() �� String �� int �� Ÿ���� ����
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		//  A �� B �� ū ���� ���
		System.out.print(A > B ? A : B);
	
	}

}

// BufferedReader + StringTokenizer ( split() �� ��� ����)
// ��ü�� ������ �� ���ڿ� ���ڸ� �ٷ� �־��� �� �ִٴ� ���� �� �ڵ�� �ٸ���.
class step_05_09_01{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		// Scanner �� ������� ���� int Ÿ������ �޾ұ� ������ ��ü�� ������ �� append() �޼ҵ带 ��������� 
		// ���� �־��ַ��� ���ڰ� String Ÿ���̸� append() �� ����� �ʿ䰡 ����.
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A:B);
	}
}
