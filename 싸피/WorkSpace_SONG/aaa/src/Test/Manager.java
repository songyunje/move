package Test;

public class Manager {
	private static Manager instance = new Manager();
	
	private Manager() {}
	
	public Manager getInstance() {
		return instance;
	}

}
