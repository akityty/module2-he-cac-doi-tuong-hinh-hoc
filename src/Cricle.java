public class Cricle extends Shape{
    private double radius = 1.0;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public Cricle(double radius,String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * this.getRadius() * this.getRadius();
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public String toString() {
        return " A Cricle with Radius = "+getRadius()+" which is a subclass of "+super.toString();
    }
}
