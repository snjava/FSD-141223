public class ProductDetails {
	public static void main(String args[]) {
		Product p1 = new Product();
		Product p2 = new Product();
		System.out.println(p1);
		System.out.println(p2);
		p1.id = 123;
		p1.price = 200.2;
		p1.qty = 3;
		p2.printProductDetails();
	}
}
class Product
{
	int id;
	double price;
	int qty;
	public void printProductDetails() {
		double total = price * qty;
		System.out.println("Id : " + id);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + qty);
		System.out.println("Total Price : " + total);
	}
}