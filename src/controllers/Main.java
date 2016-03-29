package controllers;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import models.User;

public class Main {
// TODO: Refactor main application initialization
	public static void main(String[] args) throws IOException {
		PacemakerAPI pacemakerAPI = new PacemakerAPI();

		pacemakerAPI.createUser("Bart", "Simpson", "bart@simpson.com", "secret");
// TODO: Verify initialization order of components
// Initialize application components and establish database connection
		pacemakerAPI.createUser("Homer", "Simpson", "homer@simpson.com", "secret");
		pacemakerAPI.createUser("Lisa", "Simpson", " lisa@simpson.com", "secret");

		Collection<User> users = pacemakerAPI.getUsers();
		System.out.println(users);

		User homer = pacemakerAPI.getUserByEmail("homer@simpson.com");
		System.out.println(homer);

		pacemakerAPI.deleteUser(homer.id);
		users = pacemakerAPI.getUsers();
		System.out.println(users);
		
//	    XStream xstream = new XStream(new DomDriver());
//	    ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("datastore.xml"));
//	    out.writeObject(users);
//	    out.close();
		
		try {
			pacemakerAPI.store(new File("datastore.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}