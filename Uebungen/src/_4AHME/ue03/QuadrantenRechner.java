/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue03;

/**
 * Rechnerklasse zur Berechnung eines Quadranten
 *
 * @author michael ully
 */
public class QuadrantenRechner {
    //Eingangsgrößen
    private final double x,y;
    //Ausgangsgrößen
    private int quadrant;
    private String meldung;

    /**
     * Erzeugt ein ein Objekt der Klasse QuadrantenRechner
     * 
     * @param x
     * @param y 
     */
    public QuadrantenRechner(double x, double y)
   throws Exception {
        this.x = x;
        this.y = y;
        if(y==0&&x==0)
            throw new Exception("Fehler: Es dürfen nicht beide Koordinaten 0 sein.");
        rechnen();
    }
    
    private void berechneQuadrant()
    {
        if((y >0.0)&&(x > 0.0))
            quadrant = 1;
            if(y > 0 && x < 0)
                quadrant = 2;
             if(y <0&& x < 0)
                 quadrant = 3;
                  if(y <0 && x >0)
                      quadrant= 4;
                   if(y==0)
                       quadrant = 5;
                         if(x==0)
                             quadrant = 6;
     }
    
    private void berechneMeldung()
    {
        switch(quadrant)
        {
            case 1: meldung= "Punkt liegt im 1. Quadranten";break;
            case 2: meldung= "Punkt liegt im 2. Quadranten";break;
             case 3: meldung= "Punkt liegt im 3. Quadranten";break;
              case 4: meldung= "Punkt liegt im 4. Quadranten";break;
               case 5: meldung= "Der Punkt liegt auf der X-Achse";break;
               case 6: meldung= "Der Punkt liegt auf der Y-Achse";break;
        }
        
       
    }
    
    
    
    private void rechnen()
    {
        berechneQuadrant();
        berechneMeldung();
    }

    public int getQuadrant() {
        return quadrant;
    }

    public String getMeldung() {
        return meldung;
    }
    
    
}
