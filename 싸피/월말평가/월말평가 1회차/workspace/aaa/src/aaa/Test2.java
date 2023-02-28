package aaa;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[] arr = {2,8,6,4,3,7,9};
		
		int space =0;
		for (int i=0;i<7;i++) {
			for(int j=i+1;j<7;j++) {
				if(arr[i]>arr[j]) {
					space = arr[i];
					arr[i]=arr[j];
					arr[j]=space;
				}
			}
		}
		int Max = arr[6];
		int min = arr[0];
		int Mid = arr[3];
		System.out.println(Max+min+Mid);
		
	}

}
