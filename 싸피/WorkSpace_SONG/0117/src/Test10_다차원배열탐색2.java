
public class Test10_다차원배열탐색2 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		// 행 우선탐색
		for (int r=0; r<arr[0].length;r++) {
			for (int c=0; c<arr.length; c++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		// 열 우선탐색
		for (int c=0; c<arr.length;c++) {
			for (int r=0; r<arr[0].length; r++) {
				System.out.printf("%4d", arr[r][c]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		//행 지그재그 탐색
		for (int r=0;r<arr[0].length;r++) {
			if(r%2==0) {
				for (int c=0;c<arr.length;c++) {
					System.out.printf("%4d", arr[r][c]);
				}
			}
			else  {
				for (int c=arr.length-1;c>=0;c--) {
					System.out.printf("%4d", arr[r][c]);
				}
			}
			System.out.println();
		}
		
		
		// 지그재그 탐색 2
		//for
		
	}
}
