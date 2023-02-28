package test09_polymorphism3;

public class Test {
	public static void main(String[] args) {
		Subclass child = new Subclass();
		System.out.println(child.x);
		child.method();
		
			
		Superclass parent = child;
		System.out.println(parent.x);
		parent.method();
			
	
		
	}
	
}
