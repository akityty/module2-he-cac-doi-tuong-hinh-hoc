public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);

        System.out.println("--------------------------------------------------------------");

        Cricle cricle = new Cricle();
        System.out.println(cricle);

        cricle = new Cricle(3.5);
        System.out.println(cricle);

        cricle = new Cricle(3.5,"blue",false);
        System.out.println(cricle);

        System.out.println("--------------------------------------------------------------");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.3,6.6);
        System.out.println(rectangle);

        rectangle = new Rectangle(4.4,5.5,"yellow",false);
        System.out.println(rectangle);

        System.out.println("--------------------------------------------------------------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(1.1);
        System.out.println(square);

        square = new Square(2.2,"pink",false);
        System.out.println(square);


    }
}
