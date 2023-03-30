package day0323;

import java.io.*;
import java.util.*;
public class 보호필름 {
	static int[][] map;
	static int[][] cmap;
	static int D,W,K;
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1;t<=T;t++) {
			sb.append("#"+t+" ");
			st = new StringTokenizer(br.readLine().trim()," ");
			D = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[D+1][W+1];
			cmap = new int[D+1][W+1];
			
			for(int i=1;i<=D;i++) {
				st = new StringTokenizer(br.readLine().trim()," ");
				for(int j=1;j<=W;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
					cmap[i][j]=map[i][j];
				}
			}
			
			ans=Integer.MAX_VALUE;
			
			if(pass())
				sb.append(0+"\n");
			else {
				input(1,1,0);
				input(1,1,1);
				sb.append(ans+"\n");
			}
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	}
	
	static void input(int a, int b, int k) {
		if(ans<=b)
			return;
		if(k==0) {
			inA(a);
			if(pass()) {
				ans=Math.min(ans, b);
				return;
			}
			else {
				if(ans>b+1 && a+1<=D) {
					input(a+1,b+1,0);
					back(a);
					input(a+1,b+1,1);
					back(a);		
				}
			}	
		}else {
			if(ans>b) {
				inB(a);
				if(pass()) {
					ans=Math.min(ans, b);
					return;
				}
				else {
					if(ans>b+1 && a+1<=D) {
						input(a+1,b+1,0);
						back(a);
						input(a+1,b+1,1);
						back(a);		
					}
				}
			}
		}
		back(a);
		if(ans>b && a+1<=D) {
			input(a+1,b,0);
			input(a+1,b,1);			
		}
	} // 주입 재귀
	
	static Boolean pass() {
		for(int i=1;i<=W;i++) {
			int max=0;
			int cnt=1;
			for(int j=2;j<=D;j++) {
				if(cmap[j-1][i]==cmap[j][i])
					cnt++;
				else {
					max=Math.max(max, cnt);
					cnt=1;
				}
			}
			max=Math.max(max, cnt);
			if(max<K)
				return false;
		}
		return true;
	} // 성능검사
	
	static void inA(int a) {
		for(int i=1;i<=W;i++) {
			cmap[a][i]=0;
		}
	} // A(0) 주입
	
	static void inB(int a) {
		for(int i=1;i<=W;i++) {
			cmap[a][i]=1;
		}
	} // B(1) 주입
	
	static void back(int a) {
		for(int i=1;i<=W;i++) {
			cmap[a][i]=map[a][i];
		}
	} // 백트랙킹
}
