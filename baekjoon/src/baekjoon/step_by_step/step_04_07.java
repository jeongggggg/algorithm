package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
	5597.���� �� ���� ��..?
	X���� M�������� ���α׷��� ������ �ð� �ִ�. 
	���ǿ� �л��� 30���� �ִµ�, �л� ��ο� �� �л����� 1������ 30������ �⼮��ȣ�� �پ� �ִ�.
	�������� ���� Ư�������� 28���� �����ߴµ�, �� �߿��� ���� �� �� �л� 2���� �⼮��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : �Է��� �� 28�ٷ� �� ������(�л�)�� �⼮��ȣ n(1 �� n �� 30)�� �� �ٿ� �ϳ��� �־�����. �⼮��ȣ�� �ߺ��� ����.
		
	��� : ����� 2���̴�. 1��° �ٿ� �������� ���� �л��� �⼮��ȣ �� ���� ���� ���� ����ϰ�, 
	2��° �ٿ��� �� ���� �⼮��ȣ�� ����Ѵ�..
*/


public class step_04_07 {

	 public static void main(String[] args) throws IOException { // Null ���� ó��
	        
	    	Scanner in = new Scanner(System.in); // ��ĳ�� ó��
	    	
	    	int[] arr = new int[31]; // �迭 31�� �ڸ�����
	    	
	    	int A; // ���� A ����
	    	
	    	for(int i=1; i<29; i++) { // i�� 29 ������ �ݺ� 
	    		A = in.nextInt(); //  A�� �� ����
	    		arr[A] = 1;  // arr[�������ȣ] = 1 �� ��
	    	}
	    	
	    	for(int i=1; i<arr.length; i++) { // i �� arr[����� ��] ��ŭ �ݺ���
	    		if(arr[i] != 1) { // ���� arr[������� ��ȣ��] = 1 �ƴϸ� �ȳ������
	    			System.out.println(i); // �ȳ��� �� ��ȣ�� �����
	    		}
	    	}
	    	in.close(); // ��ĳ�� ����
	    	
	    }

}

class step_04_07_01 {

    public static void main(String[] args) throws IOException { // Null ���� ó��
        
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ���� ����
    	
    	boolean[] arr = new boolean[31]; // 0���� �����ϱ� 1~30������ �������� ������ 31 �� �ʿ���
    	
    	for(int i=0; i<28; i++) { // ���� i �� 0~28�� �̸��̹Ƿ� �� 28���� �ݺ���. �׷� 2�� ȣ�Ⱑ��
    		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ���� �� " " ���ٳ���
    		int A = Integer.parseInt(st.nextToken()); // ���� A�� ��� �л���ȣ�� ����   	 	
	    	arr[A] = true; // arr[�л���ȣ]�� true�� �־���
    	}
    	
    	for(int i=1; i<arr.length; i++) { // i�� 1������ ������ 0�� �л��� ����
    		if(arr[i] != true) { // arr[�л� ��ȣ] �� true�� �ƴϸ� ���� ���� �л���
    			System.out.println(i); // ���� ���� �л��� ��ȣ�� ȣ��
    		}

    	}
    	br.close(); // ��������
    	
    }

}