/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.test;

import java.util.Date;
import m2i.atelier.java.entite.Film;
import org.junit.Test;

/**import m2i.atelier.java.entite.Film;
import org.junit.Test;
import static org.junit.Assert.*;
 *
 * @author Administrateur
 */
public class FilmsTest {
    
    @Test
    public void nouveauFilm()
    {
        Date d = new Date();
        
        ////////////////////////////////////////////////////////////////////////
        Film f1 = new Film();
        f1.initialise("Dracula", "L'histoire d'un vampire", 2008, d);
        f1.affiche();
        
        ///////////////////////////////////////////////////////////////////////
        Film f2 = new Film();
        f2.initialise("Frankeinstein", "Histoire d'un homme défiguré", 2005, d);
        f2.affiche();
        
        //////////////////////////////////////////////////////////////////////
        
        
        
        
        
        System.out.println(f1.getanneDeProduction());
    }
    
}
