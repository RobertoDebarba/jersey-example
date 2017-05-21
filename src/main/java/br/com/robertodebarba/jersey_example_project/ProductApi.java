package br.com.robertodebarba.jersey_example_project;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductApi {

	private ProductDAO productDAO = new ProductDAO();

	@GET
	public Response getProducts() {
		final Product[] products = this.productDAO.getProducts();

		if (products.length < 1) {
			return Response.noContent().build();
		}

		return Response.ok().entity(products).build();
	}

	@GET
	@Path("{productId}")
	public Response getProduct(@PathParam("productId") int productId) {
		final Optional<Product> product = this.productDAO.getProduct(productId);

		if (product.isPresent()) {
			return Response.ok().entity(product.get()).build();
		}

		return Response.noContent().build();
	}

	@PUT
	public Response insertProduct(Product product) {
		if (this.productDAO.insertProduct(product)) {
			return Response.ok().build();
		}

		return Response.status(Status.BAD_REQUEST).build();
	}

	@POST
	public Response updateProduct(Product product) {
		if (this.productDAO.updateProduct(product)) {
			return Response.ok().build();
		}

		return Response.status(Status.BAD_REQUEST).build();
	}

}
