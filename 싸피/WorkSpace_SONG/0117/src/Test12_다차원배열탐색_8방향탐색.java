
public class Test12_다차원배열탐색_8방향탐색 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		
		int sum = 0;
		int[] dr = {-1,-1,-1,0,1,1,1,0};
		int[] dc = {-1,0,1,1,1,0,-1,-1};
		
		for (int r=0;r<4;r++) {
			for (int c=0;c<4;c++) {
				if(arr[r][c]==5) {
					for (int d=0;d<8;d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];
						if(nr >=0 && nc >=0 && nc<4 && nr<4) {
							sum += arr[nr][nc];
						}
					}
				}
				
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}
}
