package baekjoon.category.Stack;
import java.util.ArrayList;
import java.util.Scanner;
/*
    10828. 스택
     정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
     명령은 총 다섯 가지이다.
    - push X: 정수 X를 스택에 넣는 연산이다.
    - pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    - size: 스택에 들어있는 정수의 개수를 출력한다.
    - empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    - top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
    주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
    문제에 나와있지 않은 명령이 주어지는 경우는 없다.

    출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
*/
public class _10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력을 처리할 Scanner 객체
        int N = scanner.nextInt(); // 명령의 수
        scanner.nextLine(); // 개행 문자 처리

        ArrayList<Integer> stack = new ArrayList<>(); // 스택으로 사용할 ArrayList
        StringBuilder output = new StringBuilder(); // 결과를 저장할 StringBuilder

        // N개의 명령어 처리
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine(); // 명령어 입력

            // push 명령어 처리
            if (command.startsWith("push")) {
                // "push X"에서 X 값을 추출하여 스택에 추가
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.add(value);
            }
            // pop 명령어 처리
            else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    output.append("-1\n"); // 스택이 비어있으면 -1 출력
                } else {
                    output.append(stack.remove(stack.size() - 1)).append("\n"); // 스택의 마지막 값을 제거하고 출력
                }
            }
            // size 명령어 처리
            else if (command.equals("size")) {
                output.append(stack.size()).append("\n"); // 스택의 크기를 출력
            }
            // empty 명령어 처리
            else if (command.equals("empty")) {
                output.append(stack.isEmpty() ? "1\n" : "0\n"); // 스택이 비어있으면 1, 아니면 0 출력
            }
            // top 명령어 처리
            else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    output.append("-1\n"); // 스택이 비어있으면 -1 출력
                } else {
                    output.append(stack.get(stack.size() - 1)).append("\n"); // 스택의 마지막 값을 출력
                }
            }
        }

        // 한꺼번에 결과 출력
        System.out.print(output);

        scanner.close(); // Scanner 객체 닫기
    }
}
