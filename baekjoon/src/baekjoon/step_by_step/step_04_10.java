package baekjoon.step_by_step;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
	1546. ��� 
	�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
	�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. 
	�׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
	�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	ù° �ٿ� ���� �� ������ ���� N�� �־�����. 
	�� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. 
	�� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
	
	ù° �ٿ� ���ο� ����� ����Ѵ�. 
	���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
*/

/*
 	�� ������ ��
	1. ������� ���/���� ������ 10-2, �� 0.01 ���� ����Ѵ�.
	2. �� ��° �ٿ� �־����� ���� ������ �������� �־�����.
	3. �Է¹��� ���� �ִ� M �� ����Ͽ� ��� ������ (����/M)*100 ���� ������ �� ���ο� ����� ���ؾ� �Ѵ�.
*/
public class step_04_10 {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		double arr[] = new double[in.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
		}
		in.close();
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}

class step_04_10_01 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		double arr[] = new double[Integer.parseInt(br.readLine())];
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}

class step_04_10_02 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine()); //�Է� ����
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1;
		double sum = 0.0;
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > max) {
				max = value;
			}
			
			sum += value;
		}
	
		System.out.println(((sum / max) * 100.0) / N);
		
	}
}
