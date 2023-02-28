
public class Test09_다중배열의탐색 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{3,5,8},
			{4,9,12},
			{2,4,6}
		};
		
		int count = 0;
		int sum = 0;
		for (int[] row : arr) {
			for(int num : row) {
				if (num%3 == 0) {
					count++;
					sum= sum + num;
				}
			}
		}
		System.out.printf("개수: %d, 총합: %d%n", count, sum);
	}

}
