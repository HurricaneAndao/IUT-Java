/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td6;

import java.util.Scanner;

/*
TD2bis - Par C. Badet et A. Daigremont 
 */

public class ReelContraint {
    
    private final double min ; 
    private final double max ;
    private double val;
    
    
    // constructeur avec valeur moyenne
    public ReelContraint(double nbMin, double nbMax)
    {
        if(nbMin<=nbMax)
        {
            min = nbMin;
            max = nbMax;
        }
        else
        {
            min = nbMax;
            max = nbMin;
        }
    
        val = (nbMax+nbMin)/2;
    }
    
       // constructeur avec valeur en paramÃ¨tre
    public ReelContraint(double nbMin, double nbMax, double nvVal)
    {
        if(nbMin<=nbMax)
        {
            min = nbMin;
            max = nbMax;
        }
        else
        {
            min = nbMax;
            max = nbMin;
        }
    
        if (nvVal<min || nvVal>max)
        {
            System.out.println("Valeur incorrecte, valeur moyenne utilisÃ©e");
            nvVal = (nbMax+nbMin)/2;
            
        }
        val=nvVal;
    }
    
    // afficheur
     public void affiche()
    {
        System.out.println("valeur = " +val) ;
    }
     
    // Saisie de la valeur val
   public void saisie()
    {
        double nvVal;
        do
            {
                System.out.println("Veuillez saisir une valeur entre " +min +" et " +max +" : ") ;
                Scanner sc = new Scanner(System.in);
                nvVal = sc.nextDouble();
                
            }while(min > nvVal || max < nvVal);
    }

   //getter
    public double getVal() {return val;}
    public double getMin() {return min;}
    public double getMax() {return max;}
   
   //setter
    public void setVal(double nvVal) 
    {   if (nvVal>=min && nvVal<=max)val=nvVal;
        else System.out.println("Valeur incorrecte, ancienne valeur conservÃ©e");
    
    }
    
    
}






