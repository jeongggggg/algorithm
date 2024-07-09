package baekjoon.step_by_step;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
	5597.과제 안 내신 분..?
	X대학 M교수님은 프로그래밍 수업을 맡고 있다. 
	교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
	교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
	
	입력 : 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
		
	출력 : 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 
	2번째 줄에선 그 다음 출석번호를 출력한다..
*/


public class step_04_07 {

	 public static void main(String[] args) throws IOException { // Null 예외 처리
	        
	    	Scanner in = new Scanner(System.in); // 스캐너 처리
	    	
	    	int[] arr = new int[31]; // 배열 31개 자리까지
	    	
	    	int A; // 변수 A 선언
	    	
	    	for(int i=1; i<29; i++) { // i가 29 전까지 반복 
	    		A = in.nextInt(); //  A을 값 받음
	    		arr[A] = 1;  // arr[낸사람번호] = 1 로 함
	    	}
	    	
	    	for(int i=1; i<arr.length; i++) { // i 가 arr[낸사람 수] 만큼 반복함
	    		if(arr[i] != 1) { // 만약 arr[낸사람이 번호가] = 1 아니면 안낸사람임
	    			System.out.println(i); // 안냈을 때 번호를 출력함
	    		}
	    	}
	    	in.close(); // 스캐너 종료
	    	
	    }

}

class step_04_07_01 {

    public static void main(String[] args) throws IOException { // Null 예외 처리
        
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 선언
    	
    	boolean[] arr = new boolean[31]; // 0번은 없으니까 1~30번까지 있으려면 공간이 31 개 필요함
    	
    	for(int i=0; i<28; i++) { // 변수 i 는 0~28번 미만이므로 총 28번을 반복함. 그럼 2개 호출가능
    		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 개행 및 " " 마다나눔
    		int A = Integer.parseInt(st.nextToken()); // 변수 A에 계속 학생번호를 받음   	 	
	    	arr[A] = true; // arr[학생번호]를 true로 넣어줌
    	}
    	
    	for(int i=1; i<arr.length; i++) { // i가 1부터인 이유는 0번 학생은 없음
    		if(arr[i] != true) { // arr[학생 번호] 가 true가 아니면 과제 안한 학생임
    			System.out.println(i); // 과제 안한 학생의 번호를 호출
    		}

    	}
    	br.close(); // 버퍼종료
    	
    }

}