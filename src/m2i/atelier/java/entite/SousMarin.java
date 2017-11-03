/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.entite;

/**
 *
 * @author Administrateur
 */
public class SousMarin extends Vehicule {
    
    private boolean monte;
    

    public SousMarin(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse, boolean monte) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
        this.monte = monte;
        
    }

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }
       
    
    
    @Override
    public void avancer() {
        
        this.z=this.z + vitesse;
        if (monte){
            this.y =this.y+ vitesse;
        }
        else {
            this.y = this.y-vitesse ; 
        }
        
            
           
    }

    @Override
    public void affiche() {
        super.affiche(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void monter(){
        this.y = this.y + this.vitesse;
    }
    public void descendre(){
        this.y = this.y - this.vitesse;
    }
    
}
