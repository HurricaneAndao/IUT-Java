package td6;


/*
TD2bis - Par C. Badet et A. Daigremont 
 */


public class Voyage {
    private String villeDepart = new String("villeDepart");
    private String villeArrivee = new String("villeArrivee");
    private ReelContraint longueur = new ReelContraint(1, 30000);
    private ReelContraint prixKm = new ReelContraint(0.05, 3.2, 1);
    private final int MIN_LONGUEUR = 1;
    private final int MAX_LONGUEUR = 3000;
    private final double MIN_PRIX_KM = 0.05;
    private final double MAX_PRIX_KM = 3.2;
    
    //constructeur paramÃ©trÃ©
    public Voyage (String uneVilleDepart, String uneVilleArrivee, double uneLongueur, double unPrixKm)
    {
        villeDepart = uneVilleDepart;
        villeArrivee = uneVilleArrivee;
        longueur = new ReelContraint(MIN_LONGUEUR,MAX_LONGUEUR,uneLongueur); 
        prixKm = new ReelContraint(MIN_PRIX_KM,MAX_PRIX_KM,unPrixKm);
        
    }
    
    //constructeur non-paramétré
    public Voyage()
    {
        villeDepart = "Lyon";
        villeArrivee = "Lyon";
        longueur = new ReelContraint(MIN_LONGUEUR,MAX_LONGUEUR,15000); 
        prixKm = new ReelContraint(MIN_PRIX_KM,MAX_PRIX_KM,1);
    }
    
    //Afficheur
     public void afficheVoyage()
    {
              System.out.println("Les données du voyage sont : \n ville de départ : " +villeDepart 
                            + " ville d'arrivée : " +villeArrivee + " distance : " +getLongueur() 
                            +" prix au km : " +getPrixKm());
    }
     
     
    //Getteurs
    public String getVilleDepart(){
        return villeDepart;
    }
    
    public String getVilleArrivee(){
        return villeArrivee;
    }
    
    public double getLongueur(){
        return longueur.getVal();
    }
    
    public double getPrixKm(){
        return prixKm.getVal();
    }
    
    public Voyage comparatifLong (Voyage voyagedis01, Voyage voyagedis02)
    {
       if (voyagedis01.getVilleDepart()==voyagedis02.getVilleDepart() && voyagedis01.getVilleArrivee()==voyagedis02.getVilleArrivee())
       {
           if (voyagedis01.getLongueur()<voyagedis02.getLongueur())
               return(voyagedis01);
           else {
               return(voyagedis02);
           }
       }
       else return (null);
          
       
    }

    public Voyage comparatifPrix(Voyage voyagedis01, Voyage voyagedis02)
    {
       if (voyagedis01.getVilleDepart()==voyagedis02.getVilleDepart() && voyagedis01.getVilleArrivee()==voyagedis02.getVilleArrivee())
       {
           if ((voyagedis01.getLongueur())*(voyagedis01.getPrixKm())<(voyagedis02.getLongueur())*(voyagedis02.getPrixKm()))
               return(voyagedis01);
           else {
               return(voyagedis02);
           }
       }
       else return (null);
          
       
    }
   //Setteurs
       public void setVilleDepart(String uneVilleDepart) 
    {   
        villeDepart=uneVilleDepart;
    }
       
        public void setVilleArrivee(String uneVilleArrivee) 
    {   
        villeArrivee=uneVilleArrivee;
    }
        
        public void setLongueur(ReelContraint uneLongueur) 
    {   
        longueur=uneLongueur;
    }
        
        public void setPrixKm(ReelContraint unPrixKm) 
    {   
        prixKm=unPrixKm;
    }
        
// Testeur de voyage jumeau (mÃªme dÃ©part, mÃªme arrivÃ©e)
      public boolean jumeau (Voyage testvoy)
    {
        if(this.villeDepart.equals(testvoy.villeDepart) && this.villeArrivee.equals(testvoy.villeArrivee))
                {
                    return true;
                }
        else return false;
    }  
        
// saisir voyage
      public void saisir()
      {
          System.out.println("Saisissez une ville de départ : ");
          String villed = Clavier.lireString();
          this.setVilleDepart(villed);
          System.out.println("Saisissez une ville d'arrivée : ");
          String villea = Clavier.lireString();
          this.setVilleArrivee(villea);
          System.out.println("Saisissez une longueur : ");
          double uneLongueur = Clavier.lireDouble();
          ReelContraint val = new ReelContraint(MIN_LONGUEUR, MAX_LONGUEUR, uneLongueur);
          this.setLongueur(val);
          System.out.println("Saisissez un prix au km : ");
          double unPrixKm = Clavier.lireDouble();
          ReelContraint valkm = new ReelContraint(MIN_LONGUEUR, MAX_LONGUEUR, unPrixKm);
          this.setPrixKm(valkm);
      }
}



    



