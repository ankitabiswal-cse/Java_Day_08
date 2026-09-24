class Game{
    String gameCharacter;
    int gameLevel;
    int gameScore;

    Game(String character,int level,int score){
        gameCharacter = character;
        gameLevel = level;
        gameScore = score;
    }
    void display(){
        System.out.println("Game Character :"+gameCharacter);
        System.out.println("Game Level :"+gameLevel);
        System.out.println("Game Score :"+gameScore);
    }
}
public class GameCharacter {
    public static void main(String[] args){
        Game g1 = new Game("Hero",4,789000);
        Game g2 = new Game("Villian",2,650000);

        g1.display();
        g2.display();
    }
}
