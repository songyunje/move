import java.util.Arrays;

public class Test06_빈도수 {
	public static void main(String[] args) {
		int[] intArray = {3,7,2,5,7,7,9,2,8,1,1,5,3};
		int[] used = new int[10];
		
		for (int num : intArray) {
			used[num]++;
		}
		System.out.println(Arrays.toString(used));
		
		

		
	}

}
