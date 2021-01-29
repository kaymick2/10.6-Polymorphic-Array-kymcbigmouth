import java.util.*;

class Main {
  public static void main(String[] args) {
    triangle triangleArea = new triangle();
    square sqArea = new square();
    hexagon hexArea = new hexagon();
    circle circArea=new circle();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a side length of a normal polygon");
    double length = input.nextDouble();
    wait(690);
    // make sure to update print statement for day 2
    System.out.println("I'm now going to put your side value into three shapes and output the area.");
    wait(690);
    System.out.println("your side length is: " + length);
    wait(690);
    System.out.println("The area of an equilateral triangle with side length " + length + " = " + triangleArea.area(length));
    wait(690);
    System.out.println("The area of a hexagon with side length " + length + " = " + hexArea.area(length));
    wait(690);
    System.out.println("The area of a square with side length " + length + " = " + sqArea.area(length));
    wait(690);;
    System.out.println("The area of a circle with side length "+ length+" = "+circArea.area(length));
    wait(690);
    System.out.println("The perimeter of an equilateral triangle with side length " + length + " = " + triangleArea.perimeter(length));
    wait(690);
    System.out.println("The perimeter of a hexagon with side length " + length + " = " + hexArea.perimeter(length));
    wait(690);
    System.out.println("The perimeter of a square with side length " + length + " = " + sqArea.perimeter(length));
    wait(690);;
    System.out.println("The circumference of a circle with radius "+ length+" = "+circArea.perimeter(length));
    wait(690);
    // polymorphic array time
    System.out.println("now to output them again but in a polymorphic array:");
    shape polyArray[] = new shape[4];
    polyArray[0] = new triangle();
    polyArray[1] = new hexagon();
    polyArray[2] = new square();
    polyArray[3] = new circle(); 
    String[] shapes=new String[4];
    shapes[0] ="triangle";
    shapes[1] ="hexagon";
    shapes[2] ="square";
    shapes[3] ="circle";
    for (int x = 0; x < 4; x++) {
      System.out.println("Area of "+shapes[x]+": ");
      System.out.println(polyArray[x].area(length));
      // day2
      System.out.println("Perimeter of "+shapes[x]+": ");
      System.out.println(polyArray[x].perimeter(length));
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