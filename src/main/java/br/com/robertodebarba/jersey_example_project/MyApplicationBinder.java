package br.com.robertodebarba.jersey_example_project;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class MyApplicationBinder extends AbstractBinder {

	@Override
	protected void configure() {
		bind(ProductDAO.class).to(ProductDAO.class);
	}

}