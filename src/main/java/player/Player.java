package player;

public class Player {

    private Dice dice;
    private int minNumbreToWin;

    public Player(Dice dice, int minNumbreToWin) {
        this.minNumbreToWin = minNumbreToWin;
        this.dice = dice;
    }

    public boolean play(){

        int diceNumber = dice.roll();

        return  diceNumber > minNumbreToWin;
    }
}
