package baekjoon.step_by_step;

import java.io.*;
import java.util.*;

//import java.util.Scanner;
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
//import java.io.IOException;

/*
	1008. A/B
	�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/ 

public class step_01_06 {
	
	//BufferedReader ���
	  public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  // ����

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);  //StringTokenizer���ڰ��� �Է� ���ڿ� ����
        int a = Integer.parseInt(st.nextToken());  //ù��° ȣ��
        int b = Integer.parseInt(st.nextToken());  //�ι�° ȣ��

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
	  
	//BufferedWriter ���
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
	  
	  
	 // Scanner ��� 
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
	  
	  
	  //StringBuilder ���
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
