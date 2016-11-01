package dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Player {
    public String name;
    public String email;
    
    public ArrayList<Tournament> tournaments;
    public ArrayList<League> leagues;

    public Player(String name, String email) {
        this.name = name;
        this.email = email;
        this.leagues = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(ArrayList<League> leagues) {
        this.leagues = leagues;
    }
    
    public void deletePlayer(){
        this.email = null;
        this.leagues = null;
        this.name = null;
        this.tournaments = null;
    }
}
