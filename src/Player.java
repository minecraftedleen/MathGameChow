public class Player {

    private String name;
    private int score;
    private int winStreak;
    private int highScore = 0;


    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }
    public int getWinstreak() {return winStreak;}
    public int getHighScore() {return highScore;}

    public String getName() {
        return name;
    }

    public void incrementScore() {
        score++;
    }
    public void incrementWinStreak() {winStreak++;}
    public void resetWinStreak() {winStreak = 0;}
    public void setHighScore() {
        if (score > highScore) {
            highScore = score;
        }
    }

    public void reset() {
        score = 0;
    }
}