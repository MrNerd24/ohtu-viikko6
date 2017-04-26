/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author juuso_j0pbwen
 */
public class HasFewerThan implements Matcher {

    private Matcher matcher;
    private Matcher inheritedmatcher;

    public HasFewerThan(int value, String category) {
        matcher = new Not(new HasAtLeast(value, category));
    }

    public HasFewerThan(Matcher inheritedmatcher, int i, String category) {
        this(i, category);
        this.inheritedmatcher = inheritedmatcher;
    }

    @Override
    public boolean matches(Player p) {
        if (inheritedmatcher != null) {
            return inheritedmatcher.matches(p) && matcher.matches(p);
        } else {
            return matcher.matches(p);
        }
    }

}
