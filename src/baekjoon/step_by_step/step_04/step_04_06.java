package baekjoon.step_by_step.step_04;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

/*
	10813.공바꾸기
	도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
	바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
	도현이는 앞으로 M번 공을 바꾸려고 한다. 
	도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
	공을 어떻게 바꿀지가 주어졌을 때, 
	M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
	
	입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
	둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 
	각 방법은 두 정수 i j로 이루어져 있으며, 
	i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
	도현이는 입력으로 주어진 순서대로 공을 교환한다.
	
	출력 : 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
*/

/*
	1. 첫째 줄에 N과 M 이 주어진다. 
	2. 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법을 주어짐, i, j 로 입력받음
	3. i 번 바구니와 j 번 바구니에 들어있는 공을 서로 교환한다.
	4. 두개의 값이 들어올 때마다 배열에 들고 있는 값들을 교환시킨다.
*/
public class step_04_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.close();

        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        int temp;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;                     // 배열의 index 는 0 부터 시작 [0,1,2,3,4,5]
        }                                       // 첫번째는 0 이지만 첫번째 바구니 이기때문에 1부터 시작이니 +1 해줌
        for(int j = 0; j < M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        for(int k = 0; k <arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

	}
}

class step_04_06_01 {

	 public static void main(String[] args) throws IOException{

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        int arr[] = new int[N];
	        int M = Integer.parseInt(st.nextToken());
	        int temp;

	        for(int i = 0; i < arr.length; i++) {
	            arr[i] = i + 1;                     // 배열의 index 는 0 부터 시작 [0,1,2,3,4,5]
	        }                                       // 첫번째는 0 이지만 첫번째 바구니 이기때문에 1부터 시작이니 +1 해줌
	        for(int j = 0; j < M; j++) {
	            st = new StringTokenizer(br.readLine());

	            int I = Integer.parseInt(st.nextToken());
	            int J = Integer.parseInt(st.nextToken());

	            temp = arr[I-1];
	            arr[I-1] = arr[J-1];
	            arr[J-1] = temp;
	        }
	        for(int k = 0; k <arr.length; k++) {
	            bw.write(arr[k] + " ");
	        }
	        br.close();
	        bw.flush();
	        bw.close();
	 }
}