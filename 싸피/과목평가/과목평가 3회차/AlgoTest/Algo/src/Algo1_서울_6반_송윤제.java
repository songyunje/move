import java.io.*;
import java.util.*;


public class Algo1_서울_6반_송윤제 {
	static int T,N,M;
	static int[] map;
	static int totalcost;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb;
		
		// TestCase의 개수를 입력 받는다.
		T = Integer.parseInt(br.readLine());
		
		// 입력 받은 TestCase의 수 만큼 for문을 돌린다.
		for(int t=0;t<T;t++) {
			sb = new StringBuilder("#");
			
			// StringTokenizer로 한 줄을 입력 받은 뒤 빈칸을 기준으로 하여 자른다.
			st = new StringTokenizer(br.readLine()," ");
			
			// 싸피 나라의 크기 N을 입력받는다.
			N = Integer.parseInt(st.nextToken());
			
			// 지진의 횟수 M을 입력받는다.
			M = Integer.parseInt(st.nextToken());
			
			map = new int[N];
			
			// 지진의 횟수 만큼 for문을 돌린다.
			for(int m=0;m<M;m++) {
				st = new StringTokenizer(br.readLine()," ");
				
				// 따로 선언한 지진함수 eq(earthquake)를 실행한다.
				// 이 때 함수에 들어가는 변수들은 앞에서부터 싸피나라 배열, 지진의 위치, 지진의 강도가 된다.
				eq(map,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));	
			}
			
			// 지진이 전부 일어난 후의 나라의 상태를 따로 선언한 cost함수에 넣어주고
			// 전체 보강 비용을 산출한다.
			totalcost = cost(map);
			
			// StringBuilder를 통해 출력 예시와 같이 만들어주고 출력한다.
			sb.append((t+1)+" "+totalcost+"\n");
			
			bw.write(sb.toString());
		}
		
		br.close();
		bw.flush();
		bw.close();
		
		
	}

	
	
	
	// 나라의 기존 상태와 지진의 위치, 지진의 강도를 입력받으면 새롭게 지진 후의 데미지를 업데이트 해주는 함수
	static void eq(int[] arr, int p, int d) {
		
		// 지진이 실제 일어난 위치에 데미지를 그대로 추가해준다.
		arr[p-1]+=d;
		
		// 그다음부터는 여파를 추가해줄 것이므로 데미지를 -1 해서 넣어준다.
		int damage = d-1;
		
		// 지진이 실제 일어난 위치보다 한칸 전을 start 포인트로 놓고
		// 지진이 실제 일어난 위치보다 한칸 후를 finish 포인트로 놓는다.
		int start = p-2; 
		int finish = p;
		
		// damage가 0이 되기전까지 while문을 돌리는데 
		while(damage>0) {
			
			// 나라의 끝이 정해져있으므로 왼쪽으로 움직이는 start의 경우 0보다 크거나 같을때만
			// 데미지를 더해준다.
			if(start>=0)
				arr[start]+=damage;
			
			// 반대로 오른쪽으로 움직이는 finish의 경우 array의 길이보다 작을 때만
			// 데미지를 더해준다.
			if(finish<arr.length)
				arr[finish]+=damage;
			
			// 양쪽의 여파의 데미지를 더해주고 start는 왼쪽으로 한칸, finish는 오른쪽으로 한칸 옮겨주고
			// 데미지는 -1 해준다.
			start--;
			finish++;
			damage--;
		}
	}
	
	
	// 현 나라 상태에서의 보강 비용을 산출하는 함수
	static int cost(int[] arr) {
		
		// 합계를 0으로 정해주고
		int sum = 0;
		
		// for문을 처음부터 끝까지 돌려 각각의 index의 데미지 누적 값을 전부 더해준다.
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		// 결과 값을 리턴한다.
		return sum;
	}
}
