package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/*
	1008. A/B
	�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/ 


public class step_01_05 {
	
	// BufferedReader ���
	 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        double A = Double.parseDouble(input[0]);
		double B = Double.parseDouble(input[1]);

        System.out.print(A/B);

        br.close();
    }
	 
	// Scanner ���
	 
//	 public static void main(String[] args) {
//		 
//			Scanner in=new Scanner(System.in);
//			
//			double a=in.nextDouble();
//			double b=in.nextDouble();
//			
//			in.close();
//			System.out.print(a/b);
//	 
//		}

}
