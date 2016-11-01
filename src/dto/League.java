package dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Estudiante
 */
public class League {
    public Calendar start;
    public Calendar end;
    
    public ArrayList<Tournament> tournaments;
    public ArrayList<Player> players;

    public League(Calendar start, Calendar end) {
        this.start = start;
        this.end = end;
        this.tournaments = new ArrayList<>();
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

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    
    
    public void deleteLeague(){
        this.end = null;
        this.players = null;
        this.start = null;
        this.tournaments = null;
    }
}
