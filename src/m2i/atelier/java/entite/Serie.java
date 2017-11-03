package m2i.atelier.java.entite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrateur
 */

public class Serie 
{
    private String titre;
    private int dateSortie ; 
    private int NbSaisons;
    private String synopsis;
    
    
    public void affiche(){
        System.out.println(titre + " " + dateSortie + " " + NbSaisons + " " + synopsis );
    }
    
    public void initialise( String titre, int dateSortie, int NbSaisons, String synopsis){
        this.titre = titre;
        this.synopsis = synopsis;
        this.dateSortie = dateSortie;
        this.NbSaisons = NbSaisons;
    }


/////////////////LES GET//////////////////
        public String getTitre(){
            return titre;
        }

        public int getDateSortie() {
            return dateSortie;
        }

        
        public int getNbSaisons() {
            return NbSaisons;
        }

        public String getSynopsis() {
            return synopsis;
        }
/////////////////////Les SET///////////////
        
        public void setTitre(String titre) {
            this.titre = titre;
        }

        public void setDateSortie(int dateSortie) {
            this.dateSortie = dateSortie;
        }

        
        public void setNbSaisons(int nbSaisons) {
            this.NbSaisons = nbSaisons;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

/////////////////////////////////////////////
        
}
