package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

/*
	10807. ���� ����
	���� : �� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : ù° �ٿ� ������ ���� N(1 �� N �� 100)�� �־�����. 
	��° �ٿ��� ������ �������� ���еǾ����ִ�. ��° �ٿ��� ã������ �ϴ� ���� v�� �־�����. 
	�Է����� �־����� ������ v�� -100���� ũ�ų� ������, 100���� �۰ų� ����.
	
	��� : ù° �ٿ� �Է����� �־��� N���� ���� �߿� v�� �� ������ ����Ѵ�.
*/

public class step_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int count = 0;						 // b �� ��ġ�ҽ� ������ �ø��� ����
        int N = sc.nextInt();
        int[] arr = new int[N];				 // �迭 ����, ���̴� N��ŭ

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();			 // �迭�� �Է��� ������ �־��ֱ�
        }
        int b = sc.nextInt();				 // [����] �Է� ����° �� ����

        for(int j = 0; j < arr.length; j++){ // �迭 ���̸�ŭ �ݺ��� �����鼭 ���� b �� ����
            if(b == arr[j]){				 // ���� ã��. ������ count ���� 1�� ����
                count++;
            }
        }
        
        sc.close();
        System.out.println(count);

	}

}


// BufferedReader�� �Է¹ް� StringTokenizer�� ����(����)���� �Է¹޾� �־���. �ڿ� , "  " ���� �ʾƵ� �ڵ����� ���⸦ �������� �Ľ�
class step_04_01_01 {

	 public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int N = Integer.parseInt(br.readLine());
	        int count = 0;
	        int[] arr = new int[N];

	        StringTokenizer st = new StringTokenizer(br.readLine());;

	        for(int i = 0; i < N; i++){
	            arr[i] = Integer.parseInt(st.nextToken());
	        }

	        int b = Integer.parseInt(br.readLine());

	        for(int j = 0; j < arr.length; j++){
	            if(b == arr[j]) {
	                count++;
	            }
	        }
	        System.out.println(count);

	        br.close();
	        bw.flush();
	        bw.close();
	    }

}
