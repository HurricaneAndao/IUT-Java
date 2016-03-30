package TD6;

/*
Compteur.java

Par Christophe Badet et Antoine Daigremont
*/

public class Rectangle2D {
	  
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;
    private Point2D p4;
    
    private float longueur;
    private float largeur;
    
// Constructeur
    public Rectangle2D(Point2D p1, float longueur, float largeur)
    {
	if(largeur > longueur)
        {
            float inv = largeur;
            largeur = longueur;
            longueur = inv; 
        }
        p2.setposition(p1.getX(), (p1.getY()+longueur));
        p3.setposition((p1.getX()+largeur), (p1.getY()+longueur));
        p4.setposition(p1.getX()+largeur, p1.getY());
    }

    public float perimetre()
    {
        return (this.longueur +  this.largeur)*2;
    }

    public float aire()
    {
        return this.longueur * this.largeur;
    }

    // getters et setters
    
    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
}    
