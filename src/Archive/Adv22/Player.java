package Archive.Adv22;

public class Player {
    private int hitpoints;
    private int mana;
    private int armor;

    /**
     * -- Player turn --
     * - Player has 10 hit points, 0 armor, 250 mana
     * - Boss has 13 hit points
     * Player casts Poison.
     *
     * @return
     */

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Player(int hitpoints, int armor, int mana) {
        this.hitpoints = hitpoints;
        this.armor = armor;
        this.mana = mana;
    }

    public void playerTurn() {
        System.out.println("-- Player turn --");
        System.out.println("- Player has " + getHitpoints() + " hit points, " + getArmor() + " armor, " + getMana() + " mana");
        //System.out.println();
    }

    public void castMagicMistle() {
        //Magic Missile costs 53 mana. It instantly does 4 damage.
        System.out.println("- Player cast Magic Mistle");
        //this.mana = mana - 53;
        setMana(mana - 53);
    }

    public void castMagicPoison() {
        //Poison costs 173 mana. It starts an effect that lasts for 6 turns. At the start of each
        // turn while it is active, it deals the boss 3 damage.
        System.out.println("- Player cast Poison");
        setMana(mana - 173);
    }

    public void updatePlayer() {
        System.out.println("- Player has " + getHitpoints() + " hit points, " + getArmor() + " armor, " + getMana() + " mana");
    }

    public void playerIsHit(){
        setHitpoints(hitpoints-8);
    }


}
