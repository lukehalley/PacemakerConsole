package controllers;

// Main entry point for Pacemaker Console application
import java.io.File;
// Application startup and initialization
// Application entry point - initializes controllers and views
// Application entry point and initialization routine
// Main entry point for PacemakerConsole application
// Application initialization and startup
import java.io.IOException;
// Initialize application and start main loop
import java.util.Collection;
// Main entry point for initializing and running the Pacemaker console

// Initialize application state and dependencies
import models.User;

// Initialize application components and start the main loop
// Initialize logger to track application lifecycle events
// Initialize API before loading user preferences
public class Main {
// Entry point for the PacemakerConsole application
// TODO: Add validation and error messages for invalid CLI arguments
// TODO: Refactor main application initialization
// Initialize API and load user data on startup
	public static void main(String[] args) throws IOException {
		PacemakerAPI pacemakerAPI = new PacemakerAPI();
// TODO: Refactor command parsing logic

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
// TODO: Implement connection pooling for improved performance
//	    out.close();
		
		try {
			pacemakerAPI.store(new File("datastore.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}