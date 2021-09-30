/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue03;

import java.util.*;
/**
 *
 * @author micha
 */
public class QuadrantenUI {
    //Eingangsgrößen
    private double x,y;
    //Ausgangsgrößen
    private String meldung;
    private int quadrant;
    
    public QuadrantenUI()
    {
        try
        {
        eingabe();
        rechnen();
        ausgabe();
        }
        catch (NoSuchElementException ex)
        {
            System.out.println("Fehler augetreten: Bitte Zahl eingeben!");
        }
        catch(Exception ex) 
        {
         System.out.println("Fehler aufgetreten: " + ex.getMessage());
        }     
        
    }
   
    
    private void eingabe()
    {
        System.out.println("Quadrantenberechnung");
        System.out.println("====================");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: "); 
        x = scanner.nextDouble();
        System.out.print("y: "); 
        y = scanner.nextDouble();
    }
    
    private void rechnen()
    throws Exception{
        final QuadrantenRechner quadrantenRechner = new QuadrantenRechner(x, y);
        quadrant = quadrantenRechner.getQuadrant();
        meldung = quadrantenRechner.getMeldung();
    }
    
    private void ausgabe()
    {
        System.out.println("");
        System.out.println("Ergebnis:");
        System.out.println("========");
        System.out.println(""+meldung);
    }
    
    public static void main(String[] args) {
        new QuadrantenUI();
    }
}
