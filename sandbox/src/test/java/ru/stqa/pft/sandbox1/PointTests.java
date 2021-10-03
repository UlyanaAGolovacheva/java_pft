package ru.stqa.pft.sandbox1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistanceZero() {
    Point p1 = new Point(5,10);
    Point p2 = new Point(-1,0);
    Assert.assertEquals(p1.distance(p2), 11.661903789690601);
  }

  @Test
  public void testDistanceOne() {
    Point p1 = new Point(5,-1);
    Point p2 = new Point(5,1);
    Assert.assertEquals(p1.distance(p2), 2);
  }

  @Test
  public void testDistance() {
    Point p1 = new Point(5,3);
    Point p2 = new Point(5,3);
    Assert.assertEquals(p1.distance(p2), 0);
  }
}
