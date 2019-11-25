package com.cgw.uba.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("api")
public class App extends Application{

	
	
	public Set<Class<?>> getClasses(){
		
		final Set<Class<?>> resource = new HashSet<Class<?>>();
		
		getRestResourceClasses(resource);
		
		return resource;
		
	}
	
	
	
	public void getRestResourceClasses(Set<Class<?>> resource) {
		
		
		resource.add(com.cgw.uba.resources.AppResources.class);
	}
}
