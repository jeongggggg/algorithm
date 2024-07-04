package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	25304. ������
	���� : �ؿ��̴� ���� �ֿ� ��鼭 ó������ �ڽ�Ʈ�ڸ� �� �ô�. ���� ������. 
	�׷���, �� �� ������ �ʾҴµ� �����ϰ� ���� �ݾ��� ������ ���̴�! 
	�ؿ��̴� �������� ���鼭 ��Ȯ�ϰ� ���� ���� �´��� Ȯ���غ��� �Ѵ�.
	�������� ����,
	- ������ �� ������ ���ݰ� ����
	- ������ ���ǵ��� �� �ݾ�
	�� ����, ������ ������ ���ݰ� ������ ����� �� �ݾ��� �������� ���� �� �ݾװ� ��ġ�ϴ��� �˻��غ���.
	
	�Է� : ù° �ٿ��� �������� ���� �� �ݾ� X�� �־�����.
	��° �ٿ��� �������� ���� ������ ������ ������ �� N�� �־�����.
	���� N���� �ٿ��� �� ������ ���� a�� ���� b�� ������ ���̿� �ΰ� �־�����.
*/

public class step_03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // �������� ���� �� �ݾ�
        int N = sc.nextInt(); // ������ ��
        int total = 0;
        
        sc.close();

        for(int i = 0; i < N; i++){
            int a = sc.nextInt(); // �� ������ ����
            int b = sc.nextInt(); // �� ������ ����
            total += a * b;
        }
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

	}

}

class step_03_0_01 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int X = sc.nextInt(); // �������� ���� �� �ݾ�
			int N = sc.nextInt(); // ������ ��
			int total = 0;

			for(int i = 0; i < N; i++){
			    int a = sc.nextInt(); // �� ������ ����
			    int b = sc.nextInt(); // �� ������ ����
			    total += a * b;
			}
			if(total == X){
			    System.out.println("Yes");
			}else{
			    System.out.println("No");
			}
		}

	}

}

class step_03_0_02 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += a * b;
        }
        if (sum == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

class step_03_0_03 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            sum += a * b;
        }
        if (sum == X)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
