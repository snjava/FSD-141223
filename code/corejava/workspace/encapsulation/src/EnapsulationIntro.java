public class EnapsulationIntro {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(111);
		p1.setName("smart phone");
		p1.setPrice(12999);
		p1.setQty(5);
		
		System.out.println("Id : " + p1.getId());
		System.out.println("Name : " + p1.getName());
		System.out.println("Quantity : " + p1.getQty());
		System.out.println("Price : " + p1.getPrice());
		
	}
}

// DTO (Data Transfer Object), Entity, Bean, Encapsulated, POJO (Plain Old Java Object)
class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQty() {
		return quantity;
	}
	
	public void setId(int i) {
		id = i;
	}
	public void setName(String nm) {
		name = nm.toUpperCase();
	}
	public void setPrice(double p) {
		if(p<1) {
			System.out.println("Invalid Price");
			System.exit(0);
		}
		price = p;
	}
	public void setQty(int q) {
		quantity = q;
	}
}
