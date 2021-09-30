package _4AHME.ue06;

// In folgendem Kommentar sollte stehen was die Klasse macht

import ue01.*;
// In folgendem Kommentar sollte stehen was die Klasse macht
/**
 * Klasse zum Berechnen des Durchschnittsverbrauchs pro 100 km Verwendetes
 * design pattern : "Rechnerklasse"
 *
 * @author michael ully :=)
 */
//design pattern : Entwurfsmuster
//Berechnung und EinAusgabe trennen
public class SpritRechner {

    //Eingangsgrößen
    private final double gefahreneKm;                 //Datenelemente, Eigenschaften, Attribute
    private final double verbrauchinLiter;
    //Ausgangsgrößen
    private double durchschnittsverbrauch;

    //Konstruktor: Wird immer aufgerufen, wenn ein neues Objekt der Klasse erstellt wird
    public SpritRechner(double gefahreneKm, double verbrauchinLiter)
    throws Exception // Exception könnte geworfen werden
    {
        this.gefahreneKm = gefahreneKm;
        this.verbrauchinLiter = verbrauchinLiter;
        if(gefahreneKm <= 0)
            throw new Exception("Gefahrene Km müssen größer als Null sein");
        if(verbrauchinLiter <= 0.0)
            throw new Exception("Verbrauch in Liter muss positiv sein");
        rechnen();
    }

    public double getDurchschnittsverbrauch() {
        return durchschnittsverbrauch;
    }

    private void rechnen() // Jede Methode hat auf alle Datenelemente Zugriff
    {
        durchschnittsverbrauch = verbrauchinLiter / gefahreneKm * 100.0;
    }

}
