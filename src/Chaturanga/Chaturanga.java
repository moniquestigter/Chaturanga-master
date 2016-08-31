/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Chaturanga;

import java.util.ArrayList;


public class Chaturanga implements Savable{
    ArrayList<Users> users = new ArrayList<>();
    
    @Override
    public Users search(String user) {
        for(int i=0; i<users.size(); i++)
            if(users.get(i).user.equals(user))
                return users.get(i);        
        return null;
    }

    @Override
    public boolean login(String user, String pass) {
        Users u=search(user);
        if(u!=null)
            if(u.pass.equals(pass))
                return true;
        return false;
    }

    @Override
    public boolean saveUser(String user, String pass) {
        if(search(user)==null && pass.length()==5){
            users.add(new Users(user, pass));
            return true;
        }
        return false;
    }

    @Override
    public boolean changePass(String user, String pass, String pass2) {
        Users u=search(user);
        if(u!=null){
            if(u.pass.equals(pass) && pass2.length()==5){
                u.pass=pass2;
                return true;
            }
        }
        return false;
    }
}
