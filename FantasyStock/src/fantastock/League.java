/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantastock;

import java.util.Date;

/**
 *
 * @author Josh
 */
public class League {
    
    String username;
    String password;
    int goalValue;
    Date start;
    Date end;
    String name;

    public League(String username, String password, int goalValue, Date start, Date end) {
        this.username = username;
        this.password = password;
        this.goalValue = goalValue;
        this.start = start;
        this.end = end;
    }
    
    public String toString()
    {
        return username;
    }
    
    
}
