package 백준;

import java.io.*;

public class 백준2292 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int N = Integer.parseInt(br.readLine());
		
		int n = 0;
		while(true) {
			n++;
			if(N<=3*n*n-3*n+1) 
				break;		
		}
		
		System.out.println(n);
	}
}
