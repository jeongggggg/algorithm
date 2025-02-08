package baekjoon.step_by_step.step_16;
import java.io.*;
import java.util.*;

/* 28279. 덱 2
    문제
    정수를 저장하는 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
    명령은 총 여덟 가지이다.
    1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
    2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
    3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    5: 덱에 들어있는 정수의 개수를 출력한다.
    6: 덱이 비어있으면 1, 아니면 0을 출력한다.
    7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.

    입력
    첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
    둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
    출력을 요구하는 명령은 하나 이상 주어진다.

    출력
    출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
 */
public class step_16_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine()); // 명령 개수

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case 1: // 앞에 추가
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2: // 뒤에 추가
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3: // 앞에서 제거 후 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case 4: // 뒤에서 제거 후 출력
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case 5: // 크기 출력
                    sb.append(deque.size()).append("\n");
                    break;
                case 6: // 비어있는지 확인
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7: // 앞 요소 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case 8: // 뒤 요소 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}
