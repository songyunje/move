import java.io.*;
import java.util.*;

public class Algo2_서울_6반_송윤제 {
	static int N,M;
	static int[][] map;
	static int[] wlist;
	static int[] wizard;
	static int[] dx = {-1,1};
	static int answer;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine()); // testcase 개수 입력
		
		for(int t=1;t<=T;t++) {
			N = Integer.parseInt(br.readLine());
			wlist= new int[N]; // 마법사 행렬
			wizard = new int[N]; // 배치된 마법사 행렬
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				wlist[i]=Integer.parseInt(st.nextToken());
			} // 마법사 정보 입력
			
			M = Integer.parseInt(br.readLine());
			map = new int[N][M]; // 싸피나라 행렬
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<M;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
				}
			} // 좀비 정보 입력
			
			
			answer = 0; // 정답 초기화

			set(0,0); // 마법사들을 조합하여 배치 후 공격하는 함수 실행
			
			sb.append("#"+t+" "+answer+"\n");
			
		} // test case
		
		bw.write(sb.toString());
		br.close();
		bw.close();
	} // main
	
	static void set(int a, int b) {
		if(a==N) {
			int[][] data = copy(map); // 싸피나라 맵 복사
			int[] rounds = copy(wizard); // 마법사 배치 복사
			attack(data,rounds); // 입력된 싸피나라 맵과 마법사 배치 정보로 공격 
			return;
		}
		
		for(int i=0;i<N;i++) {
			if((b&1<<i)>0) continue;
			wizard[a]=wlist[i];
			set(a+1,b|1<<i);
		}
	} // 마법사 배치 및 공격
	
	static int[][] copy(int[][] a) {
		int[][] temp = new int[a.length][a[0].length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				temp[i][j]=map[i][j];
			}
		}
		return temp;
	} // 행렬 복사
	
	static int[] copy(int[] a) {
		int[] temp = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
		return temp;
	} // 행렬 복사
	
	static void attack(int[][] data, int[] rounds) {
		int count = 0; // 토벌 횟수 초기화
		
		for(int i=0;i<rounds.length;i++) {
			for(int d=0;d<2;d++) {
				int x = i+dx[d];
				if(x>=0 && x<rounds.length && rounds[x]==0) rounds[i]*=2;
			}
		} // 마법사에게 버프 부여
		

		
		for(int i=0;i<N;i++) {
			int round = rounds[i];  // 해당 열 마법사의 총 공격 횟수
			for(int j=0;j<M;j++) {
				if(data[i][j] != 0) {
					if(data[i][j]>round) { // 해당 자리의 적 값이 round값보다 클 때
						data[i][j]-=round;
						round=0; 
					}else {                // 해당 자라의 적 값이 round값보다 작을 때
						round-=data[i][j];
						data[i][j]=0;
						count++;
					}
					if(round==0) break; // 공격 횟수 0되면 break
				}
			}
		} // 마법사들 공격
		
		answer = Math.max(answer, count); // 최대 처치 수 갱신
	} // 공격 함수
}
