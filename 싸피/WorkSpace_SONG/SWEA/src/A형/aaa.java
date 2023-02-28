package A형;



import java.io.*;
import java.util.*;

public class aaa{
	static int x,y,N,score,max;
	static int startx,starty;
	static int[][] map;
	static List<Integer> list6x = new ArrayList<>();
	static List<Integer> list7x = new ArrayList<>();
	static List<Integer> list8x = new ArrayList<>();
	static List<Integer> list9x = new ArrayList<>();
	static List<Integer> list10x = new ArrayList<>();
	static List<Integer> list6y = new ArrayList<>();
	static List<Integer> list7y = new ArrayList<>();
	static List<Integer> list8y = new ArrayList<>();
	static List<Integer> list9y = new ArrayList<>();
	static List<Integer> list10y = new ArrayList<>();

	static String direction;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;	
		StringBuilder sb;



			int N = Integer.parseInt(br.readLine());
			

			map = new int[N][N];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine()," ");
				for(int j=0;j<N;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			int startx=0;
			int starty=0;
			int score = 0;
			x=0;
			y=0;
			//&& (y != (N-1)) && !(x==startx && y==starty)
			while(x<N-1) {
				x++;
				if(map[x][y]==0 && x == N-1 && !(x==startx && y==starty) ) {
					score++;
					break;
				}
//				if(map[x][y] !=0) {
//					break;
//				}
				
			}
			
			System.out.println(x);
			System.out.println(y);
			System.out.println(score);
			
			int a = 3;
			int b = 4;
			
			int aa = 3;
			int bb = 5;
			
			if(!(a==aa && b==bb)) {
				System.out.println(true);
			}
	
	
		br.close();
		bw.flush();
		bw.close();
	}
}