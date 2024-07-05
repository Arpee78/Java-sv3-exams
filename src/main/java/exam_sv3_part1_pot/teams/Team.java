package exam_sv3_part1_pot.teams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Team {

    private String teamName;
    private List<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean addPlayer(Player player) {
        if (players.size() < 18) {
            players.add(player);
            return true;
        }
        return false;
    }

    public int countBirthBefore(LocalDate date) {
        int count = 0;
        for (Player player : players) {
            if (player.getDateOfBirth().isBefore(date)){
                count++;
            }
        }
        return count;
    }

    public boolean isPlayerWithNameInTeam(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

}
