package baekjoon.step_by_step;

import java.io.*;
import java.util.*;

//import java.util.Scanner;
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
//import java.io.IOException;

/*
	1008. A/B
	두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
*/ 

public class step_01_06 {
	
	//BufferedReader 사용
	  public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  // 선언

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);  //StringTokenizer인자값에 입력 문자열 넣음
        int a = Integer.parseInt(st.nextToken());  //첫번째 호출
        int b = Integer.parseInt(st.nextToken());  //두번째 호출

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
	  
	//BufferedWriter 사용
	 /*
		   public static void main(String[] args) throws IOException {
				Scanner in = new Scanner(System.in);
				int A = in.nextInt();
				int B = in.nextInt();
		 
				in.close();
		 
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
				bw.write((A+B) + "\n");
				bw.write((A-B) + "\n");
				bw.write((A*B) + "\n");
				bw.write((A/B) + "\n");
				bw.write((A%B) + "\n");
		 
				bw.flush();
				bw.close();
			} 
		*/
	  
	  
	 // Scanner 사용 
	/*  
	 	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int a = input.nextInt(); 
			int b = input.nextInt(); 
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}
	*/
	  
	  
	  //StringBuilder 사용
	  /* public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int A = in.nextInt();
			int B = in.nextInt();
	 
			in.close();
	 
			StringBuilder sb = new StringBuilder();
			sb.append(A+B);
			sb.append('\n');
	 
			sb.append(A-B);
			sb.append('\n');
	 
			sb.append(A*B);
			sb.append('\n');
	 
			sb.append(A/B);
			sb.append('\n');
	 
			sb.append(A%B);
	 
			System.out.print(sb);
		}
		*/
}
