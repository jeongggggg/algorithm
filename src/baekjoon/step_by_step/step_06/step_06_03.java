package baekjoon.step_by_step.step_06;
import java.io.*;
import java.util.Scanner;

/*
	2444. 별 찍기 - 7
*/

// i가 1일 때, 스페이스가 4개가 있는 거를 볼 수 있음 -> j = 1부터 n - i까지인 for-loop을 만든다. 이 for-loop에서는 스페이스만 추가
// i = 1일 때, *이 1개, i = 2일 때, *이 3개 ->  2 × i - 1개 
// 새로운 이중 for-loop을 만들어 준다. 이번에는 i = n - 1부터 i가 1이 될 때까지

public class step_06_03 {
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

class step_06_03_01 {
	
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = 0;

			n = sc.nextInt();
			for(int i = 1; i <= n; i++) {

			    for(int j = 1; j <= n - i; j++ ) {
			        System.out.print(" ");
			    }
			    for(int j = 1; j <= i*2 -1; j++) {
			        System.out.print("*");
			    }
			    System.out.println("");
			}
			for(int i = 1; i <= n - 1 ; i++) {
			    for(int j = 1; j <= i; j++) {
			        System.out.print(" ");
			    }
			    for(int j = 1; j <= ((n - i) * 2 - 1); j++) {
			        System.out.print("*");
			    }
			    System.out.println("");
			}
		}
    }
}