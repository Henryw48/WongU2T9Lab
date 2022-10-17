public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
    this.base = base;
    this.height = height; }

    public double hypotenuse() {
        return Math.sqrt((Math.pow(base, 2)) + (Math.pow(height,2)));

    RightTriangle triangle1 = new RightTriangle(3, 4);
    RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
    double hypotenuse1 = triangle1.hypotenuse();
    double hypotenuse2 = triangle2.hypotenuse();
    System.out.println(hypotenuse1);
    System.out.println(hypotenuse2);
    }
}
