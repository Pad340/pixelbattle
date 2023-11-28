package pixelbattle.interfaces;

public interface Combatant {
    
    String getName();

    int getHealthPoints();

    int getAttackPoints();

    int getDefensePoints();

    void setHealthPoints(int healthPoints);
}
