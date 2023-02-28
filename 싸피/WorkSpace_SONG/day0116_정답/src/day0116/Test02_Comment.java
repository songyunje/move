package day0116;

public class Test02_Comment {
	public static void main(String[] args) {
		int a; // 한줄 주석(기호의 시작 ~ 그줄의 끝)
		/* : 시작
		  여러줄 주석(시작 기호~ 끝기호)
		 끝 : */
		/**
		 * Document API를 위한 주석
		 */
		 		int a;// 한줄 주석, 그 기호의 시작부터 그 줄의 끝까지 모두 주석
		/*
		 여러줄 주석
		 */ int b;
		 
		 /**
		  Documentation API를 위한 주석
		  */
		 
		 /**
		  * The <code>System</code> class contains several useful class fields
		  * and methods. It cannot be instantiated.
		  *
		  * <p>Among the facilities provided by the <code>System</code> class
		  * are standard input, standard output, and error output streams;
		  * access to externally defined properties and environment
		  * variables; a means of loading files and libraries; and a utility
		  * method for quickly copying a portion of an array.
		  *
		  * @author  unascribed
		  * @since   JDK1.0
		  */
			// ctrl 누르고 해당 코드로 이동하기.
		System.out.println();
		
	}
}
