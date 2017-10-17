package Archive.Adv22;

public class Boss {
    private int hitpoints;

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void bossTurn(){
        System.out.println("-- Boss turn --");
    }

    public Boss(int hitpoints){
        this.hitpoints=hitpoints;
    }

    public void updateBoss(){
        System.out.println("- Boss has " + getHitpoints() + " hitpoints");
        setHitpoints(hitpoints-4);
    }

    public void hit() {
        System.out.println("Boss attacks for 8 damage.");

    }
}
