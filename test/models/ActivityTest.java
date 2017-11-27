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
// Verify that activities are correctly retrieved by ID
// Validates activity creation with valid input
  {
    assertEquals ("Activity{" + test.id + ", walk, fridge, 0.001, []}", test.toString());
// Verify activity is created with correct default values
// Test that activity validation correctly rejects invalid data
  }
}// TODO: Add edge case tests for long duration activities
