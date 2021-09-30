/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue08.gui;

import java.util.ArrayList;

import java.util.List;
import javax.swing.AbstractListModel;
import _4AHME.ue08.data.PytTrip;

/**
 *
 * @author micha
 */
public class PytTripListModel extends AbstractListModel<PytTrip>{

    private final List<PytTrip> pytTrips;

    public PytTripListModel(List<PytTrip> pytTrips) {
        this.pytTrips = pytTrips;
    }

    PytTripListModel(ArrayList<PytTrip> arrayList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public int getSize() {
        return pytTrips.size();
    }

    @Override
    public PytTrip getElementAt(int index) {
        return pytTrips.get(index);
    }
    
}
