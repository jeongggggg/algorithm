package baekjoon.step_by_step;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

/*
	10171. 고양이
	아래 예제와 같이 고양이를 출력하시오.
	\    /\
	 )  ( ')
	(  /  )
	 \(__)|
*/

public class step_01_12 {
	public static void main(String[] args) {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");    
	}
}

class step_01_12_01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("\\    /\\\n");
		sb.append(" )  ( ')\n");
		sb.append("(  /  )\n");
 		sb.append(" \\(__)|\n");
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("\\    /\\\n");
		sb1.append(" )  ( ')\n");
		sb1.append("(  /  )\n");
 		sb1.append(" \\(__)|\n");
		
		System.out.println(sb1);
	}
}

class step_01_12_02 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("\\    /\\");
		bw.newLine();	// 줄 구분자
		
		bw.write(" )  ( ')");
		bw.newLine();	
        
		bw.write("(  /  )");
		bw.newLine();
        
		bw.write(" \\(__)|");
        
		bw.flush();
		bw.close();
	}
}