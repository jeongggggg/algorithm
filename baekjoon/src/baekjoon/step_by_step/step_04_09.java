package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	10811. �ٱ��� ������ 
	���� : �����̴� �ٱ��ϸ� �� N�� ������ �ְ�, 
	������ �ٱ��Ͽ��� 1������ N������ ��ȣ�� ������� ������ �ִ�. 
	�ٱ��ϴ� �Ϸķ� ������ �ְ�, ���� ���� �ٱ��ϸ� 1��° �ٱ���, 
	�� ���� �ٱ��ϸ� 2��° �ٱ���, ..., ���� ������ �ٱ��ϸ� N��° �ٱ��϶�� �θ���. 
	�����̴� ������ M�� �ٱ����� ������ �������� ������� �Ѵ�. 
	�����̴� �� �� ������ �������� �ٲ� ��, ������ �������� ���� ������ ���ϰ�, 
	�� ������ ����ִ� �ٱ����� ������ �������� �����.
	�ٱ����� ������ ��� �ٲ��� �־����� ��, 
	M�� �ٱ����� ������ �������� ���� ����, 
	�ٱ��Ͽ� �����ִ� ��ȣ�� ���� ���� �ٱ��Ϻ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է� : ù° �ٿ� N (1 �� N �� 100)�� M (1 �� M �� 100)�� �־�����.
	��° �ٺ��� M���� �ٿ��� �ٱ����� ������ �������� ����� ����� �־�����. 
	����� i j�� ��Ÿ����, �������κ��� i��° �ٱ��Ϻ��� j��° �ٱ����� ������ 
	�������� ����ٴ� ���̴�. (1 �� i �� j �� N)
	�����̴� �Է����� �־��� ������� �ٱ����� ������ �ٲ۴�.
	
	��� : ��� ������ �ٲ� ������, ���� ���ʿ� �ִ� �ٱ��Ϻ��� �ٱ��Ͽ� �����ִ� ������ �������� ������ ����Ѵ�.
*/

public class step_04_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // �迭�� 0���� �����ϱ� ������ arr[0]�� 1�� �ֱ� ���� 1�� ������
        }

        for (int i = 0; i < M; i++) { // M���� ��
            int left = sc.nextInt() - 1; // �迭 0���� ����
            int right = sc.nextInt() - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        sc.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}

class step_04_09_01 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // �迭�� 0���� �����ϱ� ������ arr[0]�� 1�� �ֱ� ���� 1�� ������
        }

        for (int i = 0; i < M; i++) { // M���� ��
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken()) - 1; // �迭 0���� ����
            int right = Integer.parseInt(st.nextToken()) - 1; // �迭 0���� ����

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        br.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}

class step_04_09_02 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n���� �ٱ���
		int count = sc.nextInt(); // ���� Ƚ��

		int temp=0;
		
		int busket[] = new int[n]; 
		for(int i=0;i<busket.length;i++) {
			busket[i] = i+1;	
		}
		
		for(int i=0;i<count;i++) { 
			int a = sc.nextInt()-1; //1 > 0��° �迭
			int b = sc.nextInt()-1; //5 > 4��° �迭
			
			while(a<b) { 
				temp = busket[a]; 
				busket[a] = busket[b]; 
				busket[b] = temp; 
				a++;	
				b--;	
			}
		}
		sc.close();
		
		for(int i=0;i<busket.length;i++) {
			System.out.print(busket[i]+" ");
		}	
	}
}

class step_04_09_03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer strtk = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(strtk.nextToken());
		int count = Integer.parseInt(strtk.nextToken()); 
		
		int temp = 0;
		
		int busket[] = new int[n];
		for(int i=0;i<busket.length;i++) {
			busket[i] = i+1;
		}
		
		for(int i=0;i<count;i++) {
			strtk = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(strtk.nextToken())-1;
			int b = Integer.parseInt(strtk.nextToken())-1;
			
			while(a<b) {
				temp = busket[a];
				busket[a] = busket[b];
				busket[b] = temp;
				a++;
				b--;
			}
		}
		
		br.close();
		
		for(int i=0;i<busket.length;i++) {
			System.out.print(busket[i]+" ");
		}
		
	}
}