public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    @Override
    public String toString() {
        return "A Square with side = "+this.getWidth()+" Which is a subclass of "+ super.toString();
    }
}
