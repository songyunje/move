package 백준;

import java.io.*;
import java.util.*;
public class 백준13460 {
	static int N,M;
	static Character[][] map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine().trim()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new Character[N][M];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine().trim();
			for(int j=0;j<M;j++) {
				map[i][j]=str.charAt(j);
			}
		}
		

		br.close();
		bw.close();
	}
	static void move(int rx, int ry, int bx, int by) {
		
		for(int d=0;d<4;d++) {
			
		}
	
}
