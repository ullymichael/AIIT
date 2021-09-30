/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue07.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author micha
 */
public class CollectionTester {
    public static void main(String[] args) 
    {
        //Collection-Objekt erstellen
        //Collection sind "generische" Klassen (englisch: generics)
        //Wrapper-Klasse Double (Integer, Char)
        final ArrayList<Double> zahlen = new ArrayList<>();
        for (int i=0;i<10;i++)
        {
            //final Double dZahl = new Double(zahl); //"boxing"
            zahlen.add(Math.random()*100);                        //"auto-boxing"
        }
        
        // "foreach-Schleife"
        for (Double zahl : zahlen)
            System.out.format("Zahl: %f%n", zahl); // Gib die Zahl aus
        // "boilerplate code" (heiße Herdplatte)
        /*final Iterator<Double> iterator = zahlen.iterator();
        while(iterator.hasNext()) // Solange noch weitere Zahlen in der Collection sind
        {
            final Double zahl = iterator.next(); //"auto-unboxing"
            System.out.format("Zahl: %f%n", zahl); // Gib die Zahl aus
        }*/
    }
}
