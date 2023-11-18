package pixelbattle.classes;

public class Warrior extends Character {
    
    private int strengthPoints;
    private int speedPoints;

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getSpeedPoints() {
        return speedPoints;
    }

    public void setSpeedPoints(int speedPoints) {
        this.speedPoints = speedPoints;
    }

    @Override
    public String toString() {
        return "Warrior{" + "name=" + this.getName() + ", healthPoints=" + this.getHealthPoints()
                + ", attackPoints=" + this.getAttackPoints() + ", defensePoints="
                + this.getDefensePoints() + ", strengthPoints=" + strengthPoints + ", speedPoints=" + speedPoints 
                + ", item=" + this.getItem().getDescription() + "}";
    }
     
}
