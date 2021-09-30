/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue04;

/**
 *
 * @author micha
 */
public class QuaGlRechner {
    //Eingangsgrößen
    private final double a,b,c;
    //Ausgangsgrößen
    private double x1, x2;
    private int anzahl;

    public QuaGlRechner(double a, double b, double c) 
    throws Exception
    {
        this.a = a;
        this.b = b;
        this.c = c;
        if(a==0)
        {
             throw new Exception("Es liegt keine Quadratische Gleichung vor, weil a <0 ist!");
        }
        rechnen();
    }
    
    private void rechnen()
    throws Exception
    {
        double diskriminante, sqrt;
        diskriminante = b*b-4.0*a*c;
        if(diskriminante>0.0)
        {   
            WurzelRechner wurzelRechner = new WurzelRechner(diskriminante);
            sqrt = wurzelRechner.getSqrt();
            x2 = (-1.0*b+sqrt) / (2.0*a);
            x1 = (-1.0*b-sqrt) / (2.0*a);
            anzahl = 2;
        }
        if(diskriminante == 0)
        {
            x2 = (-1.0*b) / (2.0*a);
            x1 = x2;
            anzahl = 1;
            System.out.println(""+anzahl);
            System.out.println(""+x2);
        }
        
        if(diskriminante<0.0)
        {
            anzahl = 0;
        }
    }

    public int getAnzahl() {
        return anzahl;
    }

    public double getX1() 
    throws Exception
    {
        if(anzahl == 0)
        {
            throw new Exception("Es gibt keine reelen Lösungen.");
        }
        return x1;
    }

    public double getX2() 
    throws Exception
    {
        if(anzahl == 0 || anzahl == 1)
        {
           throw new Exception("Es gibt nur eine reele Lösung.");
        }
        return x2;
    }
    
    
        
    
}
