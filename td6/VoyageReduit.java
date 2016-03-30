/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td6;

public class VoyageReduit extends Voyage {
    public VoyageReduit(String uneVilleDepart, String uneVilleArrivee, double uneLongueur, double unPrixKm, double unTauxPromotion){
        super(uneVilleDepart, uneVilleArrivee, uneLongueur, unPrixKm );
        tauxPromotion=new ReelContraint (0.01, 0.99, unTauxPromotion); 
    } 

    public void afficheVoyage()
    {
        super.afficheVoyage();
        System.out.println("Taux de réduction : " + tauxPromotion.getVal());
        System.out.println("Prix net : " + this.getPrix());
    }
    
    public void setTauxPromotion(double unTauxPromotion){
        ReelContraint txpm = new ReelContraint(0.01, 0.99, unTauxPromotion);
        tauxPromotion=txpm;
    }
    
    public double getPrix(){
        return (super.getPrixKm()*(tauxPromotion.getVal()));  
    }
    
    public void saisir(){
        super.saisir();
        System.out.println("Saisissez un taux promotionnel : ");
        double unTxPromo = Clavier.lireDouble();
        this.setTauxPromotion(unTxPromo);
    }
    
    private ReelContraint tauxPromotion;       
}
    
