package baekjoon.category.stack;
import java.util.Scanner;

/*
    11478. 서로 다른 부분 문자열의 개수
    문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
    부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
    예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

    첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.

    첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.
*/
public class _11478 {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26]; // 소문자 알파벳 26개
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        System.out.println(countUniqueSubstrings(S));
    }

    public static int countUniqueSubstrings(String S) {
        TrieNode root = new TrieNode();
        int count = 0;

        // 모든 접미사에 대해 트라이에 삽입
        for (int i = 0; i < S.length(); i++) {
            TrieNode currentNode = root;
            for (int j = i; j < S.length(); j++) {
                int index = S.charAt(j) - 'a';
                if (currentNode.children[index] == null) {
                    currentNode.children[index] = new TrieNode();
                    count++; // 새로운 노드 생성 시 카운트 증가
                }
                currentNode = currentNode.children[index];
            }
        }

        return count;
    }
}
