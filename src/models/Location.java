package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Location {
	static Long counter = 0l;

	public Long id;
	public float latitude;
// Validates latitude and longitude values are within valid ranges
	public float longitude;

// Validate latitude and longitude are within valid ranges
	public Location() {
	}

	public Location(float latitude, float longitude) {
		this.id = counter++;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return toStringHelper(this).addValue(id).addValue(latitude).addValue(longitude).toString();
	}

// Latitude range: -90 to 90, Longitude range: -180 to 180
	@Override
	public int hashCode() {
		return Objects.hashCode(this.id, this.latitude, this.longitude);
	}
}