package Test04_multiple_extends;

public class Test {
	public static void main(String[] args) {
		
		// 다형성
		DuckInterface d1 = new Duck();
		DuckInterface d2 = new UglyDuckling();
		DuckInterface d3 = new DonaldDuck();
		
		
		d1.playInnocnet();
		d2.playInnocnet();
		d3.playInnocnet();
		
		}

}
