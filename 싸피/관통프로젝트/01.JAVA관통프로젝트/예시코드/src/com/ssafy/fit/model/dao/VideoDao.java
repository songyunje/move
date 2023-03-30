package com.ssafy.fit.model.dao;

import java.util.List;

import com.ssafy.fit.model.Video;

public interface VideoDao {
	List<Video> selectVideo() throws Exception ;

	Video selectVideoByNo(int no) throws Exception;
}