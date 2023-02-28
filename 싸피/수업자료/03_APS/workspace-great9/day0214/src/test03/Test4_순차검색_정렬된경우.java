package test03;

public class Test4_순차검색_정렬된경우 {
	public static void main(String[] args) {
		int[] A = {2, 4, 7, 9, 11, 19, 23};
		
		
	}
	
	public static int sequentialSearch(int[] A, int key) {
		int n = A.length;
		
		int i = 0;
		while(A[i] < key)
			i++;
		
		// while문을 빠져나오면 어떤상황?
		// A[i] >= key
		// 1. A[i] == key : 찾은 경우, i을 반환
		// 2. A[i] > key  : 더이상 볼필요가 없는 경우, 어차피 없으니까.
		//   - -1을 반환
		
		if(A[i] == key) return i;
		else return -1;
	}
}
