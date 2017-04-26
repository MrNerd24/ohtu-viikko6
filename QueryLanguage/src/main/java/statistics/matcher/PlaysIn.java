
package statistics.matcher;

import statistics.Player;

public class PlaysIn implements Matcher {
    private Matcher matcher;
    private String team;

    public PlaysIn(String team) {
        this.team = team;
    }        

    public PlaysIn(Matcher matcher, String team) {
        this(team);
        this.matcher = matcher;
    }
    
    @Override
    public boolean matches(Player p) {
        return p.getTeam().contains(team);
    }
    
}
