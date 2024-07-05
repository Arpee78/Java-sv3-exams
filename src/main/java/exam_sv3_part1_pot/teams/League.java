package exam_sv3_part1_pot.teams;

import java.util.ArrayList;
import java.util.List;

public class League {

    private List<Team> teams;

    public League(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Team findTeamWithPlayer(String name) {
        for (Team team : teams) {
            if (team.isPlayerWithNameInTeam(name)){
                return team;
            }
        }
        return null;
    }
}
