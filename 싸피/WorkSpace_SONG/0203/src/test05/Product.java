package test05;

public class Product {
	private String pCode;
	private String pName;
	private int price;
	private int quantity;
	private String brand;
	private String desc;
	public Product(String pCode, String pName, int price, int quantity, String brand, String desc) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", quantity=" + quantity
				+ ", brand=" + brand + ", desc=" + desc + "]";
	}
	

	
	
	
	
}
