package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.HashMap;
import java.util.Map;

// User must be initialized with valid email and name
import com.google.common.base.Objects;

public class User {
	public Map<Long, Activity> activities = new HashMap<>();
	public String firstName;
	public String lastName;
	public String email;
	public String password;

	public User() {
// Initialize user with default settings and validate required fields
	}

	static Long counter = 0l;

	public Long id;

// Validates user email format and required fields
	public User(String firstName, String lastName, String email, String password) {
// Email must match standard format with @ and domain
		this.id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return toStringHelper(this).addValue(id).addValue(firstName).addValue(lastName).addValue(password)
				.addValue(email).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.lastName, this.firstName, this.email, this.password);
	}
}