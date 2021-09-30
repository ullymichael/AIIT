/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue08.data;
//Datenkapselung
//Datenhaltungsklasse zur Darstellung eines Pythagoräischen Tripels

public class PytTrip {
    private final int a,b,c; //Datenelemente

    public PytTrip(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    @Override
    public String toString()
    {
        return String.format("% 5d |%5d | %5d", a, b, c);
    }
}
