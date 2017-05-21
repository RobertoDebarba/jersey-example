package br.com.robertodebarba.jersey_example_project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("product")
public class ProductApi {

	private static ProductDAO productDAO = new ProductDAO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProducts() {
		final Product[] products = ProductApi.productDAO.getProducts();

		if (products.length < 1) {
			return Response.noContent().build();
		}

		return Response.ok().entity(products).build();
	}
}
