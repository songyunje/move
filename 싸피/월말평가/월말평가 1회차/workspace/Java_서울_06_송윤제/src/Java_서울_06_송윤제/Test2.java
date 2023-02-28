package Java_서울_06_송윤제;



public class Test2 {
	public static void main(String[] args) {
		
		// 주어진 배열 입력
		int[] arr = {2,8,6,4,3,7,9};
		
		
		
		
		// 주어진 배열의 요소를 크기 순으로 재배열
		int space =0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					space = arr[i];
					arr[i]=arr[j];
					arr[j]=space;
				}
			}
		}
		

		// 재배열 된 배열에서 최대값, 최소값, 중간값을 찾는다
		int Max = arr[arr.length-1];
		int min = arr[0];
		int Mid = arr[arr.length/2];
		
		
		// 최대값, 최소값, 중간값을 더한 값을 출력한다
		System.out.println("최대값:"+Max+",최소값:"+min+",중간값:"
				+ ""+Mid+"의 합은 "+(Max+min+Mid));
		
	}

}
