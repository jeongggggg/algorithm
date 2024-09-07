package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.*;
import java.util.*;
/*
 	2566.최댓값 
 	<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
	예를 들어, 다음과 같이 81개의 수가 주어지면 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
	첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
	첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.

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
        int max = 0;  //최댓값
        int row = 1;  //행
        int column = 1;  //열

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