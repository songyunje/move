package com.ssafy.fit.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.fit.model.VideoReview;

public class VideoReviewDaoImpl implements VideoReviewDao {

	private static int reviewNo = 0;
	private Map<Integer, List<VideoReview>> videoReviewDb = new HashMap<>();
	
	private static VideoReviewDaoImpl instance;
	
	private VideoReviewDaoImpl() {}
	
	public static VideoReviewDaoImpl getInstance() {
		if (instance == null) instance = new VideoReviewDaoImpl();
		
		return instance;
	}
	
	@Override
	public int insertReview(VideoReview videoReview) {
		int videoNo = videoReview.getVideoNo();
		videoReview.setReviewNo(++reviewNo);
		List<VideoReview> list = videoReviewDb.get(videoNo);
		if (list == null) {
			list = new ArrayList<>();
		}
		list.add(videoReview);
		videoReviewDb.put(videoNo, list);
		return 1;
	}

	@Override
	public List<VideoReview> selectReview(int videoNo) {
		return videoReviewDb.get(videoNo);
	}
}