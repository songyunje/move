package test03;

public class Test3_순차검색_정렬안된경우 {
	public static void main(String[] args) {
		int[] A = {4, 9, 11, 23, 2, 19, 7};
		
		int idx = sequentialSearch(A, 2);
		System.out.println(idx);
		
		idx = sequentialSearch(A, 20);
		System.out.println(idx);
	}
	
	public static int sequentialSearch(int[] A, int key) {
		int n = A.length;
		
		int i = 0;
		while(i < n && A[i] != key) {
			i++;
		}
		
		// while문을 빠져나오면 어떤 상황이다?
		// 1. A[i] == key인 경우: 찾은 경우
		// 2. i >= n인 경우: 못찾은 경우
		
		if(i<n) return i;
		else return -1;
	}
}
