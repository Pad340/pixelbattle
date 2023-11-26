package pixelbattle.interfaces;

public interface Item {
    
    void equipItem(Character name, int itemId);
    
    void updateCharacterStats(int characterId, int healthPoints, int modifiedAttack, int modifiedDefense);
    
}
