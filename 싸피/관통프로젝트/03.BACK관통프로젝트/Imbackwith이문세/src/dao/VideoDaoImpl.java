package dao;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Video;
import util.DBUtil;

//싱글턴으로 만들어보자
public class VideoDaoImpl implements VideoDao {

	// DBUtil 가져와야함.
	private final DBUtil util = DBUtil.getInstance();

	private static VideoDaoImpl instance = new VideoDaoImpl();

	private VideoDaoImpl() {
	}

	public static VideoDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<Video> selectAll() {
		String sql = "SELECT * FROM Video";
		List<Video> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 2. 데이터베이스를 연결을 해야됨
		try {
			conn = util.getConnection();

			stmt = conn.createStatement();
			// 전체 값을 가져오는 SQL문 작성

			rs = stmt.executeQuery(sql);

			// DB에서 인덱스는 1부터시작이에요
			while (rs.next()) {
				Video Health = new Video();
				Health.setId(rs.getString("id")); // rs.getInt(1); 같은말
				Health.setTitle(rs.getString("title"));
				Health.setPart(rs.getString("part"));
				Health.setChannelName(rs.getString("channelName"));
				Health.setUrl(rs.getString("url"));
				Health.setImg(rs.getString("img"));

				list.add(Health);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 박태흠 정답~~ 스코프 이
			util.close(rs, stmt, conn);
		}
		return list;
	}

	@Override
	public Video selectOne(String id) throws SQLException {
		String sql = "SELECT * FROM Video WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Video Health = new Video();
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Health.setId(rs.getString("id")); 
				Health.setTitle(rs.getString("title"));
				Health.setPart(rs.getString("part"));
				Health.setChannelName(rs.getString("channelName"));
				Health.setUrl(rs.getString("url"));
				Health.setImg(rs.getString("img"));
			}

		} finally {
			util.close(rs, pstmt, conn);
		}

		return Health;
	}
}
