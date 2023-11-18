package pixelbattle.classes;

public class Item {
    private String description;
    private String character;
    private String type;
    private int price;
    private int bonusAttack;
    private int bonusDefense;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBonusAttack() {
        return bonusAttack;
    }

    public void setBonusAttack(int bonusAttack) {
        this.bonusAttack = bonusAttack;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }
    
    @Override
    public String toString() {
        return "Item{" + "description=" + this.description + ", character=" + this.character
                + ", type=" + this.type + ", price=" + this.price
                + ", bonusAttack=" + this.bonusAttack + ", bonusDefense=" + this.bonusDefense + "}";
    }
    
}
