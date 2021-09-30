/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue01;
/**
 *
 * @author michael
 */
public class SpritRechnerTester {
    
    public static void main(String[] args) 
    {
        try // wird eine Exception geworfen werden wir aus dem try block geworfen
        {
        //Objekt der Klasse Spritrechner erstellen
        SpritRechner rechner = new SpritRechner(1000, -50.0);
        //Ausgabe
         System.out.println("Durchschnittsverbrauch: "+rechner.getDurchschnittsverbrauch());
        }
        
        catch (Exception ex)
        {
            System.out.println("Fehler aufgetreten: "+ ex.getMessage()); // Fehlermeldung der Exception kann mit der getter Methode get Message rausgeholt werden
        }
    }    
}
