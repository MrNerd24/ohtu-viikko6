/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

/**
 *
 * @author juuso_j0pbwen
 */
public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder playsIn(String team) {
        this.matcher = new PlaysIn(matcher, team);
        return this;
    }

    public QueryBuilder hasAtLeast(int i, String category) {
        this.matcher = new HasAtLeast(matcher, i, category);
        return this;
    }

    public QueryBuilder hasFewerThan(int i, String category) {
        this.matcher = new HasFewerThan(matcher, i, category);
        return this;
    }

    public Matcher build() {
        return matcher;
    }

    public QueryBuilder oneOf(Matcher... matcher) {

        this.matcher = new Or(this.matcher, new Or(matcher));
        return this;
    }

    public QueryBuilder all(Matcher... matcher) {
        this.matcher = new And(this.matcher, new And(matcher));
        return this;
    }

    public QueryBuilder Not(Matcher mat) {
        this.matcher = new And(this.matcher, new Not(mat));
        return this;
    }

}
