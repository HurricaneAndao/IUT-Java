package td6;

public class TestVoyageReduit {
    public static void main (String args[])
    {
        Voyage monsupervoyage = new Voyage();
        monsupervoyage.saisir();
        monsupervoyage.afficheVoyage();
    
    
     Voyage voyage1 = new Voyage();
     Voyage voyage2 = new Voyage("Londres", "New-york", 3000, 1.5);
     Voyage voyage3 = new Voyage("San Francisco", "Tatooine", 1000, 3);
     
     VoyageReduit voyage_r1 = new VoyageReduit("Honolulu", "Asgard", 2000, 2.0, 0.50);
     VoyageReduit voyage_r2 = new VoyageReduit("LegoCity", "Chez Chuck Norris", 1500, 1.4, 0.50);
     
     Voyage voyTab[] = {voyage1, voyage2, voyage3, voyage_r1, voyage_r2};
     
     for(int i = 0; i < voyTab.length ; i++)
     {
         voyTab[i].afficheVoyage();
     }

    } 
    
}
