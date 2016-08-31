/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Fichas;

/**
 *
 * @author Owen Figueroa
 */
public class Elefante extends Ficha{
    
    public Elefante(int turno) {
        super(turno);
    }

    @Override
    public boolean validarMove(int x, int y, int x1, int y1) {
        return ((x-2)==x1 && (y-2)==y1)  || ((x+2)==x1 && (y-2)==y1) || ((x-2)==x1 && (y+2)==y1) || ((x+2)==x1 && (y+2)==y1);
    }

    @Override
    public String icon() {
        return "";
    }
}
