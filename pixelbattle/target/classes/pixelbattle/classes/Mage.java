package pixelbattle.classes;

import pixelbattle.interfaces.Combatant;

public class Mage extends Character implements Combatant {
    
    private int knowledgePoints;
    private int regenerationPoints;

    public int getKnowledgePoints() {
        return knowledgePoints;
    }

    public void setKnowledgePoints(int knowledgePoints) {
        this.knowledgePoints = knowledgePoints;
    }

    public int getRegenerationPoints() {
        return regenerationPoints;
    }

    public void setRegenerationPoints(int regenerationPoints) {
        this.regenerationPoints = regenerationPoints;
    }

    @Override
    public String toString() {
        return "Mage{" + "name=" + this.getName() + ", healthPoints=" + this.getHealthPoints()
                + ", attackPoints=" + this.getAttackPoints() + ", defensePoints="
                + this.getDefensePoints() + ", knowledgePoints=" + knowledgePoints + ", regenerationPoints=" + regenerationPoints + "}";
    }
}
