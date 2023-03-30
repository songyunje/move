package day0329;

import java.io.*;
import java.util.*;
public class 하나로 {
	static int[] parent;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1;t<=T;t++) {
			int N = Integer.parseInt(br.readLine());
			int[] X = new int[N+1];
			int[] Y = new int[N+1];
			parent = new int[N+1];
			for(int i=1;i<N+1;i++) {
				parent[i]=i;
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++) {
				X[i]=Integer.parseInt(st.nextToken());
			} // X 값 입력
			st = new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++) {
				Y[i]=Integer.parseInt(st.nextToken());
			} // Y 값 입력
			double E = Double.parseDouble(br.readLine()); // 세율 입력
			
			PriorityQueue<connect> pq = new PriorityQueue<>(new Comparator<connect>() {
				public int compare(connect o1, connect o2) {
					if(o1.e>=o2.e) return 1;
					else return -1;
				}
			}); 
			
			for(int i=1;i<=N-1;i++) {
				for(int j=i+1;j<=N;j++) {
					double temp = (Math.pow(Math.abs(X[i]-X[j]), 2)+Math.pow(Math.abs(Y[i]-Y[j]), 2))*E;
					pq.add(new connect(i, j, temp));
				}
			} // 간선 정보 입력
			
			int count=0;
			double cost=0;
			while(!pq.isEmpty()) {
				connect temp = pq.poll();
				if(check(temp.x, temp.y)) continue; // 이미 같은 parent면 패스
				else {
					count++;
					cost+=temp.e;
					union(temp.x, temp.y);
				} // 다른 parent면 추가
				if(count==N-1) break;		
			}
			sb.append("#"+t+" "+Math.round(cost)+"\n");
		}
		bw.write(sb.toString());
		br.close();
		bw.close();
	} // main 
	
	static class connect{
		int x;
		int y;
		double e;
		public connect(int x, int y, double e) {
			this.x = x;
			this.y = y;
			this.e = e;
		}
	} // class connect
	
	static int find(int a) {
		if(a==parent[a]) return a;
		else return parent[a]=find(parent[a]);
	} // find
	
	static void union(int a, int b) {
		int x = find(a);
		int y = find(b);
		if(x>=y) parent[x]=find(b);
		else parent[y]=find(a);
	} // union
	
	static Boolean check(int a, int b) {
		if(find(a)==find(b)) return true;
		else return false;
	} // check
}
