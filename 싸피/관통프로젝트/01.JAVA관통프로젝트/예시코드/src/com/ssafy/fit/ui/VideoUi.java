package com.ssafy.fit.ui;

import java.util.List;

import com.ssafy.fit.model.Video;
import com.ssafy.fit.model.dao.VideoDao;
import com.ssafy.fit.model.dao.VideoDaoImpl;
import com.ssafy.fit.util.SsafitUtil;

public class VideoUi {
	private VideoDao videoDao;

	private static VideoUi instance;

	private VideoUi() {
		videoDao = VideoDaoImpl.getInstance();
	}

	public static VideoUi getInstance() {
		if (instance == null)
			instance = new VideoUi();

		return instance;
	}

	public void service() {
		while (true) {
			SsafitUtil.screenClear();
			SsafitUtil.printLine();
			System.out.println("1. 영상목록");
			System.out.println("0. 이전으로");
			SsafitUtil.printLine();
			switch (SsafitUtil.input("메뉴를 선택하세요 : ")) {
			case "1":
				listVideo();
				break;
			case "0":
				return;
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}

	private void listVideo() {
		try {
			while (true) {
				SsafitUtil.screenClear();
				List<Video> list = videoDao.selectVideo();
				SsafitUtil.printLine();
				System.out.printf("전체 %d개%n", list.size());
				SsafitUtil.printLine();
				list.stream().forEach(
						v -> System.out.printf("%2d %4s %s %n", v.getNo(), v.getPart(), v.getTitle())
				);

				SsafitUtil.printLine();
				System.out.println("1. 영상상세");
				System.out.println("0. 이전으로");
				SsafitUtil.printLine();
				switch (SsafitUtil.input("메뉴를 선택하세요 : ")) {
				case "1":
					detailVideo();
					break;
				case "0":
					return;
				default:
					System.out.println("입력이 잘못되었습니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("영상 조회시 문제가 발생했습니다.");
		}
	}

	private void detailVideo() {
		try {
			Video video = videoDao.selectVideoByNo(SsafitUtil.inputInt("영상번호를 입력하세요 : "));
			System.out.println(video);
			SsafitUtil.screenClear();
			SsafitUtil.printLine();
			System.out.println("번호 : " + video.getNo());
			System.out.println("제목 : " + video.getTitle());
			System.out.println("운동 : " + video.getPart());
			System.out.println("영상URL : " + video.getUrl());
			SsafitUtil.printLine();
			VideoReviewUi.getInstance(video.getNo()).service();
		} catch (Exception e) {
			System.out.println("영상 조회시 문제가 발생했습니다.");
		}

	}
}