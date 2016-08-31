/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

import javax.swing.JLabel;

/**
 *
 * @author Owen Figueroa
 */
public abstract class Ficha extends JLabel{
    public int turno;
    
    public Ficha(int turno){
        super();
        this.turno = turno;        
    }
    
    public final int getTurno(){
        return turno;
    }
    
    public abstract boolean validarMove(int x, int y, int x1, int y1);
    public abstract String icon();
}
