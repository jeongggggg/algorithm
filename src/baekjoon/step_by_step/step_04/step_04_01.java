package baekjoon.step_by_step.step_04;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

/*
	10807. 개수 세기
	문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
	
	입력 : 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
	둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 
	입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
	
	출력 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
*/

public class step_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int count = 0;						 // b 와 일치할시 갯수를 올리는 변수
        int N = sc.nextInt();
        int[] arr = new int[N];				 // 배열 생성, 길이는 N만큼

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();			 // 배열에 입력한 정수들 넣어주기
        }
        int b = sc.nextInt();				 // [문제] 입력 세번째 줄 정수

        for(int j = 0; j < arr.length; j++){ // 배열 길이만큼 반복문 돌리면서 변수 b 와 같은
            if(b == arr[j]){				 // 숫자 찾기. 같으면 count 변수 1씩 증가
                count++;
            }
        }
        
        sc.close();
        System.out.println(count);

	}

}


/*
 * BufferedReader로 입력받고 StringTokenizer로 띄어쓰기(공백)까지 입력받아 주었다. 
 * 뒤에 , "  " 하지 않아도 자동으로 띄어쓰기를 기준으로 파싱
 * 
*/
class step_04_01_01 {

	 public static void main(String[] args) throws IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int N = Integer.parseInt(br.readLine());
	        int count = 0;
	        int[] arr = new int[N];

	        StringTokenizer st = new StringTokenizer(br.readLine());;

	        for(int i = 0; i < N; i++){
	            arr[i] = Integer.parseInt(st.nextToken());
	        }

	        int b = Integer.parseInt(br.readLine());

	        for(int j = 0; j < arr.length; j++){
	            if(b == arr[j]) {
	                count++;
	            }
	        }
	        System.out.println(count);

	        br.close();
	        bw.flush();
	        bw.close();
	    }

}