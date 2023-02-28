package Movie;

import java.util.Arrays;

public class MovieManager {
	private final int MAX_SIZE = 100; // final : 더이상 고칠 수 없는 상수
	
	private Movie[]  movieList = new Movie[MAX_SIZE];
	private int size =0; // 현재 영화의 수, 배열의 인덱스로 활용
	
	// 싱글턴
	// 1. private으로 자기 자신의 인스턴스 만들기
	// 2. 생성자를 private으로 막기
	// 3. 유일한 인스턴에 접근 가능한 getter 만들기
	
	private static MovieManager instance = new MovieManager();
	
	private MovieManager() {
		
	}
	
	public static MovieManager getInstance() {
		return instance;
	}
	
	public void add(Movie movie) {
		if(size < MAX_SIZE) {           // 현재 개수가 100개 미만이라면,
			movieList[size] = movie;
			size++;
		}
		else {
			System.out.println("더 이상 저장할 수 없어요");
		}
	}
	
	public Movie[] getList() {
		return Arrays.copyOfRange(this.movieList, 0, this.size);
	}
	
	public Movie searchByTitle(String title) {
		for(int i=0;i<size;i++) {
			if(movieList[i].getTitle().equals(title)) {
				return movieList[i];
			}
		}
		return null;
	}

}
