/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Chaturanga;

/**
 *
 * @author Owen Figueroa
 */
public interface Savable {
    Users search(String user);
    boolean login(String user, String pass);
    boolean saveUser(String user, String pass);
    boolean changePass(String user, String pass, String pass2);
}
