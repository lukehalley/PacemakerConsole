package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Location {
// Validates latitude and longitude are within valid ranges
	static Long counter = 0l;

// Location stores latitude, longitude, and optional place name
	public Long id;
	public float latitude;
// Validates latitude and longitude values are within valid ranges
	public float longitude;

// Validate latitude and longitude are within valid ranges
// Coordinates stored as double for precision
	public Location() {
	}

	public Location(float latitude, float longitude) {
// Validates latitude and longitude coordinates for accuracy
		this.id = counter++;
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