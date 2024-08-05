package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/*
 	5073. 삼각형과 세 변
 	삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다..

	- Equilateral :  세 변의 길이가 모두 같은 경우
	- Isosceles : 두 변의 길이만 같은 경우
	- Scalene : 세 변의 길이가 모두 다른 경우
	단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
	
	세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
	
	각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다
	
	각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
*/

public class step_10_07 {

	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int[] sides = new int[3];
	        
	        while (true) {
	            // Read input and tokenize
	            StringTokenizer st = new StringTokenizer(br.readLine());
	            sides[0] = Integer.parseInt(st.nextToken());
	            sides[1] = Integer.parseInt(st.nextToken());
	            sides[2] = Integer.parseInt(st.nextToken());
	            
	            // Exit condition
	            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) break;
	            
	            // Sort the sides to facilitate triangle inequality check
	            Arrays.sort(sides);
	            
	            // Check if the sides form a valid triangle
	            if (sides[2] >= sides[0] + sides[1]) {
	                System.out.println("Invalid");
	            } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
	                System.out.println("Equilateral");
	            } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
	                System.out.println("Isosceles");
	            } else {
	                System.out.println("Scalene");
	            }
	        }
	    }

}
