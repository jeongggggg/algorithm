package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	3009. 네 번째 점 
	세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

	세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
	
	직사각형의 네 번째 점의 좌표를 출력한다.
*/

/*
 	[알고리즘]
 	직사각형을 만들기 위해서는 4개의 좌표와 서로 다른 x 및 y 좌표를 필요로 한다.
	예를 들어 (2, 1), (4, 1), (2, 3), (4, 3) 이 있다.
	그럼 x좌표의 종류는 2, 4 이렇게 2개가 있고, y좌표 또한 1, 3 이렇게 2개가 구성되게 된다.
	즉, 3개의 좌표가 주어질 때, 나머지 하나 좌표를 찾기 위해서는 
	x 가 쌍을 이루지 않는 좌표가 나머지 좌표의 x좌표가 되고, y좌표 또한 쌍을 이루지 않는 y좌표가 나머지 좌표의 y가 될것이다.
	
	 
	
	결국 쌍을 이루지 않는 각각의 좌표만 찾으면 되는 것이다.
*/

// 각각의 좌표(coordinate)를 1차원 배열 3개에 각각 저장하고 각 입력받은 좌표에서 x 와 y 가 각각 겹치지 않는 좌표를 저장한 뒤 출력하는 방법
public class step_10_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int[] coord_1 = { in.nextInt(), in.nextInt() };	// 첫 번째 좌표
		int[] coord_2 = { in.nextInt(), in.nextInt() };	// 두 번째 좌표
		int[] coord_3 = { in.nextInt(), in.nextInt() };	// 세 번째 좌표
 
		
		in.close();
		
		int x;
		int y;
 
		// x 좌표 비교 후 쌍을 이루지 않는 x좌표를 저장
		// 1번 x좌표와 2번 x좌표 비교 
		if (coord_1[0] == coord_2[0]) {	
			x = coord_3[0];
		}
		// 1번 x좌표와 3번 x좌표 비교
		else if (coord_1[0] == coord_3[0]) {
			x = coord_2[0];
		}
		// 2번 x좌표와 3번 x좌표 비교
		else {
			x = coord_1[0];
		}
 
		// y 좌표 비교
		// 1번 y좌표와 2번 y좌표 비교
		if (coord_1[1] == coord_2[1]) {
			y = coord_3[1];
		}
		// 1번 y좌표와 3번 y좌표 비교
		else if (coord_1[1] == coord_3[1]) {
			y = coord_2[1];
		}
		// 2번 y좌표와 3번 y좌표 비교
		else {
			y = coord_1[1];
		}
		
		System.out.println(x + " " + y);
		

	}

}

// StringTokenizer 로 입력받고 int 형으로 타입을 변경하여 배열에 담는 방법
class step_10_03_01{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		int[] coord_1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine()," ");
		int[] coord_2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine()," ");
		int[] coord_3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
 
		
		
		int x;
		int y;
 
		// x 좌표 비교
		// 1번 x좌표와 2번 x좌표 비교
		if (coord_1[0] == coord_2[0]) {
			x = coord_3[0];
		}
		// 1번 x좌표와 3번 x좌표 비교
		else if (coord_1[0] == coord_3[0]) {
			x = coord_2[0];
		}
		// 2번 x좌표와 3번 x좌표 비교
		else {
			x = coord_1[0];
		}
 
		// y 좌표 비교
		// 1번 x좌표와 2번 x좌표 비교
		if (coord_1[1] == coord_2[1]) {
			y = coord_3[1];
		}
		// 1번 x좌표와 3번 x좌표 비교
		else if (coord_1[1] == coord_3[1]) {
			y = coord_2[1];
		}
		// 2번 x좌표와 3번 x좌표 비교
		else {
			y = coord_1[1];
		}
		
		System.out.println(x + " " + y);
		
 
	}
}

// br.readLine().split(" "); 을 통해 문자열 배열로 하여 equals 메소드로 비교를 하는 방법

class step_10_03_02{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] coord_1 = br.readLine().split(" ");
		String[] coord_2 = br.readLine().split(" ");
		String[] coord_3 = br.readLine().split(" ");
        
		String x;
		String y;
        
		// x 좌표 비교
		// 1번 x좌표와 2번 x좌표 비교
		if(coord_1[0].equals(coord_2[0])){
        	x = coord_3[0];
		}
        
		// 1번 x좌표와 3번 x좌표 비교
		else if (coord_1[0] == coord_3[0]) {
			x = coord_2[0];
		}
		// 2번 x좌표와 3번 x좌표 비교
		else {
			x = coord_1[0];
		}
  
		// y 좌표 비교
		// 1번 x좌표와 2번 x좌표 비교
		if (coord_1[1] == coord_2[1]) {
			y = coord_3[1];
		}
		// 1번 x좌표와 3번 x좌표 비교
		else if (coord_1[1] == coord_3[1]) {
			y = coord_2[1];
		}
		// 2번 x좌표와 3번 x좌표 비교
		else {
			y = coord_1[1];
		}
		
		System.out.println(x + " " + y);
	}
}
