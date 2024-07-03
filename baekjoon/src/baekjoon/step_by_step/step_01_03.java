package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	1001. A-B
	�� ���� A�� B�� �Է¹��� ����, A-B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/ 

// Scanner ����
public class step_01_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(a - b);
        
        scan.close();
	}
}

//BufferedReader ����
class step_01_03_01 {
	
	 public static void main(String[] args) throws IOException{
	       
	      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	        
	      int a = Integer.parseInt(buf.readLine());
	      int b = Integer.parseInt(buf.readLine());
	        
	      System.out.println(a - b);
	}
}

