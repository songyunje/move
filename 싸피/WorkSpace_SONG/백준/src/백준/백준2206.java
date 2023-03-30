package 백준;

import java.io.*;
import java.util.*;

public class 백준2206 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int[][] map;
	static int N,M,min;
	static Boolean possible;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine().trim()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][M+1];
		min = Integer.MAX_VALUE;
		possible = false;
		
		for(int i=1;i<N+1;i++) {
			String str = br.readLine().trim();
			for(int j=1;j<M+1;j++) {
				map[i][j]=str.charAt(j-1);
			}
		}
		
		move(1,1,0,false);
		
		if(possible)
			bw.write(String.valueOf(min));
		else
			bw.write(String.valueOf(-1));
		br.close();
		bw.close();
		
	}

	
	static void move(int x, int y, int cnt, Boolean check) {
		if(x==N && y==M) {
			min=Math.min(min, cnt);
			possible=true;
			return;
		}
		
		for(int d=0;d<3;d++) {
			int nx = x+dx[d];
			int ny = y+dy[d];
			if(nx>=1 && nx<N+1 && ny>=1 && ny<M+1) {
				if(!check) {
					if(map[nx][ny] != 1)
						move(nx,ny,cnt+1,false);	
					else
						move(nx,ny,cnt+1,true);
				}else {
					if(map[nx][ny] != 1)
						move(nx,ny,cnt+1,true);	
				}
			} // boundary check
		} // delta
	} // move
}
