package baekjoon.step_by_step.step_10;
import java.io.*;
/*
	10101. 삼각형 외우기
	
	창영이는 삼각형의 종류를 잘 구분하지 못한다. 따라서 프로그램을 이용해 이를 외우려고 한다.
	삼각형의 세 각을 입력받은 다음, 
	
	- 세 각의 크기가 모두 60이면, Equilateral
	- 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
	- 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
	- 세 각의 합이 180이 아닌 경우에는 Error
	
	를 출력하는 프로그램을 작성하시오.
	
	총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 모든 정수는 0보다 크고, 180보다 작다.
	
	문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.
*/
public class step_10_06 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 세 각도를 입력받음
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        // 세 각도의 합이 180이 아닌 경우 "Error" 출력
        if (a + b + c != 180) {
            System.out.print("Error");
        } else {
            // 세 각도가 모두 60인 경우 "Equilateral" 출력
            if (a == 60 && b == 60 && c == 60) {
                System.out.print("Equilateral");
            } 
            // 두 각도가 같은 경우 "Isosceles" 출력
            else if (a == b || b == c || c == a) {
                System.out.print("Isosceles");
            } 
            // 위의 조건에 해당하지 않으면 "Scalene" 출력
            else {
                System.out.print("Scalene");
            }
        }
    }

}
