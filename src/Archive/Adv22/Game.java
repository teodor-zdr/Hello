package Archive.Adv22;

public class Game {

    public static void main(String args[]) {
        Player jon = new Player(10, 0, 250);
        Boss boss = new Boss(13);

        jon.playerTurn();
        boss.updateBoss();
        jon.castMagicMistle();
        System.out.println();

        boss.bossTurn();
        jon.updatePlayer();
        boss.updateBoss();
        boss.hit();
        jon.playerIsHit();
        System.out.println();

        jon.playerTurn();


    }


}
