import java.io.*;
import java.util.*;

public class Algo2_서울_6반_송윤제 {
	static int T,N,S,Total;
	static int[][] map;
	static int[] wdx = {-1,0,1,0}; // 백마법의 범위를 지정하는 dx값(순서대로 상,우,하,좌)
	static int[] wdy = {0,1,0,-1}; // 백마법의 범위를 지정하는 dy값(순서대로 상,우,하,좌)
	static int[] ddx = {-1,-1,1,1}; // 흑마법의 범위를 지정하는 dx값(순서대로 좌상,우상,우하,좌하)
	static int[] ddy = {-1,1,1,-1}; // // 흑마법의 범위를 지정하는 dy값(순서대로 좌상,우상,우하,좌하)
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb;
		
		// TestCase의 개수를 입력받는다.
		T = Integer.parseInt(br.readLine());
		
		// TestCase의 개수만큼 for문을 돌린다.
		for(int t=0;t<T;t++) {
			sb = new StringBuilder("#");
			
			// 땅의 크기 N을 입력받고 N*N배열을 만든다.
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			
			// 만들어진 배열에 N 줄에 걸쳐 입력된 땅의 정보를 넣어준다.
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int j=0;j<N;j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 마법을 사용하는 횟수를 입력받는다.
			S = Integer.parseInt(br.readLine());
			
			
			// 마법 사용 횟수 만큼 for문을 돌린다.
			for(int s=0;s<S;s++) {
				st = new StringTokenizer(br.readLine()," ");
				
				// 마법이 사용될 행(irow), 열(icol), 범위(iarea), 종류(type)을 입력받는다.
				int irow = Integer.parseInt(st.nextToken());
				int icol = Integer.parseInt(st.nextToken());
				int iarea = Integer.parseInt(st.nextToken());
				int type = Integer.parseInt(st.nextToken());
				
				// 종류에 맞는 마법을 실행한다.
				switch(type) {
				
				// 0은 백마법으로 따로 선언한 white 함수를 실행하는데
				// 들어가는 변수는 차례대로 땅의 정보, 마법 사용 행, 렬, 범위가 된다.
				case 0 :  white(map,irow,icol,iarea);
						  break;
						  
				// 1은 흑마법으로 dark함수를 실행한다.  
				case 1 :  dark(map,irow,icol,iarea);
				          break;   
				          
				// 2는 잿빛마법으로 grey함수를 실행한다.         
				case 2 :  grey(map,irow,icol,iarea);
				          break;
				}
			}
			
			// 마법이 전부 사용된 후의 땅 상태를 입력받아 전체 에너지 양을 산출한다.
			Total = energy(map);
			
			// 전체 에너지 양을 출력 예시와 같이 출력한다.
			sb.append((t+1)+" "+Total+"\n");
			bw.write(sb.toString());
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	// 땅의 에너지 정보를 받아 전체 에너지 양을 산출하는 함수
	static int energy(int[][] arr) {
		
		// sum을 0이라 놓고
		int sum=0;
		
		// array를 처음부터 끝까지 돌며 해당 인덱스의 값을 sum에 더해준다.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
			}
		}
		
		// 모든 값이 더해진 후의 sum 값을 리턴해준다.
		return sum;
	}
	
	
	// 백마법을 사용하여 땅 정보를 업데이트하는 함수로 
	// 변수들은 차례대로 땅의 정보, 마법을 사용할 행, 열, 범위가 된다.
	static void white(int[][] arr,int row, int col, int area) {
		
		// 먼저 실제 마법이 사용된 위치의 arr값을 
		// 0이면 1로, 0이 아니라면 2배를 해준다.
		if(arr[row][col]==0) {
			arr[row][col]=1;	
		}else {
			arr[row][col] = 2*arr[row][col];
		}
		
		// 이후 앞서 만들어둔 백마법의 범위를 나타내는 wdx와 wdy 행렬을 사용하는데
		// 사용 위치를 제외한 4방향으로 마법이 사용되므로 for문을 
		// d=0 부터 d<4까지 돌린다.
		for(int d=0;d<4;d++) {
			
			// 방향이 바뀔 때마다 다시 초기 위치를 설정해준다.
			int nr=row;
			int nc=col;
			
			// 마법 범위만큼 for문을 돌려 나간다.
			for(int a=0;a<area;a++) {
				
				// 범위마다 앞서 가지고 온 d를 인덱스로 하는 wdx와 wdy의 값을 
				// nr과 nc에 더해준다.
				nr += wdx[d];
				nc += wdy[d];
				
				// 마법이 전이되고 나서 그 해당 nr과 nc값이 실제 땅의 범위 내에 있다면
				// 마법이 사용된다.
				if(nr>=0 && nr<arr.length && nc>=0 && nc<arr.length) {
					
					// 땅의 에너지가 0이면 1로, 0이 아니라면 2배해준다.
					if(arr[nr][nc]==0) {
						arr[nr][nc]=1;
					}else {
						arr[nr][nc] = 2*arr[nr][nc];					
					}
					
			    // 마법이 전이된 위치가 땅의 범위 밖이라면 아무일도 없다.
				}else {
					break;
				}
			}
		}
	}
	
	// 흑마법을 사용하여 땅 정보를 업데이트하는 함수로 
	// 변수들은 차례대로 땅의 정보, 마법을 사용할 행, 열, 범위가 된다.
	// 전반적인 방식은 백마법과 같다.
	static void dark(int[][] arr,int row, int col, int area) {
		
		arr[row][col] = arr[row][col]/2;
		
		for(int d=0;d<4;d++) {
			int nr=row;
			int nc=col;
			for(int a=0;a<area;a++) {
				nr += ddx[d];
				nc += ddy[d];
				if(nr>=0 && nr<arr.length && nc>=0 && nc<arr.length) {
						arr[nr][nc] = arr[nr][nc]/2;					
				}else {
					break;
				}
			}
		}
	}

	// 잿빛마법을 사용하는 함수이다.
	static void grey(int[][] arr,int row, int col, int area) {
		
		// 실제 사용 위치는 temp에 넣어두고
		int temp = arr[row][col];
		
		// 백마법과 흑마법을 모두 사용한 뒤
		white(arr,row,col,area);
		dark(arr,row,col,area);
		
		// 실제 사용 위치에 temp값을 불러온다.
		arr[row][col]=temp;
		
		
	}
}
