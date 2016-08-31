/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

/**
 *
 * @author Owen Figueroa
 */
public class Rey extends Ficha{

    public Rey(int turno) {
        super(turno);
    }

    @Override
    public boolean validarMove(int x, int y, int x1, int y1) {
        //x es posicion vieja y x1 posicion nueva
        return ((x-1)==x1 && (y-1)==y1) || ((x)==x1 && (y-1)==y1) || ((x+1)==x1 && (y-1)==y1) || ((x-1)==x1 && (y)==y1)
         || ((x+1)==x1 && (y)==y1) || ((x-1)==x1 && (y+1)==y1) || ((x)==x1 && (y+1)==y1) || ((x+1)==x1 && (y+1)==y1);
    }

    @Override
    public String icon() {
        return "";
    }
    
}
