/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java.test;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class VariablesTest {
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //@Test
    public void ex1() {
        String a = new String(" Jamaique ");
        String b = new String(" Kingston ");
        String c = b.toUpperCase() + a.toUpperCase();

        System.out.println(c);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //@Test
    public void ex4() 
    {
        
        int a = 4, racine;
        racine = a * a ; 
        
        System.out.println("la racine carré de A est égale à " + racine);
        
    }
    
    //@Test
    public void ex5() 
    {
        int n = 2, p = 4, puissance;
        puissance = n * (n*p);
        
        System.out.println("Le resultat de " +  n + " puissance "+ p+ " est égale à " + puissance );
    }
        
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //@Test
   // public void ex4()
//        {
//            System.out.println( carre(10));
//        }
//        public int carre(int nb)
//        {
//            int res = nb * nb;
//            return res;   
//        } 

        
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////     
//       @test
        public void ex2()
        {
        
        int a = 123  ;
        String b = new String ("Coucou ");
        String c ;
        c = a + " " + b ; 
        String d ; 
        d = b + a ; 
        
        System.out.println(" " + c + " " + d );

        }   
            
        
       ////////////////////////////////////////////////////////////////////////////////////////////////////
       ////////////////////////////////////////////////////////////////////////////////////////////////////
        //@test
        public void ex3 ()
        {
        int a = 10  ;
        String b = "20"; 
        int c = a + Integer.parseInt(b);
        System.out.println( "a + b = " + c + " et b + a = " + c  );
        }
        
        
        
       ////////////////////////////////////////////////////////////////////////////////////////////////////
       ////////////////////////////////////////////////////////////////////////////////////////////////////
        //@Test
        public void testConcatene()
        {
            String a = "MAISON" ;
            String b = "BLANCHE" ; 
            String c = concatene (a,b) ; 
            System.out.println( c );
        }    
        
        public String concatene(String a, String b){
            String c = a + ' ' + b ;
            return c ;

    }

        
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////
       ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
}
