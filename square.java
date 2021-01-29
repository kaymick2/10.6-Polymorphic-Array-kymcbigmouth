public class square extends shape {
  public double area(double length) {
    double area = Math.pow(length, 2);
    return area;
  }

  public double perimeter(double length) {
    double perimeter = (4 * length);
    return perimeter;
  }
}