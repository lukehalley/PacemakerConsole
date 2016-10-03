package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LocationTest
{
  private Location one;
  private Location two;

  @Before
  public void setup()
  {
    one = new Location(23.3f, 33.3f);
    two = new Location(34.4f, 22.2f);
  }

  @After
  public void tearDown()
  {
    one = two = null;
  }

  @Test
  public void testCreate()
  {
    assertEquals (0.01, 23.3f, one.latitude);
    assertEquals (0.01, 33.3f, one.longitude);
  }

  @Test
  public void testIds()
  {
    assertNotEquals(one.id, two.id);
  }

  @Test
  public void testToString()
  {
    assertEquals ("Location{2, 23.3, 33.3}", one.toString());
  }
}