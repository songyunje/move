package test01;

public class Test3 {
	public static void main(String[] args) {
		// atoi : 문자열 => 정수
		int num = atoi("1234");
		System.out.println(num);
		
		// itoa : 정수 => 문자열
		String str = itoa(4321);
		System.out.println(str);
	}

	private static String itoa(int value) {
		StringBuilder sb = new StringBuilder();
		int tmp = value;
		while(tmp > 0) {
			char c = (char)(tmp % 10 + 48); // 각 숫자에다가 48을 더해줘야 그 숫자의 문자코드가 됨
			sb.append(c);
			tmp /= 10; // 그 다음자리로 넘어간다.
		}
		
		return sb.reverse().toString();
	}

	private static int atoi(String string) {
		char[] arr = string.toCharArray();
		int value = 0;
		
		int digit;
		// 음수인 경우에는 '-' 이 있는지 여부를 체크한다.
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] >= '0' && arr[i] <= '9')
				digit = arr[i] - '0';
			else
				break;
			value = (value * 10) + digit;
				
		}
		return value;
	}
}
