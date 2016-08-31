/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Chaturanga;

import java.util.Calendar;

/**
 *
 * @author Owen Figueroa
 */
public class Users {
    String user, pass;
    int puntos;
    Calendar fecha;
    boolean activo;
    
    public Users(String u, String p){
        user = u;
        pass = p;
        puntos = 0;
        fecha = Calendar.getInstance();
        activo = true;
    }
    
    public String getUser(){
        return user;
    }
    
    public int getPoints(){
        return puntos;
    }
    
    public long getFecha(){
        return fecha.getTimeInMillis();
    }
    
    public boolean getActivo(){
        return activo;
    }

    @Override
    public String toString() {
        return getUser()+"-" + getPoints()+"-" + getFecha();
    }
}
