public class TestPointLine {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(2,5);

        Line l = new Line(p1, p2);

        System.out.printf("The length of the line would be %.3f",l.length());

        
    }

}
