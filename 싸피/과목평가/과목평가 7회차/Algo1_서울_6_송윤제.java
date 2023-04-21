import java.io.*;
import java.util.*;

public class Algo1_서울_6_송윤제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1;t<=T;t++) {
			Long N = Long.parseLong(br.readLine());  // N이 int 범위를 초과할 수 있기에 long으로 받는다.
			
			int[] dp = new int[10]; // 가치 당 동전 최소 사용 개수, 10단위마다 갱신해서 다시 넣어줄 것이므로 크기는 10으로 설정한다.
			
			for(long i=1;i<=N;i++) {
				if(i<=6) dp[(int)i]=-1;  // 1~6은 -1
				if(i==7) dp[(int)i]=1;   // 7은 1
				if(i==8) dp[(int)i]=-1;  // 8은 -1     
				if(i==9) dp[(int)i]=1;   // 9는 1        -> if문으로 범위별로 설정해줘야 N이 10보다 작은 값이 들어와도 오류가 안 생긴다. 0~9를 첫번쨰 사이클로 설정한다.
				if(i>9) { // 동전의 가치가 7 또는 9 이므로  10부터는 10개 씩 끊어서 나머지(0~9)을 이용하여 dp[(int)((i-9)%10)]과 dp[(int)((i-7)%10)] 값을 참고하여 dp[(int)(i%10)]를 갱신한다.
					if(dp[(int)((i-7)%10)] != -1 && dp[(int)((i-9)%10)]==-1) dp[(int)(i%10)]=dp[(int)((i-7)%10)]+1;  
					else if(dp[(int)((i-9)%10)] != -1 && dp[(int)((i-7)%10)]==-1) dp[(int)(i%10)]=dp[(int)((i-9)%10)]+1;
					else if(dp[(int)((i-7)%10)] != -1 && dp[(int)((i-9)%10)] != -1) dp[(int)(i%10)]=Math.min(dp[(int)((i-7)%10)]+1, dp[(int)((i-9)%10)]+1); 
					else dp[(int)(i%10)]=-1; // dp[(int)((i-7)%10)] 또는 dp[(int)((i-9)%10)]이 -1이라는 말은 가치 7또는 9로 그 해당 가치를 만족시킬 수 없다는 뜻이므로 
								   // 둘 중 -1이 값 만을 이용하여 +1 처리하여 갱신한다.
					               // 둘 다 -1 이라면 dp[(int)(i%10)]도 -1로 처리한다.
				}
			}

			sb.append("#"+t+" "+dp[(int)(N%10)]+"\n"); // 출력 조건에 맞게  dp[(int)(N%10)]값을 stringbuilder에 넣어준다.
			
		} // test case
		
		bw.write(sb.toString()); // 출력
		br.close();
		bw.close();
	} // main
}
