package baekjoon.step_by_step;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
	2562. 최댓값
	문제 :9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 
	이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	
	입력 :첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
	
	출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/

/*  Scanner + 배열 O
   	입력 개수는 9개로 고정되어있으니 배열 선언과 함께 위와같이 바로 입력으로 초기화해주어도 무방
	또한 for-each 구문으로 배열의 원소를 하나씩 value 에 저장한 뒤 
	final_value 와 value 값을 비교하여 value 가 final_value 보다 크면 count 값과 value 값을 각각 저장한다.
*/
public class step_04_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = { in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt(),
				in.nextInt(), in.nextInt(), in.nextInt() };
		in.close();
		
		int count = 0;
		int max = 0;
		int index = 0;
        
		for(int value : arr) {
			count++;
            
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.print(max + "\n" + index);
		
	}

}

// 배열의 원소를 검사하지 않고 메소드를 이용
// Collections 클래스의 max() 메소드를 사용해야하는데, 주의할 점은 리스트 타입만 받는다는 것
// List 로 만든 뒤 Collections 클래스의 max 메소드를 통해 값을 저장한 뒤, 해당 값이 있는 index를 찾아 +1 (첫 번째 index 가 0 이므로)
class step_04_04_01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		List<Integer> list = Arrays.asList(in.nextInt(), in.nextInt(), in.nextInt(),
					in.nextInt(), in.nextInt(), in.nextInt(),
					in.nextInt(), in.nextInt(), in.nextInt());
 
		in.close();
 
		int val = Collections.max(list);
		int idx = list.indexOf(val) + 1;
 
		System.out.println(val);
		System.out.println(idx);
 
	}
	
}

// BufferedReader + 배열 O 
class step_04_04_02 {
	
public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
 
	}
	
}

// BufferedReader + 배열 X
class step_04_04_03 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int max = 0;
		int index = 0;
		for(int i = 0 ; i < 9 ; i++) {
 
			int val = Integer.parseInt(br.readLine());
			
			if(val > max) {
				max = val;
				index = i+1;
			}
		}
 
		System.out.println(max);
		System.out.println(index);
	}
	
}