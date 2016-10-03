package controllers;

import java.io.IOException;
import java.util.Collection;

import models.User;

public class Main {
	public static void main(String[] args) throws IOException {
		PacemakerAPI pacemakerAPI = new PacemakerAPI(null);

		pacemakerAPI.createUser("Bart", "Simpson", "bart@simpson.com", "secret");
		pacemakerAPI.createUser("Homer", "Simpson", "homer@simpson.com", "secret");
		pacemakerAPI.createUser("Lisa", "Simpson", " lisa@simpson.com", "secret");

		Collection<User> users = pacemakerAPI.getUsers();
		System.out.println(users);

		User homer = pacemakerAPI.getUserByEmail("homer@simpson.com");
		System.out.println(homer);

		pacemakerAPI.deleteUser(homer.id);
		users = pacemakerAPI.getUsers();
		System.out.println(users);
	}
}