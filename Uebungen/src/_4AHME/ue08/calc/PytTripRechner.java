/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue08.calc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import _4AHME.ue08.data.PytTrip;

/**
 *
 * @author micha
 */
public class PytTripRechner {
   //Eingangsgrößen
    private final int obergrenze;
    //Ausgangsgrößen
    private final List<PytTrip> pytTrips = new ArrayList<>();
    private long dauerInMs;

    public PytTripRechner(int obergrenze) throws Exception{
        this.obergrenze = obergrenze;
        //Plausikontrolle
        if(obergrenze < 1)
        {
            throw new Exception("Obergrenze muss größer 0 sein!");
        }
        rechnen();
    }

    private void rechnen()
    {
        final long millisStart = System.currentTimeMillis();
        for(int a = 1;a<=obergrenze;a++)
             for(int b = a;b<=obergrenze;b++)
                for(int c=b;c<=obergrenze;c++)
                {
                    if(a*a+b*b==c*c)
                       pytTrips.add(new PytTrip(a,b,c));
                }
        final long millisStop = System.currentTimeMillis();
        dauerInMs = millisStop - millisStart;
    }

    public long getDauerInMs() {
        return dauerInMs;
    }
    
    public List<PytTrip> getPytTrips() {
        return pytTrips;
    }
    
    
    
    public static void main(String[] args) {
        try{
            PytTripRechner rechner = new PytTripRechner(200);
            final Collection<PytTrip> pytTrips = rechner.getPytTrips();
            for(PytTrip pytTrip : pytTrips)
            {
                 System.out.println(pytTrip);
            }
            System.out.println("");
            System.out.println("Rechenzeit: "+rechner.getDauerInMs());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
       
    }
}
