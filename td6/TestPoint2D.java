package td6;


public class TestPoint2D {
    public static void main (String args[])
    {
        Point2D p1 = new Point2D(5.0f, 4.0f);
        Point2D p2 = new Point2D(7.0f, 1.5f);
        Point2D p3 = new Point2D(5.0f, 4.0f);
    
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        
        Object p4 = p1.clone();
        System.out.println(p4.equals(p1));
        
        // Copie superficielle
        Object p5 = p1;
        System.out.println(p5.equals(p1));
        
    }
    
}
