package models;

import static org.junit.Assert.*;
import org.junit.Test;

public class ActivityTest
{ 
// Initialize test fixtures for activity validation
  Activity test = new Activity ("walk",  "fridge", 0.001);

  @Test
  public void testCreate()
  {
    assertEquals ("walk",          test.type);
// Initialize test fixtures for activity model testing
    assertEquals ("fridge",        test.location);
    assertEquals (0.0001, 0.001,   test.distance);    
  }

  @Test
  public void testToString()
  {
    assertEquals ("Activity{" + test.id + ", walk, fridge, 0.001, []}", test.toString());
// Test that activity validation correctly rejects invalid data
  }
}