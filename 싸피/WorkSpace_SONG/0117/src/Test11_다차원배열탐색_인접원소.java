
public class Test11_다차원배열탐색_인접원소 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		
		// 위 arr 이차원 배열에서 숫자가 6의 상하좌우 인접원소의 합은?
		// 단 6은 빼고
		/*
		int row = 0;
		int col = 0;
		for (int r=0; r<arr[0].length; r++) {
			for (int c=0; c<arr.length; c++) {
				if (arr[r][c] == 6) {
					row = row + r;
					col = col + c;
				}
			}
		}
		
		int sum = arr[row-1][col] + arr[row][col-1] + arr[row][col+1] + arr[row+1][col];
		System.out.println(sum);
		*/
		
		
		//delta 배열 이용한 풀이
		int sum = 0;
		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		
		for (int r=0;r<4;r++) {
			for (int c=0;c<4;c++) {
				if(arr[r][c]==5) {
					for (int d=0;d<4;d++) {
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
