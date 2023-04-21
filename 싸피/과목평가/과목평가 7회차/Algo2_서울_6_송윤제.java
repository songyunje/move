import java.io.*;
import java.util.*;

public class Algo2_서울_6_송윤제 {
	static int N,M; 
	static int[] hard; 
	static List<Integer>[] arr;
	static int[] level;
	static class node{                // 해당 과목의 번호와 난이도 정보를 포함한 node
		int v;
		int k;
		public node(int v, int k) {
			this.v=v;
			this.k=k;
		}
	}
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken()); // 과목의 수, 선수관계 정보 수 입력
			
			hard = new int[N+1]; // 과목의 난이도 입력
			st = new StringTokenizer(br.readLine());
			for(int i=1;i<=N;i++) {
				hard[i]=Integer.parseInt(st.nextToken());
			} 
			
			arr = new ArrayList[N+1]; // 선수관계 정보 배열 초기화
			for(int i=1;i<=N;i++) {
				arr[i] = new ArrayList<>();
			} 
			
			level = new int[N+1]; // 필요한 선수과목 수 배열 초기화
			
			for(int i=0;i<M;i++) {
				st = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				arr[v].add(e);
				level[e]++;    // 선수관계 정보 및 필요한 선수과목 수 입력 
			}
			
			sb.append("#"+t+" ");
			function();  // 위상정렬 함수 실행
			sb.append("\n");		
		} // test case
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	} // main
	
	static void function() {
		PriorityQueue<node> pq = new PriorityQueue<>(new Comparator<node>() {	
			public int compare(node o1, node o2) {
				return o1.k-o2.k;  // 과목의 난이도 별로 정렬되는 우선순위 큐
			}
		});
		
		for(int i=1;i<=N;i++) {
			if(level[i]==0) pq.add(new node(i,hard[i]));
		} // 필요한 선수과목이 없는 과목들 pq에 대입
		
		while(!pq.isEmpty()) {         //  pq에 대입되어진 과목들을 하나씩 꺼낸다.
			node temp = pq.poll();     // 꺼내질 때 마다 sb에 append해준다.
			sb.append(temp.v+" ");
			for(int i : arr[temp.v]) {
				level[i]--;                                   // 해당 과목이 선택될 때 마다 필요한 선수과목 수(level)을 하나씩 감소시킨다.
				if(level[i]==0) pq.add(new node(i,level[i])); // level 값이 0이 되면 선수과목을 전부 이수했다는 뜻이기에 pq에 대입한다.
			}
		}
	} // function
}
