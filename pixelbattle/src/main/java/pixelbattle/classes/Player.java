package pixelbattle.classes;

import java.sql.Date;

abstract class Player {

    private String name;
    private int points;
    private Date datetime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + this.getName() + ", points=" + this.points
                + ", datetime=" + this.datetime + "}";
    }
}
