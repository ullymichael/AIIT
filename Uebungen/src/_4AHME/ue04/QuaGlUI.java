/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue04;

import java.util.*;

/**
 *
 * @author micha
 */
public class QuaGlUI {
//Eingangsgrößen
private double a,b,c;
//Ausgangsgrößen
private double x1,x2,anzahl;
    public QuaGlUI() {
         try {
            eingabe();
            rechnen();
            ausgabe();

        } 
        catch (NoSuchElementException ex)
        {
            System.out.println("Fehler augetreten: Bitte Zahl eingeben!");
        }
        catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

    }
    
    private void eingabe()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quadratische Gleichung Rechner");
        System.out.println("==============================");
        System.out.print("a: "); 
        a = scan.nextDouble();
        System.out.print("b: "); 
        b = scan.nextDouble();
        System.out.print("c: "); 
        c = scan.nextDouble();
    }
    
    private void rechnen()
    throws Exception
    {
       
       final QuaGlRechner quaGlRechner = new QuaGlRechner(a,b,c);
       x1 = quaGlRechner.getX1();
       x2 = quaGlRechner.getX2();
       anzahl = quaGlRechner.getAnzahl();
    }
    
    private void ausgabe()
    {
        System.out.println("Ergebnisse");
        System.out.println("==========");
        if(anzahl==2)
        {  
        System.out.format("x1: %.3f%n", x1);
        System.out.format("x2: %.3f%n", x2); 
        }
        
        if(anzahl==1)
        {
           System.out.format("x1: %.3f%n", x1); 
        }
        
    }
    
    public static void main(String[] args) {
        new QuaGlUI();
    }
}
