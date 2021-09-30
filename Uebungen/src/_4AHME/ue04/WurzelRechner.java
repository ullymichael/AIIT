/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue04;

import java.util.Scanner;

/**
 *
 * @author micha
 */
public class WurzelRechner {
//Eingangsgrößen
private final double a;
//Ausgangsgrößen
private double sqrt;


    
    /**
     * Konstruktor zur Berechnung der Quadratwurzel mittels Näherungsverfahren von Heron
     * @param a: Zahl aus der die Wurzel gezogen wird
     * throws Exception: wenn x<0
     */
    public WurzelRechner(double a) 
    throws Exception
    {
        this.a = a;
        if(a<0)
        {
            throw new Exception("Fehler: Die Zahl muss größer als Null sein");
        }
        heron();
    }

    private void heron()
    {
        double xAlt, xNeu, diff;
        xAlt = a;
      
        do{
            xNeu = 0.5 * (xAlt + a/xAlt);
            diff = betrag(xAlt-xNeu);
            xAlt = xNeu;
        }while(diff>0.000000001);
        sqrt = xAlt;
    }
    
    private double betrag(double diff)
    {
        if(diff<0)
        {
            diff = diff * -1;
        }
       return diff;
    }
    
    public double getSqrt() {
        return sqrt;
    }
    
     public static void main(String[] args) 
     throws Exception{
       double a = 0;
       Scanner scan = new Scanner(System.in);
         System.out.print("a: "); 
         a = scan.nextDouble();
       WurzelRechner wurzelRechner =  new WurzelRechner(a);
       
       System.out.format("Wurzel: %.3f%n", wurzelRechner.getSqrt());
    }
}
