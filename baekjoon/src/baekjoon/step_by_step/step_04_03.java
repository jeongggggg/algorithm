package baekjoon.step_by_step;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	10818. �ּ�, �ִ�
	���� : N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� :ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
	��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
	��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
	
	��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
*/


// �迭 + Scanner
public class step_04_03 {

	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}

}

// �迭 + BufferedReader
// �ݵ�� �ڷ��� Ÿ�� Ȯ���� �ʿ�, st.nextToken() �� ���ڿ��� ��ȯ�ϴ� Integer.parseInt()�� int ������ ��ȯ
// �Է¹��� �������� �迭�� �����ϱ� ���ؼ� StringToken �� ����ִ� ��� ��ū���� ������ ������ �迭�� ��� ��´�.
//hasMoreTokens() �� StringTokenizer �� ��ū�� ���������� true, ��������� false�� ��ȯ
class step_04_03_01 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}
	
}

// �迭 + BufferedReader
/*
 * 1. �迭�� ������� �ʴ´�.
 * 2. �Է¹��� ���ڸ� ��� ���Ѵ�. ( �׷��� �ð����⵵�� N ���� ������ �ʿ� ���� �ð��� �����ų �� ���� )
*/
//  �񱳸� ���� max ���� ���� ���� ������, min ���� ���� ū ������ �ʱ�ȭ
// �ݺ������� �� ��ū�� ������ ���� max �� ������ ū��, ���� min �� ������ ������ ���ϸ鼭 ����
class step_04_03_02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());	//ù �� N �� �Ⱦ��̹Ƿ� �Է¸� �޴´�.
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
	}
	
}
