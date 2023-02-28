
public class Test05_minmax {
	public static void main(String[] args) {
		int[] intArray = {3,27,13,8,235,7,22,9,435,31,54};
		
		int min = 1000;
		int max = 0;
		for (int num : intArray) {
			if( num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.printf("min: %d, max: %d%n", min, max);
		
		
		
		
		int min2 = intArray[0];
		int max2 = intArray[0];
		for(int num : intArray) {
			if (num > max) {
				max = num;
			}
			if (num< min) {
				min = num;
			}
		}
		System.out.printf("min: %d, max: %d%n", min, max);
		
		int min3 = Integer.MAX_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		for (int num : intArray) {
			min3 = Math.min(min3, num);
			max3 = Math.max(max3, num);
		}
		System.out.printf("min: %d, max: %d%n", min, max);
	}

}
