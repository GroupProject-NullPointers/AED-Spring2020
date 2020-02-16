/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.AirlinerDirectory;
import Business.CustomerDirectory;

/**
 *
 * @author AEDSpring2019
 */
public class Admin extends User {
    
    public AirlinerDirectory airDir;
    public CustomerDirectory custDir;
    
    public Admin() {
        super("", "", "Admin");
        airDir = new AirlinerDirectory();
        custDir = new CustomerDirectory();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
