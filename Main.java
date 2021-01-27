import java.util.*;

class Main {
  public static void main(String[] args) {
    triangle triangleArea = new triangle();
    square sqArea = new square();
    hexagon hexArea = new hexagon();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a side length of a normal polygon");
    double length = input.nextDouble();
    wait(690);
    // make sure to update print statement for day 2
    System.out.println("I'm now going to put your side value into three shapes and output the area.");
    wait(690);
    System.out.println("your side length is: " + length);
    wait(690);
    System.out
        .println("The area of an equilateral triangle with side length " + length + " = " + triangleArea.area(length));
    wait(690);
    System.out.println("The area of a hexagon with side length " + length + " = " + hexArea.area(length));
    wait(690);
    System.out.println("The area of a square with side length " + length + " = " + sqArea.area(length));
    wait(690);
    // polymorphic array time
    System.out.println("now to output them again but in a polymorphic array:");
    shape polyArray[] = new shape[3];
    polyArray[0] = new triangle();
    polyArray[1] = new hexagon();
    polyArray[2] = new square();
    for (int x = 0; x <  3; x++){
      System.out.println(polyArray[x].area(length));
    }

  }

  public static void wait(int ms) {
    try {
      Thread.sleep(ms);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}