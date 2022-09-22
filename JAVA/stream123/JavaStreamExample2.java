package stream123;
import java.util.*;

class Prodcut{
	int id;
	String name;
	float price;
}
public class JavaStreamExample2 {
	public static void main(String args[]) {
		List<Product>productsList = new ArrayList<Product>();
		productsList.add(new Product(1,"HP Laptop",25000f));
		productsList.add(new Product(2,"Dell Laptop",25000f));
		productsList.add(new Product(3,"Lenovo Laptop",25000f));
		productsList.add(new Product(4,"Sony Laptop",25000f));
		productsList.add(new Product(5,"Apple Laptop",25000f));
		Float totalPrice =productsList.stream().map(product->product.price).reduce(0.0f,Float::sum);
		System.out.println(totalPrice);
	}

}
