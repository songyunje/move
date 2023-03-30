import java.io.*;
import java.util.*;

public class Algo_서울_6반_송윤제 {
	static int N;
	static int[][] map;
	static int[] sq;
	static int[] dotori;
	static int answer;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			sq = new int[3];
			dotori = new int[N];
			answer = 0;
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<N;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
					if(map[i][j]==1) dotori[j]++;
				}
			} // map 입력
			
			setsq(0,0); // 다람쥐 조합하여 배치 후 도토리 모으기
			
			sb.append("#"+t+" "+answer+"\n");
		} // testcase
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	} // main
	
	static void setsq(int a, int b) {
		if(b==3) {
			collect(sq);
			return;
		}
		
		for(int i=a;i<=N-3+b;i++) {
			sq[b]=i;
			setsq(i+1,b+1);
		}
	} // 조합으로 다람쥐 배치
	
	static void collect(int[] arr) {
		int count = 0;
		
		for(int i=0;i<sq.length;i++) {
			if(i != 1) count+=dotori[sq[i]];
			else count+=dotori[sq[i]]/2;
		}
		
		answer=Math.max(answer, count);
	} // 다람쥐가 도토리 수집
}
