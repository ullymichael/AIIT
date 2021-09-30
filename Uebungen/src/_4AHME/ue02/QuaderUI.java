/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue02;

import java.util.*;

/**
 * UI-Klasse stellt eine textuelle UI Zur Quaderberrechnung zur Verfügung
 *
 * @author michael ullrich
 */
public class QuaderUI {

    //Eingangsgrößen
    private double laenge, breite, hoehe;
    //Ausgangsgrößen
    private double volumen, oberflaeche, raumdiagonale;

    public QuaderUI() {
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
            System.out.println("Fehler aufgetreten: " + ex.getMessage());
            ex.printStackTrace(); // Damit kann man genau nachvollziehen wo der Fehler aufgetereten ist
        }

    }

    private void eingabe() {
        System.out.println("Quaderberechnung");
        System.out.println("================");
        System.out.println("");
        //Eingabe der Eingangsgrößen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Laenge: ");
        laenge = scanner.nextDouble();
        System.out.print("Breite: ");
        breite = scanner.nextDouble();
        System.out.print("Höhe: ");
        hoehe = scanner.nextDouble();
    }

    private void rechnen()
            throws Exception {
        final QuaderRechner quaderRechner = new QuaderRechner(laenge, breite, hoehe);   // strg+ leertaste in die Klammern für Hilfe. Durch Dokumentationskommentar Infos zur eigenen Klassen.
        volumen = quaderRechner.getVolumen();
        oberflaeche = quaderRechner.getOberflaeche();
        raumdiagonale = quaderRechner.getRaumdiagonale();
    }

    private void ausgabe() {
        System.out.println("");
        System.out.println("Ergebnisse");
        System.out.println("==========");
        System.out.format("Volumen: %.3f%n", volumen);
        System.out.format("Oberflaeche: %.3f%n", oberflaeche);
        System.out.format("Raumdiagonale: %.3f%n", raumdiagonale);
    }

    public static void main(String[] args) {
        new QuaderUI(); //Namenloses Objekt
    }

}
