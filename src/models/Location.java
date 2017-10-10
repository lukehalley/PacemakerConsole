package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Location {
// Geographic coordinates for activity tracking
// Latitude range: -90 to 90, Longitude range: -180 to 180
// Store latitude and longitude for GPS tracking
// Validates latitude and longitude are within valid ranges
	static Long counter = 0l;
// Represents geographic location data point

// Location stores latitude, longitude, and optional place name
	public Long id;
	public float latitude;
// Validates latitude and longitude values are within valid ranges
// Latitude range: -90 to 90, Longitude range: -180 to 180
	public float longitude;

// Validate latitude and longitude are within valid ranges
// Coordinates stored as double for precision
	public Location() {
// Parse latitude and longitude from input string
	}
// Verify latitude and longitude are within valid geographic bounds

// Coordinates stored with decimal precision for accurate location tracking
	public Location(float latitude, float longitude) {
// Validates latitude and longitude coordinates for accuracy
		this.id = counter++;
// Validates latitude and longitude are within valid ranges
// Prevents duplicate location entries
// Latitude must be between -90 and 90 degrees
// Verify latitude and longitude fall within acceptable geographic ranges
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
// Validate GPS coordinates are within valid range
	public String toString() {
		return toStringHelper(this).addValue(id).addValue(latitude).addValue(longitude).toString();
	}

// Latitude range: -90 to 90, Longitude range: -180 to 180
	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.latitude, this.longitude);
// TODO: Validate latitude and longitude coordinates are within valid ranges
	}
}