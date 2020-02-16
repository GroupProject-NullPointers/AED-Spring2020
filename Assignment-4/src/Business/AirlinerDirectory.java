/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Airliner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AEDSpring2019
 */
public class AirlinerDirectory {
    
    private List<User> airlinerList;
    
    public AirlinerDirectory(){
        airlinerList = new ArrayList<>();
    }

    public List<User> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(List<User> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
    
}
