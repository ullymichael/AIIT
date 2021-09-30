/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue07.gui;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author micha
 */
//extends bedeutet ableiten 
//Wir leiten die Klasse von AbstractListModel ab. Sie enthält alles was in AbstractListModel entahlten it.
public class DoubleListModel extends AbstractListModel<Double>
{

    public DoubleListModel(List<Double> zahlen) {
        this.zahlen = zahlen;
    }
    
    private final List<Double> zahlen;
    @Override
    public int getSize() {
        return zahlen.size();
    }

    @Override
    public Double getElementAt(int index) {
        return zahlen.get(index);
    }
    
}
