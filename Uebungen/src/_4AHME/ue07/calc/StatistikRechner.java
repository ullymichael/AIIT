/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue07.calc;

import java.util.ArrayList;

/**
 *
 * @author micha
 */

public class StatistikRechner {
    //Eingangsgrößen
    private ArrayList<Double> zahlen = new ArrayList<>();
    //Ausgangsgrößen
    private double standardabweichung;
    private double durchschnitt;
    
    public StatistikRechner(ArrayList<Double> zahlen) 
    throws Exception{
        this.zahlen = zahlen;
        
        if(zahlen.isEmpty()==true)
        {
            throw new Exception("Es wurden keine Zahlen eingegeben");
        } 
        rechnen();
    }
    
    private void rechnen()
    {
        double summe = 0.0;
        int anzahl = zahlen.size();
        for (Double zahl : zahlen)
        {
            summe+=zahl;
        }
        durchschnitt = summe/anzahl;
        
        summe = 0.0;
         for (Double zahl : zahlen)
        {
            summe+= (zahl-durchschnitt) * (zahl-durchschnitt);
        }
         
         standardabweichung = Math.sqrt(summe/(anzahl-1));
            
    } 
    
    public double getStandardabweichung() {
        return standardabweichung;
    }

    public double getDurchschnitt() {
        return durchschnitt;
    }
    
    
    public static void main(String[] args) 
    {
        try{
            final ArrayList<Double> test = new ArrayList<>();
        for (int i=1;i<=4;i++)
        {
            //final Double dZahl = new Double(zahl); //"boxing"
            test.add((double)i);                        //"auto-boxing"
        }
        final StatistikRechner rechner = new StatistikRechner(test);
        System.out.println("Durchschnitt: "+rechner.getDurchschnitt());
        System.out.println("Standardabweichung: "+rechner.getStandardabweichung());
        }
        catch(Exception ex)
        {
            System.out.println("Fehler aufgetreten: "+ex.getMessage());
        }
        
        
    }

       
   
    
    
    
}
