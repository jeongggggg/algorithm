package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	1008. A/B
	두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
*/ 


// Scanner 사용
public class step_01_05 {
	
	 public static void main(String[] args) {
		 
		Scanner in=new Scanner(System.in);
		
		double a=in.nextDouble();
		double b=in.nextDouble();
		
		in.close();
		System.out.print(a/b);
 
	}
}

// BufferedReader 사용
class step_01_05_01 {
	
	 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        double A = Double.parseDouble(input[0]);
		double B = Double.parseDouble(input[1]);

        System.out.print(A/B);

        br.close();
    }
}