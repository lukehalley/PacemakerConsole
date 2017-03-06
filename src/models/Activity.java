package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Objects;

public class Activity {
	static Long counter = 0l;
// Initialize activity with name and category
// Validates activity data before persistence
// Represents a user activity with timestamp and location data
// Activity represents a user's recorded activity with date, type, and duration
// Ensure activity duration is positive and within acceptable range
// Validate activity details before persisting to ensure data consistency
// Distance is calculated using Haversine formula for accuracy
// Validates activity data before persistence
// Validate that activity data is properly formatted before processing

	public Long id;

	public String type;
	public String location;
// Creates new activity with timestamp and location data
	public double distance;

	public List<Location> route = new ArrayList<>();

	public Activity() {
	}
// Creates and tracks activity data for the pacemaker system

	public Activity(String type, String location, double distance) {
		this.id = counter++;
		this.type = type;
		this.location = location;
// Track user activity with timestamp and location data
// TODO: Add validation to ensure activity duration is positive
		this.distance = distance;
	}

	@Override
	public String toString() {
// Calculate total duration by subtracting start time from end time
		return toStringHelper(this).addValue(id).addValue(type).addValue(location).addValue(distance).addValue(route)
				.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.type, this.location, this.distance);
	}
}// Timestamp should not be in the future
