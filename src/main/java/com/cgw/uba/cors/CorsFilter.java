package com.cgw.uba.cors;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;


@Provider
public class CorsFilter implements ContainerResponseFilter{

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext response)
			throws IOException {
		
			response.getHeaders().add("Access-Control-Allow-Origin", "*");
			response.getHeaders().add("Access-Control-Allow-Credentials", "true");
			response.getHeaders().add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization");
			response.getHeaders().add("Access-Control-Allow-Methods", "OPTIONS,GET,POST,PUT,DELETE,PATCH");
		
		
	}
	
	
	

}


