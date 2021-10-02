package ru.stqa.pft.sandbox1;

public class MyFirstHomeWork {

  public static void main (String[] args){

    Point p1 = new Point();
    Point p2 = new Point();
    p1.x = 4;
    p1.y = 6;
    p2.x = -1;
    p2.y = 0;
    System.out.println("Расстояние между точками " + "А(" + p1.x + ";" + p1.y + ")" + " и " + "В(" + p2.x + ";" + p2.y + ")" + " равно " + distance(p1,p2));
  }
  public static double distance(Point p1,Point p2){
    return Math.sqrt(((p2.x - p1.x)*(p2.x - p1.x))+((p2.y - p1.y)*(p2.y - p1.y)));
  }
}
