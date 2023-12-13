import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args) { 
        DrawingContext dc = new DrawingContext(155, 225);
        Circle circle = new Circle("Circle 1", 69, 90, dc, 13, 1);
        Rectangle rectangle = new Rectangle("Rectangle 1", 110, 55, dc);

        ArrayList<Point> points = new ArrayList<>(); 
        points.add(new Point(0, 0));
        points.add(new Point(45, 85));
        points.add(new Point(100, 0));

        Polygon polygon = new Polygon("Polygon 1", 169, 110, dc, points);

        circle.open(); 
        rectangle.open(); 
        polygon.open();

        circle.move(50, 79);

        rectangle.resize(235, 140);
    
        dc.clearScreen();

        circle.draw(); 
        rectangle.draw(); 
        polygon.draw();

        circle.handleEvent("klik mouse");

        circle.close(); 
        rectangle.close(); 
        polygon.close();
    }
}