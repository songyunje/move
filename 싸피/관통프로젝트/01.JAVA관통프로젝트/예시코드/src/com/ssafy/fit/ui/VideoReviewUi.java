package com.ssafy.fit.ui;

import java.util.Collections;
import java.util.List;

import com.ssafy.fit.model.VideoReview;
import com.ssafy.fit.model.dao.VideoReviewDao;
import com.ssafy.fit.model.dao.VideoReviewDaoImpl;
import com.ssafy.fit.util.SsafitUtil;

public class VideoReviewUi {
	private VideoReviewDao videoReviewDao;

	private static VideoReviewUi instance;

	private int videoNo;
	private VideoReviewUi(int videoNo) {
		videoReviewDao = VideoReviewDaoImpl.getInstance();
		this.videoNo = videoNo;
	}

	public static VideoReviewUi getInstance(int videoNo) {
		if (instance == null)
			instance = new VideoReviewUi(videoNo);

		return instance;
	}
	
	public void service() {
		while (true) {
//			su.screenClear();
			listReview();
			
			System.out.println("1. 리뷰등록");
			System.out.println("0. 이전으로");
			SsafitUtil.printLine();
			switch (SsafitUtil.input("메뉴를 선택하세요 : ")) {
			case "1":
				registReview();
				break;
			case "0":
				return;
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}

	private void listReview() {
		try {
			List<VideoReview> list = videoReviewDao.selectReview(videoNo);
			if (list == null) {
				list = Collections.emptyList();
			}
			SsafitUtil.printLine();
			System.out.printf("영상리뷰 : %d개%n", list.size());
			SsafitUtil.printLine();
			if (!list.isEmpty()) {
				list.stream()
						.forEach(v -> System.out.printf("%2d %4s %s %n", v.getReviewNo(), v.getNickName(), v.getContent()));
	
				SsafitUtil.printLine();
			}
		} catch (Exception e) {
			System.out.println("리뷰 조회시 문제가 발생했습니다.");
		}
	}

	private void registReview() {
		VideoReview vr = new VideoReview();
		vr.setVideoNo(videoNo);
		vr.setNickName(SsafitUtil.input("닉네임을 입력하세요 : "));
		vr.setContent(SsafitUtil.input("내용을 입력하세요 : "));
		videoReviewDao.insertReview(vr);
	}
}