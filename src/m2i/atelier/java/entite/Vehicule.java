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
public class Vehicule {
    
    protected String marque;
    protected boolean utilitaire;
    protected String modele;
    protected String couleur;
    protected int nbPlaces;
    protected int x, y ,z ;
    protected int vitesse;
    
    
    

    public Vehicule(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        this.marque = marque;
        this.utilitaire = utilitaire;
        this.modele = modele;
        this.couleur = couleur;
        this.nbPlaces = nbPlaces;
        this.x = x;
        this.y = y;
        this.z = z;
        this.vitesse = vitesse;
    }
    
    
    
    ///////////////////  Fonction Affiche //////////////////////////////////////
    public void affiche(){
            
        String txt = String.format("Vehicule : marque = %s utilitaire=%s modele=%s couleur=%s nombre de places= %d position=[%d, %d, %d], vitesse= %d", 
        this.marque, 
        this.utilitaire, 
        this.modele, 
        this.couleur, 
        this.nbPlaces, 
        this.x, 
        this.y, 
        this.z,
        this.vitesse);
        System.out.println(txt);
    }
    
    ///////////////////Fonction Avancer ///////////////////////////////////////
    public void avancer(){
    
            z = z + vitesse;
                 
    } 
    public void reculer(){
            z = z - vitesse;
    }
    
    
/////////////////////////   GET   //////////////////////////////////////////////
    public String getMarque() {
        return marque;
    }

    public boolean isUtilitaire() {
        return utilitaire;
    }

    public String getModele() {
        return modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public int getvitesse() {
        return vitesse;
    }
    ////////////////  SET  /////////////////////////////////////////////////////
       
    public void setvitesse( int vitesse ){
        this.vitesse = vitesse;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setUtilitaire(boolean utilitaire) {
        this.utilitaire = utilitaire;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    /////////////////////////////////////////////////////////////////////
    
    
    
    
}
