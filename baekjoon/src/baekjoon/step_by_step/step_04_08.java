package baekjoon.step_by_step;
import java.util.Scanner;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	3052. ������
	�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
	���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
	�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
	�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. 
	�� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
	
	ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
*/

// HashSet +Scanner
public class step_04_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//�Է¹��� ���� ������ ���� add�޼ҵ带 ���� HashSet�� ����
		}
        
		in.close();
		System.out.print(h.size());
	}

}

// HashSet + BufferedReader
class step_04_08_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();
 
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.print(h.size());
	}

}

// �迭 ���
class step_04_08_02 {

	public static void main(String[] args) throws IOException {
		
		 boolean[] arr = new boolean[42];
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        for(int i = 0 ; i < 10 ; i++) {
	            arr[Integer.parseInt(br.readLine()) % 42] = true;
	        }
	        
	        int count = 0;
	        for(boolean value : arr) {
	            if(value){    // value �� true ���
	                count++;
	            }
	        }
	        System.out.println(count);
	}

}