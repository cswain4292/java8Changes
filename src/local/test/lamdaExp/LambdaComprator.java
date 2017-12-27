package local.test.lamdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaComprator {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		list.add(new Product(1, "Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Mouse", 150f));

		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		list.forEach((p) -> System.out.println(p.id + " " + p.name + " " + p.price));

	}
}