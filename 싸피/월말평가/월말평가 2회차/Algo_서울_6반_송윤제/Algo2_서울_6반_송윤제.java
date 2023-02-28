import java.io.*;
import java.util.*;

public class Algo2_서울_6반_송윤제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		StringTokenizer st;
		
		// 테스트 케이스 수 입력
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0;t<T;t++) {
			sb = new StringBuilder("#"+(t+1)+" ");
			
			// 전체 나라의 크기 입력
			int N = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine()," ");
			
			// 체크 할 부분의 좌상단,우하단 행,렬 값을 입력
			int x1 = Integer.parseInt(st.nextToken())+1;
			int y1 = Integer.parseInt(st.nextToken())+1;
			int x2 = Integer.parseInt(st.nextToken())+1;
			int y2 = Integer.parseInt(st.nextToken())+1;
			
			// 나라의 전체 높이 지도
			int[][] map = new int[N+1][N+1];
			
			// 좌상단 끝부터 해당 좌표까지가 만드는 직사각형 내의 모든 높이 값의 합
			int[][] S = new int[N+1][N+1];
			
			// 전체 높이 지도의 값들과 따로 구한 평균의 차의 절대값들을 이용하여 
			// map을 갱신하고
			// 위의 S와 같은 방법으로 다시 구한 높이 값의 합
			int[][] C = new int[N+1][N+1];
			
			
			for(int i=1;i<N+1;i++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int j=1;j<N+1;j++) {
					
					// map에 해당 좌표의 값을 입력하고
					// S에 해당 좌표까지의 높이 합을 입력
					map[i][j] = Integer.parseInt(st.nextToken());
					S[i][j]=S[i][j-1]+S[i-1][j]-S[i-1][j-1]+map[i][j];
				}
			}
			
			// 타켓 영역의 전체 높이 합은 S 배열을 참고하여 다음과 같이 구한다.
			int sum = S[x2][y2]-S[x2][y1-1]-S[x1-1][y2]+S[x1-1][y1-1];
			
			// 앞서 입력 받은 카켓 영역의 좌상단,우하단 좌표를 이용하여 넓이 구한다.
			int area = (x2-x1+1)*(y2-y1+1);
			
			// 타켓 영역의 높이 평균은 앞서 구한 넓이 sum을 area로 나누어 구한다.
			int avg = sum/area;

			// 앞서 구한 평균을 이용하여 map을 cost값으로 갱신하고
			// 다시금 C 배열에 해당 좌표까지의 cost 값의 합을 입력
			for(int i=1;i<N+1;i++) {
				for(int j=1;j<N+1;j++) {
					map[i][j]=Math.abs(map[i][j]-avg);
					C[i][j]=C[i][j-1]+C[i-1][j]-C[i-1][j-1]+map[i][j];
				}
			}
			
			
			// 앞서 구한 sum과 같이 C 배열을 참고하여 해당 영역의 cost 값의 합을 구한다.
			int cost = C[x2][y2]-C[x2][y1-1]-C[x1-1][y2]+C[x1-1][y1-1];
			
			// 평균과 비용 출력
			sb.append(avg+" "+cost+"\n");
			
			bw.write(sb.toString());
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
