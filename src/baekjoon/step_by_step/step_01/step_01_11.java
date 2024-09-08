package baekjoon.step_by_step.step_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.io.*;
import java.util.StringTokenizer;

/*
	11382. 꼬마 정민
	꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
	첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.
*/

public class step_01_11 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        sc.close();

        System.out.println(a+b+c);

	}
}

//BufferedReader 사용
class step_01_11_01 {
	
	 public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = bfr.readLine();
        st = new StringTokenizer(str, " ");
        long sum = 0;

        for(int i = 0; i < 3; i++) {
            sum += Long.parseLong(st.nextToken());
        }

        bfw.write(String.valueOf(sum));

        bfr.close();
        bfw.flush();
        bfw.close();
    }
}