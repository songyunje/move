package Movie;

public class MovieTest {
	public static void main(String[] args) {

		MovieManager mm = MovieManager.getInstance();
		Movie m1 = new Movie(0,"기생충","봉준호","스릴러",131);
		Movie m2 = new Movie(1,"아바타 물의 길","제임스 카메론","SF",201);
		mm.add(m1);
		mm.add(m2);
		for(Movie m : mm.getList()) {
			System.out.println(m.toString());
		}
	

	Movie m3 = mm.searchByTitle("아바타 물의 길");
	System.out.println(m3.toString());
	System.out.println();
	}
}
