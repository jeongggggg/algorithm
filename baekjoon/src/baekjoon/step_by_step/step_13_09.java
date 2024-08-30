package baekjoon.step_by_step;
import java.io.*;
import java.util.*;
/*
	1181.단어 정렬
	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
	1. 길이가 짧은 것부터
	2. 길이가 같으면 사전 순으로
	단, 중복된 단어는 하나만 남기고 제거해야 한다.
	
	첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
	주어지는 문자열의 길이는 50을 넘지 않는다.
	
	조건에 따라 정렬하여 단어들을 출력한다.
*/
public class step_13_09 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        // 중복을 방지하기 위해 HashSet 사용
        Set<String> wordSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }
        
        // Set을 List로 변환
        List<String> wordList = new ArrayList<>(wordSet);
        
        // 정렬: 길이 오름차순 -> 사전순
        Collections.sort(wordList, (word1, word2) -> {
            if (word1.length() != word2.length()) {
                return word1.length() - word2.length();
            } else {
                return word1.compareTo(word2);
            }
        });
        
        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String word : wordList) {
            bw.write(word);
            bw.newLine();
        }
        
        bw.close();
    }
}
