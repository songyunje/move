package com.ssafy.fit.model.dao;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.ssafy.fit.model.Video;

public class VideoDaoImpl implements VideoDao {

	private List<Video> list;
	private static VideoDaoImpl instance;
	
	private VideoDaoImpl() {
		try {
			Scanner sc = new Scanner(new File("data/video.json"));
			StringBuilder contents = new StringBuilder();
			while (sc.hasNextLine()) {
				contents.append(sc.nextLine() + "\r\n");
			}
			sc.close();
			list = Arrays.asList(new Gson().fromJson(contents.toString(), Video[].class));
		} catch(Exception e) {
			System.out.println("영상 파일 로딩시 에러가 발생했습니다.");
		}
	}
	
	public static VideoDaoImpl getInstance() {
		if (instance == null) instance = new VideoDaoImpl();
		
		return instance;
	}
	
	@Override
	public List<Video> selectVideo() throws Exception {
		if (list == null || list.isEmpty()) {
			throw new Exception("영상이 존재하지 않습니다.");
		}
		return list;
	}

	@Override
	public Video selectVideoByNo(int no) throws Exception {
		return list.stream().filter(v -> v.getNo() == no).findFirst().get();
	}
}