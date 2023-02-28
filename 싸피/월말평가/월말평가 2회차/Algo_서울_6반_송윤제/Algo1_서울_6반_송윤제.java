
import java.io.*;
import java.util.*;

public class Algo1_서울_6반_송윤제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		
		// 테스크 케이스 입력받음
		int T = Integer.parseInt(br.readLine());
		
		// 테이스 케이스 수 만큼 for문 돌림
		for(int t=0;t<T;t++) {
			sb = new StringBuilder("#"+(t+1)+" ");
			
			// 사람 수 입력 받음
			int N = Integer.parseInt(br.readLine());
			
			
			//사람 수의 크기를 가진 배열 생성
			int[] arr = new int[N];

			// 쿵쿵따 횟수 셀 count(count=3이 따)
			int count=0;
			
			// 현재 탈출한 사람 수
			int total=0;
			
			// 시작점
			int start=0;
			
			// 탈출한 사람 수가 전체 사람 수 보다 적을 때까지 while문
			while(total<N) {
				// 배열의 값이 0이라는 말은 아직 탈출하지 않았다는 뜻
				// count를 늘린다(쿵)
				if(arr[start]==0) {
					count++;
				}
				// count=3이라는 뜻은 쿵쿵따의 따의 순서라는 뜻
				// 그 자리의 값을 1로 바꾸면 탈출했다는 것을 표시하고
				// count는 초기화, total은 하나 늘려준다.
				if(count==3) {
					arr[start]=1;
					count=0;
					total++;
				}
				
				// 탈출한 사람 수가 전체 사람 수 보다 하나 적을 때 끝
				if(total==N-1)
					break;
				
				// 나머지를 이용해 배열의 끝에 도달하면 다시 맨 앞으로 돌아감
				start=(start+1)%N;
			}

			// 마지막으로 남은 사람의 번호 체크
			int ans=1;
			for(int i=0;i<N;i++) {
				if(arr[i]==0)
					ans += i;
			}
			
			// 출력
			sb.append(ans+"\n");
			bw.write(sb.toString());
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
