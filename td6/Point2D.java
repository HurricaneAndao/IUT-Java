package td6;

public class Point2D implements Cloneable, FormeGeometrique2D
{

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Point2D(float x, float y) { this.x = x; this.y = y; }
    
    @Override
    public void deplace(float dx, float dy) { x += dx; y += dy; }

    public void affiche() { System.out.println("coord = " + x + " " + y ); }
    
    @Override
    public boolean equals(Object other) {
       //a.equals(null) doit toujours retourner false
       if (other == null) 
       {
            return false; 
       }
       
       //On teste la constance du hashcode
       if (this == other) 
       {
            return true;
       }
       
       if (getClass() != other.getClass()) 
       {
            return false; // On vérifie le type de other
       }
       
       //On teste les coordonnées X et Y pour vérifier qu'elles sont égales
       Point2D secondPoint = (Point2D) other;
       return this.x == secondPoint.x && this.y == secondPoint.y;
    }
    
    // Copie profonde de l'objet par la redéfinition de la méthode clone()
    @Override
    public Object clone() 
    {
        Object copie = new Point2D(this.x, this.y); 
        return(copie);
    }
    
    @Override
    public boolean estIdentique(Object o)
    {
        return(this.equals(o));  
    }
    
    public float distance(float x2, float y2)
    {
        return (float) Math.sqrt(((this.getY() - y2)*(this.getY() - y2)) + ((this.getX() - x2)*(this.getX() - x2)));
    }

    private float x, y;
}
