package 백준;

import java.io.*;
import java.util.*;

public class 백준13549_2 {
	static int L;
	static PriorityQueue<node> pq;
	static boolean[] visited;
	static int[] distance;
	static int[] d = {-1,1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine().trim()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		L = 100001;
		
		visited = new boolean[L];
		distance = new int[L];
		
		pq = new PriorityQueue<>(new Comparator<node>() {
			public int compare(node o1, node o2) {
				return o1.t-o2.t;
			}
		});
		
		for(int i=0;i<L;i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		
		dix(N);
		
		bw.write(String.valueOf(distance[K]));
		br.close();
		bw.close();
	} // main
	
	static void dix(int a) {
		pq.add(new node(a,0));
		distance[a]=0;
		while(!pq.isEmpty()) {
			node temp = pq.poll();
			if(!visited[temp.v]) {
				visited[temp.v]=true;
				if(temp.v !=0) {
					for(int i=temp.v;i<L;i*=2) {
						if(distance[i]>distance[temp.v]) {
							distance[i]=distance[temp.v];
						}
						pq.add(new node(i,distance[i]));
					}
				}
				for(int i=0;i<2;i++) {
					int nt = temp.v+d[i];
					if(nt>=0 && nt<L && !visited[nt]) {
						if(distance[nt]>distance[temp.v]+1)
							distance[nt]=distance[temp.v]+1;
						pq.add(new node(nt,distance[nt]));
					}
				}
			}
		}
	} // dix
	
	static class node {
		int v;
		int t;
		public node(int v, int t) {
			this.v = v;
			this.t = t;
		}
	} // node
}
