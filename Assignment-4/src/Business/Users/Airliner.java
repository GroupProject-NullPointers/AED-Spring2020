/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.FlightDirectory;

/**
 *
 * @author AEDSpring2019
 */
public class Airliner extends User implements Comparable<Airliner>{
    
    private FlightDirectory directory;
    User u;
    public Airliner(String password, String userName) {
        super(password, userName, "SUPPLIER");
        directory = new FlightDirectory();
       
    }

    public FlightDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(FlightDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Airliner o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}