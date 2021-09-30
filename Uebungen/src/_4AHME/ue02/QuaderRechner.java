/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue02;

// Dokumentationskommentar
/**
 * Rechnerklasse zur Berechnung eines Quaders
 *
 * @author micha
 */
public class QuaderRechner {

    //Eingangsgrößen
    private final double laenge;
    private final double breite;
    private final double hoehe;
    //Ausgangsgrößen
    private double volumen;
    private double oberflaeche;
    private double raumdiagonale;
// /** + enter kommentar zu erklärung des Konstruktors wird erklärt = Dokumentationskommentar

    /**
     * Erzeugt ein Objekt der Klasse Quaderrechner
     *
     * @param laenge laenge des Quaders
     * @param breite breit des Quaders
     * @param hoehe hoehe des Quaders
     * @throws Exception Fehler bei unplausiblen Eingangsgrößen
     */
    public QuaderRechner(double laenge, double breite, double hoehe)
            throws Exception {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
        if (laenge <= 0.0) {
            throw new Exception("Fehler: Die Laenge muss größer als 0 sein!");
        }
        if (breite <= 0.0) {
            throw new Exception("Fehler: Die Breite muss größer als 0 sein!");
        }
        if (hoehe <= 0.0) {
            throw new Exception("Fehler: Die Hoehe muss größer als 0 sein!");
        }
        rechnen();
    }

    private void rechnen() {
        volumen = laenge * breite * hoehe;
        oberflaeche = 2 * (laenge * breite + laenge * hoehe + breite * hoehe);
        raumdiagonale = Math.sqrt(hoehe * hoehe + (laenge * laenge + breite * breite));
    }

    public double getVolumen() {
        return volumen;
    }

    public double getOberflaeche() {
        return oberflaeche;
    }

    public double getRaumdiagonale() {
        return raumdiagonale;
    }

}
