/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantastock;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Josh
 */
public class LeagueHandler {
   private ArrayList<String> leagues = new ArrayList<>(); 
   
   public void addLeague(League league)
{
    leagues.add(league.toString());
}
   
public ArrayList getLeagues()
{
    return leagues;
}
   
}


