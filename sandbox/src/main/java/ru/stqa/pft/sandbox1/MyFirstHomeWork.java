package ru.stqa.pft.sandbox1;

public class MyFirstHomeWork {

  public static void main (String[] args){

    Point p1 = new Point(4,6);
    Point p2 = new Point(-1,0);
    System.out.println("Расстояние между точками " + "А(" + p1.x + ";" + p1.y + ")" + " и " + "В(" + p2.x + ";" + p2.y + ")" + " равно " + p1.distance(p2));
  }

}
