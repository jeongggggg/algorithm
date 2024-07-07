package baekjoon.step_by_step;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	2562. �ִ�
	���� :9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	���� ���, ���� �ٸ� 9���� �ڿ��� 3, 29, 38, 12, 57, 74, 40, 85, 61 �� �־�����, 
	�̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
	
	�Է� :ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
	
	��� : ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
*/

/*  Scanner + �迭 O
   	�Է� ������ 9���� �����Ǿ������� �迭 ����� �Բ� ���Ͱ��� �ٷ� �Է����� �ʱ�ȭ���־ ����
	���� for-each �������� �迭�� ���Ҹ� �ϳ��� value �� ������ �� 
	final_value �� value ���� ���Ͽ� value �� final_value ���� ũ�� count ���� value ���� ���� �����Ѵ�.
*/
public class step_04_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		in.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
	}

}

// �迭�� ���Ҹ� �˻����� �ʰ� �޼ҵ带 �̿�
// Collections Ŭ������ max() �޼ҵ带 ����ؾ��ϴµ�, ������ ���� ����Ʈ Ÿ�Ը� �޴´ٴ� ��
// List �� ���� �� Collections Ŭ������ max �޼ҵ带 ���� ���� ������ ��, �ش� ���� �ִ� index�� ã�� +1 (ù ��° index �� 0 �̹Ƿ�)
class step_04_04_01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		List<Integer> list = Arrays.asList(in.nextInt(), in.nextInt(), in.nextInt(),
					in.nextInt(), in.nextInt(), in.nextInt(),
					in.nextInt(), in.nextInt(), in.nextInt());
 
		in.close();
 
		int val = Collections.max(list);
		int idx = list.indexOf(val) + 1;
 
		System.out.println(val);
		System.out.println(idx);
 
	}
	
}

// BufferedReader + �迭 O 
class step_04_04_02 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
 
	}
	
}

// BufferedReader + �迭 X
class step_04_04_03 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int max = 0;
		int index = 0;
		for(int i = 0 ; i < 9 ; i++) {
 
			int val = Integer.parseInt(br.readLine());
			
			if(val > max) {
				max = val;
				index = i+1;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
	}
	
}
