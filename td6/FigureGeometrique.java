package td6;

public abstract class FigureGeometrique {
    
    public abstract void homothetie(double coef);
    
    public abstract void rotation(double angle);
 
    public abstract void identite();
    
    public void affiche()
    {
        System.out.println("Je suis une figure géométrique de type : ");
        identite();
    }
    
    public static void afficheFigures(FigureGeometrique tableau[])
    {
        for(int i=0 ; i<tableau.length ; i++)
        {
            tableau[i].affiche();
        }
    }
    
    public static void homothetieFigures(FigureGeometrique tableau[], double coef)
    {
        for(int i=0 ; i<tableau.length ; i++)
        {
            tableau[i].homothetie(coef);
        }
    }
    
    public static void rotationFigures(FigureGeometrique tableau[], double angle)
    {
        for(int i=0 ; i<tableau.length ; i++)
        {
            tableau[i].rotation(angle);
        }
    }
}
