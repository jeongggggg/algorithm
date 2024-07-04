package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	15552. ���� A+B
	���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. 
	����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
	C++�� ����ϰ� �ְ� cin/cout�� ����ϰ��� �Ѵٸ�, 
	cin.tie(NULL)�� sync_with_stdio(false)�� �� �� ������ �ְ�, endl ��� ���๮��(\n)�� ����. 
	��, �̷��� �ϸ� �� �̻� scanf/printf/puts/getchar/putchar �� C�� ����� ����� ����ϸ� �� �ȴ�.
	Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
	BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
	Python�� ����ϰ� �ִٸ�, input ��� sys.stdin.readline�� ����� �� �ִ�. 
	��, �̶��� �� ���� ���๮�ڱ��� ���� �Է¹ޱ� ������ ���ڿ��� �����ϰ� ���� ��� .rstrip()�� �߰��� �� �ִ� ���� ����.
	���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. 
	�׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.
	
	ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. 
	T�� �ִ� 1,000,000�̴�. 
	���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
*/

// BufferedWriter ���
public class step_03_06 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();
 
		System.out.println(sb);
 
	}

}

// �ð��ʰ� �ڵ�
class step_03_06_01 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
        
		for (int j = 0; j < N; j++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}
	}

}

// StringBuilder ���
class step_03_06_02 {

	public static void main(String[] args) throws Exception {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {		
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));		
			sb.append(result+"\n");
		}
		
		br.close();
		System.out.print(sb);
    }

}
