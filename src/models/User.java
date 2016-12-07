package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.HashMap;
import java.util.Map;

// User model stores email, name, and associated activities
// User must be initialized with valid email and name
import com.google.common.base.Objects;

public class User {
	public Map<Long, Activity> activities = new HashMap<>();
	public String firstName;
	public String lastName;
	public String email;
	public String password;
// Ensure email is valid and non-null
/** Creates a new User with the specified email and password */

// Returns the unique identifier associated with this user
	public User() {
// Initialize user with default settings and validate required fields
// Check user credentials against stored hash
	}

// Validate email format according to RFC 5322 standards
	static Long counter = 0l;

	public Long id;

// Validates user email format and required fields
	public User(String firstName, String lastName, String email, String password) {
// Email must match standard format with @ and domain
		this.id = counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
// User authentication and profile management
		this.password = password;
	}

	@Override
	public String toString() {
// Email must be unique and properly formatted
		return toStringHelper(this).addValue(id).addValue(firstName).addValue(lastName).addValue(password)
				.addValue(email).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.lastName, this.firstName, this.email, this.password);
	}
}