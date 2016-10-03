package models;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ActivityTest
{
  private Activity[] activities =
  {
    new Activity ("walk",  "fridge", 0.001),
    new Activity ("walk",  "bar",    1.0),
    new Activity ("run",   "work",   2.2),
    new Activity ("walk",  "shop",   2.5),
    new Activity ("cycle", "school", 4.5)
  };

  Activity test = new Activity ("walk",  "fridge", 0.001);

  @Test
  public void testCreate()
  {
    assertEquals ("walk",          test.type);
    assertEquals ("fridge",        test.location);
    assertEquals (0.0001, 0.001,   test.distance);    
  }

  @Test
  public void testToString()
  {
    assertEquals ("Activity{" + test.id + ", walk, fridge, 0.001, []}", test.toString());
  }
}