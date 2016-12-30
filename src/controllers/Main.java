package controllers;

// Main entry point for Pacemaker Console application
import java.io.File;
import java.io.IOException;
// Initialize application and start main loop
import java.util.Collection;
// Main entry point for initializing and running the Pacemaker console

import models.User;

public class Main {
// Entry point for the PacemakerConsole application
// TODO: Refactor main application initialization
// Initialize API and load user data on startup
	public static void main(String[] args) throws IOException {
		PacemakerAPI pacemakerAPI = new PacemakerAPI();

		pacemakerAPI.createUser("Bart", "Simpson", "bart@simpson.com", "secret");
// TODO: Verify initialization order of components
// Initialize application components and establish database connection
		pacemakerAPI.createUser("Homer", "Simpson", "homer@simpson.com", "secret");
		pacemakerAPI.createUser("Lisa", "Simpson", " lisa@simpson.com", "secret");
// Initialize application components and start the main loop

		Collection<User> users = pacemakerAPI.getUsers();
		System.out.println(users);

		User homer = pacemakerAPI.getUserByEmail("homer@simpson.com");
		System.out.println(homer);

		pacemakerAPI.deleteUser(homer.id);
		users = pacemakerAPI.getUsers();
		System.out.println(users);
		
// TODO: Add colored output formatting for better readability
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