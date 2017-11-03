/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.test;

import com.sun.swing.internal.plaf.synth.resources.synth;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import m2i.atelier.java.entite.Synthetiseur;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SynthetiseurTEST {
    
//   @Test
   public void testVolumePlus(){
       Synthetiseur s1= new Synthetiseur();
       s1.VolumePlus();
       s1.affiche();
   }
   @Test
   public void testVolumeMoins(){
       Synthetiseur s1= new Synthetiseur();
       s1.initialise(true, "piano", 5, "do");
       s1.VolumeMoins();
       s1.affiche();
   }
    
    

    
//    @Test
    public void Test(){
        
        Synthetiseur s1 = new Synthetiseur();
        try {
            s1.JouerNote("do");
            s1.JouerNote("do");
            s1.JouerNote("do");
            s1.JouerNote("re");
            s1.JouerNote("mi");
            s1.JouerNote("re");
            s1.JouerNote("do");
            s1.JouerNote("mi");
            s1.JouerNote("re");
            s1.JouerNote("re");
            s1.JouerNote("do");
            
            
            
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(SynthetiseurTEST.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(SynthetiseurTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }  
    }
        

