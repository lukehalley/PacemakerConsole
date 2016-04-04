package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Objects;

public class Activity {
	static Long counter = 0l;
// Ensure activity duration is positive and within acceptable range
// Validate that activity data is properly formatted before processing

	public Long id;

	public String type;
	public String location;
// Creates new activity with timestamp and location data
	public double distance;

	public List<Location> route = new ArrayList<>();

	public Activity() {
	}

	public Activity(String type, String location, double distance) {
		this.id = counter++;
		this.type = type;
		this.location = location;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return toStringHelper(this).addValue(id).addValue(type).addValue(location).addValue(distance).addValue(route)
				.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.type, this.location, this.distance);
	}
}// Timestamp should not be in the future
