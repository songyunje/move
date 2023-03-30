package dao;

import java.sql.SQLException;
import java.util.List;

import dto.Video;

public interface VideoDao {
	//전체 게시글을 몽땅 들고 오쎄용
	public List<Video> selectAll();
	
	//ID에 해당하는 게시글 하나 가져오기
	public Video selectOne(String id) throws SQLException;
	
	
}
