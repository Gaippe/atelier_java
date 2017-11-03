/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.test;

import m2i.atelier.java.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SerieTest {
    @Test
    public void nouveauFilm()
    {
        Serie s1 = new Serie();
        s1.initialise("Dexter", 2010 ,5, " BLABLABLA") ;
//        s1.setTitre (" dexter");
//        s1.setDateSortie(2017);
//        s1.setSynopsis("BLABLLLAALAZL");
//        s1.setNbSaisons(2);
        s1.affiche();
        
        Serie s2 = new Serie();
        s2.initialise("Superman", 2015, 5, "BLONLONLONLO");
//        s2.setTitre (" DDDD");
//        s2.setDateSortie(2010);
//        s2.setSynopsis("BLABLLLAALAZL");
//        s2.setNbSaisons(5);
        s2.affiche();
        
        
        
        
    }
    
}
