package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.*;
import java.util.*;
/*
 	2566.�ִ� 
 	<�׸� 1>�� ���� 9��9 �����ǿ� ������ 81���� �ڿ��� �Ǵ� 0�� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� �� �� ���� ��ġ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	���� ���, ������ ���� 81���� ���� �־����� �̵� �� �ִ��� 90�̰�, �� ���� 5�� 7���� ��ġ�Ѵ�.
	ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� ��ȩ ���� ���� �־�����. �־����� ���� 100���� ���� �ڿ��� �Ǵ� 0�̴�.
	ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� ��ġ�� �� ��ȣ�� �� ��ȣ�� ��ĭ�� ���̿� �ΰ� ���ʷ� ����Ѵ�. �ִ��� �� �� �̻��� ��� �� �� �� ���� ��ġ�� ����Ѵ�.

*/

public class step_07_02 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int i,j;
		int max = 0;
		int x = 1, y = 1;
		
		int arr[][] = new int[9][9];
		
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		sc.close();
		
		System.out.println(max);
		System.out.println(x+" "+y);
	}

}

class step_07_02_01 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;  //�ִ�
        int row = 1;  //��
        int column = 1;  //��

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j<= 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }

}
