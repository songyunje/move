package 백준;

import java.io.*;
import java.util.*;

public class 백준2470 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = N-1;
		int ms = 0;
		int me = 0;
		int min = Integer.MAX_VALUE;
		
		while(start<end) {
			if(Math.abs(arr[start]+arr[end])<min) {
				ms=arr[start];
				me=arr[end];
				min = Math.abs(arr[start]+arr[end]);
			}
			if(arr[start]+arr[end]==0) {
				break;
			}else if(arr[start]+arr[end]>0){
				end--;
			}else {
				start++;
			}
				
		}
		
		bw.write(ms+" "+me);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
