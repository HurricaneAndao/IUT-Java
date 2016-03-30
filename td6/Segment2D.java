package td6;
/*
Par Christophe Badet et Antoine Daigremont
*/

public class Segment2D implements Cloneable, FormeGeometrique2D
{
	
private Point2D p1;
private Point2D p2;

// Constructeur
public Segment2D(Point2D point1, Point2D point2)
{
    p1 = point1;
    p2 = point2;
}
	
    /* 
    -- Théorème de Pythagore --
    BC² = AB² + AC²
    BC = sqrt(AB² + AC²)
    BC = sqrt((B.x-A.x)² + (C.y-A.y)²)
    BC = sqrt((B.x - C.x)² + (B.y-C.y)²) 
    */

//Méthode longueur avec les coordonnées en paramètres
public float longueur() 
         {
             return p1.distance(p2.getX(), p2.getY());
	 }

//Méthode affiche
public void affiche()
{
    System.out.println("coordonnées p1 : ");
    p1.affiche();
    
    System.out.println("coordonnées p2 : ");
    p2.affiche();
    
    System.out.println("longueur = ");
    System.out.println(this.longueur());
}

//Méthode deplaceP1
public void deplaceP1(float dxP1, float dyP1)
{   
    p1.deplace(p1.getX()+dxP1, p1.getY()+dyP1);
}

//Méthode deplaceP2
public void deplaceP2(float dxP2, float dyP2)
{
    p1.deplace(p2.getX()+dxP2, p1.getY()+dyP2);
}

@Override
public boolean estIdentique(Object o)
{
    return(this.equals(o));  
}

@Override
public void deplace(float dx, float dy)
{
    p1.deplace(dx, dy);
    p2.deplace(dx, dy);
}

@Override
public Object clone() 
    {
        Object copie = new Segment2D((Point2D) p1.clone(), (Point2D) p2.clone()); 
        return(copie);
    }
}