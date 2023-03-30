package com.ssafy.fit.ui;

import com.ssafy.fit.util.SsafitUtil;

public class MainUi {
	public void service() {
		SsafitUtil.screenClear();
		SsafitUtil.printLine();
		System.out.println("자바로 구현하는 SSAFIT");
		SsafitUtil.printLine();
		while (true) {
			SsafitUtil.printLine();
			System.out.println("1. 영상정보");
			System.out.println("0. 종료");
			SsafitUtil.printLine();
			switch (SsafitUtil.input("메뉴를 선택하세요 : ")) {
			case "1": 
				VideoUi.getInstance().service(); 
				break;
			case "0": exit();
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
			SsafitUtil.screenClear();
		}
	}
	
	private void exit() {
		SsafitUtil.printLine();
		System.out.println("시스템을 종료합니다.");
		System.exit(0);
	}
}