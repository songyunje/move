package test02;

public class Test1 {
	public static void main(String[] args) {
		char[] t = "This iss a book".toCharArray();
		char[] p = "iss".toCharArray();
		
		int idx = BruteForceFor(p, t);
		System.out.println(idx);
		idx = BruteForceWhile(p, t);
	}

	private static int BruteForceWhile(char[] p, char[] t) {
		int n = t.length;
		int m = p.length;
		
		int i = 0;
		int j = 0;
		
		while(j < m && i< n ) {
			if(t[i] != p[j]) {
				i -= j;
				j = -1;
			}
			i++; j++;
		}
		// while문이 끝났다는 것은?
		// 1. j == m => 찾은 상황
		// 2. j != m => 못찾은 상황
		
		if(j==m) return i - m;
		else return -1;
	}

	private static int BruteForceFor(char[] p, char[] t) {
		int n = t.length;
		int m = p.length;
		
		for(int i=0; i<n-m+1; i++) { // pattern이 한 칸씩 shift가 최대 n-m+1번 수행
			boolean flag = true; // 각 shift에서 일단 일치한다고 가정하고 비교를 시작
			for(int j=0; j<m; j++) { // 각 shift에서 1:1 비교가 최대 m번 수행
				if(p[j] != t[i+j]) { // 일치하지 않는게 발견되면
					flag = false; // 일치하지 않는다고 바꾼다
					break;
				}
			}// 다 돌았을 때 flag => true : 모두 일치
			// flag => false : 모두 일치 X
			if(flag) return i;
		}
		
		return -1;
	}
}




