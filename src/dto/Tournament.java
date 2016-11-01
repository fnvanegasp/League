package dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author Estudiante
 */
public class Tournament {
    public Calendar start;
    public Calendar end;
    
    public ArrayList<Player> players;

    public Tournament(Calendar start, Calendar end) {
        this.start = start;
        this.end = end;
        this.players = new ArrayList<>();
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

 
    
    public void deleteTournament(){
        this.end = null;
        this.players = null;
        this.start = null;
    }
}
