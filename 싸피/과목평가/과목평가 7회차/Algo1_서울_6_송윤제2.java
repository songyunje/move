package asdfdsf;
import java.io.*;
import java.util.*;

public class Algo1_서울_6_송윤제2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1;t<=T;t++) {
			Long N = Long.parseLong(br.readLine());  // N이 int 범위를 초과할 수 있기에 long으로 받는다.
			
			Long a = N/9;
			Long b = N%9;

			if(b!=0 && b!=7) {
				if(b%2==0) a+=2;
				else a+=1;
			}
			
			sb.append("#"+t+" "+a+"\n"); // 출력 조건에 맞게 a값을 stringbuilder에 넣어준다.
			
		} // test case
		
		bw.write(sb.toString()); // 출력
		br.close();
		bw.close();
	} // main
}
