package baekjoon.step_by_step;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	10811. 바구니 뒤집기 
	문제 : 도현이는 바구니를 총 N개 가지고 있고, 
	각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 
	바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 
	그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 
	도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 
	도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 
	그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
	바구니의 순서를 어떻게 바꿀지 주어졌을 때, 
	M번 바구니의 순서를 역순으로 만든 다음, 
	바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
	
	입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
	둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 
	방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 
	역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
	도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
	
	출력 : 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
*/

public class step_04_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 배열은 0부터 시작하기 문에 arr[0]에 1을 넣기 위해 1을 더해줌
        }

        for (int i = 0; i < M; i++) { // M개의 줄
            int left = sc.nextInt() - 1; // 배열 0부터 시작
            int right = sc.nextInt() - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        sc.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}

class step_04_09_01 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 배열은 0부터 시작하기 문에 arr[0]에 1을 넣기 위해 1을 더해줌
        }

        for (int i = 0; i < M; i++) { // M개의 줄
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken()) - 1; // 배열 0부터 시작
            int right = Integer.parseInt(st.nextToken()) - 1; // 배열 0부터 시작

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        br.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}

class step_04_09_02 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n개의 바구니
		int count = sc.nextInt(); // 시행 횟수

		int temp=0;
		
		int busket[] = new int[n]; 
		for(int i=0;i<busket.length;i++) {
			busket[i] = i+1;	
		}
		
		for(int i=0;i<count;i++) { 
			int a = sc.nextInt()-1; //1 > 0번째 배열
			int b = sc.nextInt()-1; //5 > 4번째 배열
			
			while(a<b) { 
				temp = busket[a]; 
				busket[a] = busket[b]; 
				busket[b] = temp; 
				a++;	
				b--;	
			}
		}
		sc.close();
		
		for(int i=0;i<busket.length;i++) {
			System.out.print(busket[i]+" ");
		}	
	}
}

class step_04_09_03 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer strtk = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(strtk.nextToken());
		int count = Integer.parseInt(strtk.nextToken()); 
		
		int temp = 0;
		
		int busket[] = new int[n];
		for(int i=0;i<busket.length;i++) {
			busket[i] = i+1;
		}
		
		for(int i=0;i<count;i++) {
			strtk = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(strtk.nextToken())-1;
			int b = Integer.parseInt(strtk.nextToken())-1;
			
			while(a<b) {
				temp = busket[a];
				busket[a] = busket[b];
				busket[b] = temp;
				a++;
				b--;
			}
		}
		
		br.close();
		
		for(int i=0;i<busket.length;i++) {
			System.out.print(busket[i]+" ");
		}
		
	}
}