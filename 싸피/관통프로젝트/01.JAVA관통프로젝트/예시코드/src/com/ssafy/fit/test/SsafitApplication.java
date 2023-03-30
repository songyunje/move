/**
 * 콘솔창 실행
 * 맥 - java -cp .:../lib/gson-2.8.9.jar com.ssafy.fit.test.SsafitApplication
 * 
 * VideoDaoImpl.java 20라인의 경로 변경 필요 : video.json
 */
package com.ssafy.fit.test;

import com.ssafy.fit.ui.MainUi;

public class SsafitApplication {
	public static void main(String[] args) {
		new MainUi().service();
	}
}