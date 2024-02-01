public class player {
    String name;
    int playerGuess;
    player(String playerName){
        name = playerName;
    }
    void makeGuess(){
        playerGuess = (int)(Math.random()*10);
    }

}
