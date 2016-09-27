package controllers;

import java.util.Collection;
import com.google.common.base.Optional;
import java.util.HashMap;
import java.util.Map;
import models.Activity;
import models.Location;
import models.User;

public class PacemakerAPI {
	private Map<Long, User> userIndex = new HashMap<>();
	private Map<String, User> emailIndex = new HashMap<>();
	private Map<Long, Activity> activitiesIndex = new HashMap<>();

	public PacemakerAPI() {
	}

	public Collection<User> getUsers() {
		return userIndex.values();
	}

	public void deleteUsers() {
		userIndex.clear();
		emailIndex.clear();
	}

	public User createUser(String firstName, String lastName, String email, String password) {
		User user = new User(firstName, lastName, email, password);
		userIndex.put(user.id, user);
		emailIndex.put(email, user);
		return user;
	}

	public User getUserByEmail(String email) {
		return emailIndex.get(email);
	}

	public User getUser(Long id) {
		return userIndex.get(id);
	}

	public void deleteUser(Long id) {
		User user = userIndex.remove(id);
		emailIndex.remove(user.email);
	}

	public void createActivity(Long id, String type, String location, double distance) {
		Activity activity = new Activity(type, location, distance);
		Optional<User> user = Optional.fromNullable(userIndex.get(id));
		if (user.isPresent()) {
			user.get().activities.put(activity.id, activity);
			activitiesIndex.put(activity.id, activity);
		}
	}

	public Activity getActivity(Long id) {
		return activitiesIndex.get(id);
	}

	public void addLocation(Long id, float latitude, float longitude) {
		Optional<Activity> activity = Optional.fromNullable(activitiesIndex.get(id));
		if (activity.isPresent()) {
			activity.get().route.add(new Location(latitude, longitude));
		}
	}
}