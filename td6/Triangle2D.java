package td6;

/*
Compteur.java

Par Christophe Badet et Antoine Daigremont
*/

public class Triangle2D implements Cloneable, FormeGeometrique2D{
	
    private Segment2D seg1;
    private Segment2D seg2;
    private Segment2D seg3;

    
// Constructeur
    public Triangle2D(Point2D p1, Point2D p2, Point2D p3)
    {
	seg1 = new Segment2D(p1,p2);
	seg2 = new Segment2D(p1,p3);
	seg3 = new Segment2D(p2,p3);
    }

    public float perimetre()
    {
        return seg1.longueur() + seg2.longueur() + seg3.longueur();
    }

    public float aire()
    {
        float p = perimetre() / 2.0f;
        return (float) Math.sqrt(p * (p - seg1.longueur())  * (p - seg2.longueur())  * (p - seg3.longueur()));
    }
    
    @Override
    public boolean estIdentique(Object o)
    {
        return(this.equals(o));  
    }

    @Override
    public void deplace(float dx, float dy)
    {
        seg1.deplace(dx, dy);
        seg2.deplace(dx, dy);
        seg3.deplace(dx, dy);
    }

    @Override
    public Object clone() 
    {
        Object copie = new Triangle2D((Point2D) p1.clone(), (Point2D) p2.clone()); 
        return(copie);
    }
}
