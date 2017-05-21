package br.com.robertodebarba.jersey_example_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductDAO {

	private final List<Product> products = new ArrayList<>();

	public ProductDAO() {
		this.products.add(new Product(1, "Sabonete", "Sabonete Dove pele macia", 10, 4.5));
		this.products.add(new Product(2, "Pão", "Pào 7 grãos", 20, 8.5));
		this.products.add(new Product(3, "Doce", "Doce de banana", 5, 4.5));
		this.products.add(new Product(4, "Tomate", "Tomate fresco", 200, 0.5));
		this.products.add(new Product(5, "Laranja", "Laranja doce", 80, 0.25));
	}

	public Product[] getProducts() {
		return this.products.toArray(new Product[this.products.size()]);
	}

	public Optional<Product> getProduct(final int id) {
		return this.products.stream().filter(product -> product.getId() == id).findFirst();
	}

}
