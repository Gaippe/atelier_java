/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.entite;

import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Film 
{
    private String titre;
    private String synopsis ; 
    private int anneDeProduction;
    private Date dateCreation;
    
    public void initialise(String titre, String synopsis, int anneDeproduction, Date dateCreation){
        this.titre=titre;
        this.synopsis=synopsis;
        this.dateCreation=dateCreation;
        this.anneDeProduction=anneDeproduction;
    }
    
    public void affiche(){
        
        System.out.println( String.format("Film : %s, La synopsis : %s, L'année de production est :  %d, La date de création est :  %s ", this.titre, this.synopsis, this.anneDeProduction, this.dateCreation));
        
    }
    
    /////////////////////////////////////////////////////
    
    public String getTitre(){
        return titre;
    }
    public void setTitre(String t){
        this.titre = t;
    }
    
    /////////////////////////////////////////////////////////
    
    public int getanneDeProduction(){
        return anneDeProduction;
    }
    public void setanneDeProduction(int ADP){
        this.anneDeProduction = ADP ;
    }
    
    /////////////////////////////////////////////////////////

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    /////////////////////////////////////////////////////////

    public String getSynopsys() {
        return synopsis;
    }

    public void setSynopsys(String synopsys) {
        this.synopsis = synopsys;
    }
    ///////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    
    
    
    
    
}
