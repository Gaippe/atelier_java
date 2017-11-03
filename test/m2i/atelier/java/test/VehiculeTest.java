/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.test;

import m2i.atelier.java.entite.Avion;
import m2i.atelier.java.entite.SousMarin;
import m2i.atelier.java.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class VehiculeTest {
    
//    @Test
//    public void NouveauVehicule(){
//        Vehicule vehic1 = new Vehicule("Ferrari", true, "G500", "rouge", 2, 0, 0, 0, 5);
//        vehic1.avancer();
//        vehic1.affiche();
//        
//        Vehicule vehic2 = new Vehicule("Renault", false, "Clio 4", "Blanche", 5, 0, 0, 0, 59 );
//        vehic2.avancer();
//        vehic2.avancer();
//        vehic2.affiche();
//        
//        Vehicule vehic3 = new Vehicule("Seat", true, "Leon", "Maroon", 5, 5, 5, 5, 0);
//        vehic3.avancer();
//        vehic3.affiche();
    

//    @Test    
//    public void testAvion(){
//        
//          Avion a = new Avion("bouin", true, "457", "blanche", 200, 0, 0, 0, 800);
//          a.avancer();
//          a.avancer();
//          a.affiche();
//    }
    
    @Test
    public void testSousMarin(){
        SousMarin sm = new SousMarin("NASA", true, "Strof", "gris", 40, 0, 0, 0, 10, false);
        sm.avancer();
            sm.affiche();
        sm.avancer();
            sm.affiche();
        sm.setMonte(true);
        sm.avancer();
            sm.affiche();
    }
    
}
