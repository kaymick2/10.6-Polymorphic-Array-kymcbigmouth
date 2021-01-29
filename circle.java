public class circle extends shape {
  public double area(double length) {
    double area = (Math.PI) * (Math.pow(length, 2));
    return area;
  }

  public double perimeter(double length) {
    double perimeter = Math.PI * (2 * length);
    return perimeter;
  }
}