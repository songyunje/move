package A형;

import java.io.*;
import java.util.*;

public class 보급로 {
	static int[][] map;
	static boolean[][] visited;
	static int N, min, temp;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
//	static int[] dx = {0,1};
//	static int[] dy = {1,0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine().trim());
		
		for(int t=1;t<=T;t++) {
			N = Integer.parseInt(br.readLine().trim());
			map = new int[N][N];
			for(int i=0;i<N;i++) {
				String str = br.readLine().trim();
				for(int j=0;j<N;j++) {
					map[i][j]=str.charAt(j)-'0';
				}
			} // map 입력
			
			temp = 0;
			min = Integer.MAX_VALUE;
			visited = new boolean[N][N];
			visited[0][0]=true;
			
			dfs(0,0);
			
			sb.append("#"+t+" "+min+"\n");
		} // test case
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	} // main
	
	static void dfs(int a, int b) {
		if(a==N-1 && b==N-1) {
			min=Math.min(min, temp);
			return;
		}
		
		for(int d=0;d<2;d++) {
			int x = a+dx[d];
			int y = b+dy[d];
			if(x>=0 && x<N && y>=0 && y<N && !visited[x][y]) {
				visited[x][y]=true;
				temp+=map[x][y];
//				System.out.println("dfs"+x+y);
//				System.out.println(temp);
				dfs(x,y);
				temp-=map[x][y];
				visited[x][y]=false;			}
		}
	}
}
