public class triangle extends shape {
  public double area(double length) {
    double area = (((Math.sqrt(3) / 4) * Math.pow(length, 2)));
    return area;
  }

  public double perimeter(double length) {
    double perimeter = (3 * length);
    return perimeter;
  }
}