package models;

import static org.junit.Assert.*;

import org.junit.Test;
import static models.Fixtures.locations;

public class LocationTest
{ 
  @Test
  public void testCreate()
  {
    assertEquals (0.01, 23.3f, locations[0].latitude);
    assertEquals (0.01, 33.3f, locations[0].longitude);
  }

  @Test
  public void testIds()
  {
    assertNotEquals(locations[0].id, locations[1].id);
  }

  @Test
  public void testToString()
  {
    assertEquals ("Location{" + locations[0].id + ", 23.3, 33.3}", locations[0].toString());
  }
}