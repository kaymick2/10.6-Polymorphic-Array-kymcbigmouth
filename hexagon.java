public class hexagon extends shape {
  public double area(double length) {
    double area = (((3 * (Math.sqrt(3)) / 2)) * Math.pow(length, 2));
    return area;
  }

  public double perimeter(double length) {
    double perimeter = (6 * length);
    return perimeter;
  }
}