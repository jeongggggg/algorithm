package baekjoon.step_by_step.step_05;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
	9086.문자열  
	문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
	
	입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 
	각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 
	문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
	
	각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
*/

/*
문자열을 나눌 수 있는 subString 함수는 2가지가 있는데

 

1. String substring(int index) : String의 index번째 값부터 끝까지 가져온다.   

 ex)

    String str = "abcdefgh"
	str.substring(3) > defgh

 

2. String substring(int beginIndex, int endIndex) : String의 beginIndex번째 값부터 (endIndex-1)번째 값까지 가져온다.   
 
 ex)
 
    String str = "abcdefgh"
    str.substring(3,6) > def

 

이를 이용해서 for문 안에서 문자열을 입력받았다.
한번에 출력하기 위해 String 배열 name[]을 선언한 다음,
첫번째 글자를 가져오기 위해 str.substring(0,1)
마지막 글자를 가져오기 위해 str.substring(str.length()-1, str.length())을 하였다.
*/

public class step_05_03 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			name[i] = str.substring(0,1)+ str.substring(str.length()-1,str.length());
		}
		
		sc.close();
		
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);
		}	
	}
}

class step_05_03_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String name[] = new String[n];
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			name[i] = str.substring(0,1)+str.substring(str.length()-1,str.length());	
		}
		br.close();
		for(int i=0;i<n;i++) {
			System.out.println(name[i]);	
		}
	}
}